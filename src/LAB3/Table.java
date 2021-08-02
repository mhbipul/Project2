package LAB3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Table extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.show();
        primaryStage.setTitle("JavaFX App");
        VBox hbox = new VBox();
        HBox h1 = new HBox();
        hbox.getChildren().add(h1);
        h1.setSpacing(10);

        HBox h2 = new HBox();
        hbox.getChildren().add(h2);
        h2.setSpacing(10);

        Button b1 = new Button("Proceed");
        Button b2 = new Button("Back");
        Button b3 = new Button("Confirm");

        Scene scene = new Scene(hbox,800,700);
        primaryStage.setScene(scene);

        Text product1 = new Text("Rice");
        Text quantity = new Text("2");
        Text price = new Text("70");
        Text tPrice = new Text("140");

        Text product2 = new Text("Chicken");
        Text quantity2 = new Text("2");
        Text price2 = new Text("70");
        Text tPrice2 = new Text("140");


        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Text newText =new Text("Enter mobile no.");
                TextField tf = new TextField();

                VBox hb = new VBox();
                HBox bx = new HBox();

                hb.setMaxSize(100,100);
                Scene nextScene = new Scene(hb,500,500);
                Stage newStage = new Stage();
                newStage.setScene(nextScene);
                newStage.show();

                Scene nextScene2 = new Scene(hb,500,500);
                Stage newStage2 = new Stage();
                newStage2.setScene(nextScene);
                newStage2.show();



                hb.getChildren().add(bx);
                hb.getChildren().add(newText);
                hb.getChildren().add(tf);
                bx.getChildren().add(b2);
                bx.getChildren().add(b3);

                b2.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        primaryStage.show();
                        newStage.close();

                    }
                });
                b3.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                       





                    }
                });

            }
        });





        h1.getChildren().add(product1);
        h1.getChildren().add(quantity);
        h1.getChildren().add(price);
        h1.getChildren().add(tPrice);
        h2.getChildren().add(product2);
        h2.getChildren().add(quantity2);
        h2.getChildren().add(price2);
        h2.getChildren().add(tPrice2);
        hbox.getChildren().add(b1);


    }
}
