package ASSIGNMENT;

import java.util.Random;
import java.util.Scanner;


class Utils {
    static Random random = new Random();

    static void sleedRandomMS(int upper_bound) {
        try {
            Thread.sleep(random.nextInt(100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Restaurant {
    int nOrders = 0;

    int MAX_ORDERS;
    int MIN_ORDERS;


    Restaurant(int MAX_ORDERS, int MIN_ORDERS) {
        this.MAX_ORDERS = MAX_ORDERS;
        this.MIN_ORDERS = MIN_ORDERS;
    }

    synchronized void put_order(String name) {
        if(nOrders == MAX_ORDERS){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        ++nOrders;

        notify();

        System.out.println(name + "-> " + "placed a new order, #Total-Pending-Orders: " + nOrders);
    }

    synchronized int cook_order(String name) {
        if(nOrders == 0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        --nOrders;
        notify();
        System.out.println(name + "-> " + "cooked for an order, #Total-Pending-Orders: " + nOrders);
        return  nOrders;
    }
}


class Cook extends Thread {
    String name;
    Restaurant restaurant;

    Cook(String name, Restaurant restaurant) {
        super(name);
        this.name = name;
        this.restaurant = restaurant;
        start();
    }

    @Override
    public void run() {
        while (true) {

            restaurant.cook_order(name);
            Utils.sleedRandomMS(80);
        }
    }
}


class DeliveryMan extends Thread {
    String name;
    Restaurant restaurant;

    DeliveryMan(String name, Restaurant restaurant) {
        super(name);
        this.name = name;
        this.restaurant = restaurant;
        start();
    }

    @Override
    public void run() {
        while (true) {
            restaurant.put_order(name);
            Utils.sleedRandomMS(100);
        }
    }
}


class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Max #Orders Placeable: ");
        int max_no_placed_orders = scanner.nextInt(); // 100

        System.out.println("Enter Min #Placed Orders to start Cooking: ");
        int min_no_placed_orders_to_cook = scanner.nextInt(); // 10

        Restaurant restaurant = new Restaurant(max_no_placed_orders, min_no_placed_orders_to_cook);
        new Cook("Cook.1", restaurant);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new DeliveryMan("Del. Man.1", restaurant);
        new DeliveryMan("Del. Man.2", restaurant);
    }
}
