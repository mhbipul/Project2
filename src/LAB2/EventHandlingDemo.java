package LAB2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class EventHandlingDemo extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Text uid = new Text("UserID:");
        TextField uid_in = new TextField();
        Text pass = new Text("Password:");
        PasswordField pass_in = new PasswordField();
        Button submit = new Button("Submit");
        Text output = new Text("----");


        submit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                if (uid_in.getText().equals("")) return;

                System.out.println("uid: " + uid_in.getText());
                System.out.println("pass: " + pass_in.getText());
                output.setText("uid: " + uid_in.getText() + "," + "pass: " + pass_in.getText());

                Text newText = new Text(
                        "uid: " + uid_in.getText() + "," + "pass: " + pass_in.getText());
                newText.setFont(Font.font(100));

                Scene nextScene = new Scene(
                        new HBox(
                                newText),
                        200, 200
                );

                Stage stage1 = new Stage();
                stage1.setScene(nextScene);
                stage1.show();
            }
        });


        VBox hBox = new VBox();

        hBox.getChildren().add(uid);
        hBox.getChildren().add(uid_in);
        hBox.getChildren().add(pass);
        hBox.getChildren().add(pass_in);
        hBox.getChildren().add(submit);
        hBox.getChildren().add(output);

        Scene scene = new Scene(hBox, 800, 600);
        stage.setScene(scene);
        stage.setTitle("My JavaFX App");
        stage.show();
    }
}
