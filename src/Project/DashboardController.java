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
        Parent parent2 = FXMLLoader.load(getClass().getResource("B1Login.fxml"));
        Scene scene3 = new Scene(parent2);

        Stage window2 = (Stage)((Node)event.getSource()).getScene().getWindow();
        window2.setScene(scene3);
        window2.show();

    }
    @FXML
    void changeScene3(ActionEvent event) throws IOException {
        Parent parent3 = FXMLLoader.load(getClass().getResource("B2Login.fxml"));
        Scene scene4 = new Scene(parent3);

        Stage window3 = (Stage)((Node)event.getSource()).getScene().getWindow();
        window3.setScene(scene4);
        window3.show();

    }

}

