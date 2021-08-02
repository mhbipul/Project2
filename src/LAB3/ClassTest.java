package LAB3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.*;

public class ClassTest extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Stage mainStage = new Stage();
        mainStage.setTitle("CT-1");
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(8);
        grid.setHgap(10);
        Scene scene = new Scene(grid, 800, 500);

        Text item = new Text("Item");
        GridPane.setConstraints(item, 0, 0);
        Text quantity = new Text("Quantity");
        GridPane.setConstraints(quantity, 1, 0);
        Text price = new Text("Unit Price");
        GridPane.setConstraints(price, 2, 0);
        Text TPrice = new Text("Total Price");
        GridPane.setConstraints(TPrice, 3, 0);

        Text rice = new Text("Rice");
        GridPane.setConstraints(rice, 0, 1);
        Text riceQ = new Text("2");
        GridPane.setConstraints(riceQ, 1, 1);
        Text riceP = new Text("70");
        GridPane.setConstraints(riceP, 2,1);
        Text riceTP = new Text("140");
        GridPane.setConstraints(riceTP, 3, 1);

        Text chicken = new Text("Chicken");
        GridPane.setConstraints(chicken, 0, 2);
        Text chickenQ = new Text("1");
        GridPane.setConstraints(chickenQ, 1, 2);
        Text chickenP = new Text("200");
        GridPane.setConstraints(chickenP, 2,2);
        Text chickenTP = new Text("200");
        GridPane.setConstraints(chickenTP, 3, 2);

        Text sauce = new Text("sauce");
        GridPane.setConstraints(sauce, 0, 3);
        Text sauceQ = new Text("1");
        GridPane.setConstraints(sauceQ, 1, 3);
        Text sauceP = new Text("110");
        GridPane.setConstraints(sauceP, 2,3);
        Text sauceTP = new Text("110");
        GridPane.setConstraints(sauceTP, 3, 3);

        Text total = new Text("Total: 450");
        GridPane.setConstraints(total,2,4);
        Button btn = new Button("Proceed");
        GridPane.setConstraints(btn,2,5);

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                VBox vb = new VBox();
                Text number = new Text("Enter Mobile Number");
                TextField numberField = new TextField();
                numberField.setMaxWidth(150);
                Button back = new Button("Back");
                Button confirm = new Button("Cancel");

                vb.getChildren().add(number);
                vb.getChildren().add(numberField);
                vb.getChildren().add(back);
                vb.getChildren().add(confirm);
                Scene newScene = new Scene(vb, 800, 500);
                mainStage.setScene(newScene);

                back.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        btn.setVisible(false);
                        mainStage.setScene(scene);
                        Text backText = new Text("Order has been placed");
//                        backText.setFont();
                        //  backText.setFill(Color.green);
                        GridPane.setConstraints(backText,2,5);
                        grid.getChildren().add(backText);
                    }
                });
                confirm.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        btn.setVisible(false);
                        mainStage.setScene(scene);
                        Text backText2 = new Text("Order Canceled");
                        GridPane.setConstraints(backText2,2,5);
                        grid.getChildren().add(backText2);
                    }
                });
            }
        });





        grid.getChildren().addAll(item,quantity,price,TPrice,rice,riceQ,riceP,riceTP,chicken, chickenQ, chickenP,chickenTP, sauce,sauceQ,sauceP,sauceTP,total,btn);

        mainStage.setScene(scene);
        mainStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
