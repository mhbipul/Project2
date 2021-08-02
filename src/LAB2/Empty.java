package LAB2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;



public class Empty extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Text text = new Text("Name");
        Button btn = new Button("Submit");

        VBox hBox = new VBox();

        hBox.getChildren().add(text);
        hBox.getChildren().add(btn);

        Scene scene = new Scene(hBox, 800, 600);
        stage.setScene(scene);
        stage.setTitle("My JavaFX App");
        stage.show();
    }
}
