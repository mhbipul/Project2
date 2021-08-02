package LAB4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Controller {

    @FXML
    private Button btn_submit;

    @FXML
    private TextField tf_userID;

    @FXML
    void onClick_submit(ActionEvent event) throws IOException {
        FXMLScene fxmlScene = FXMLScene.load("Welcome.fxml");
        Parent root =fxmlScene.root;
        WelcomeController controller = (WelcomeController)fxmlScene.controller;
        controller.setTxt_userid_value(tf_userID.getText());
//        Parent root = FXMLLoader.load(getClass().getResource("Welcome.fxml"));
        Scene scene = new Scene(root,600,700);
        LoginFxmlMain.pStage.setScene(scene);

    }

}
