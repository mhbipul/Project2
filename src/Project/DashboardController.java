package Project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class DashboardController {

    @FXML
    private Label product;

    @FXML
    private Label home;

    @FXML
    private Label back;

    @FXML
    private Label about_us;

    @FXML
    private Label log_out;

    @FXML
    private Button logInB1;

    @FXML
    private Button logInB2;

    @FXML
    void changeScene2(ActionEvent event) throws IOException {


        FXMLScene fxmlScene = FXMLScene.load("B2Login.fxml");
        Parent parent = fxmlScene.root;
        B2LoginController controller = (B2LoginController) fxmlScene.controller;
        Scene scene = new Scene(parent);
        LoginFxml.mainStage.setScene(scene);

    }


}

