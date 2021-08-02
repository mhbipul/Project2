package LAB4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginFxmlMain extends Application {
    public static Stage pStage;
    @Override
    public void start(Stage primaryStage) throws Exception {
        pStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        primaryStage.setScene(new Scene(root,800,700));
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }


}
