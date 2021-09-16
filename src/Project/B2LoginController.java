package Project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class B2LoginController {

    @FXML
    private Label b1Name;

    @FXML
    private Label b1Pass;

    @FXML
    private TextField b1Tf;

    @FXML
    private PasswordField b1Pf;

    @FXML
    private Button b1LoginButton;

    @FXML
    void changeScene4(ActionEvent event) throws IOException {
        Parent parent3 = FXMLLoader.load(getClass().getResource("Product(Branch-1).fxml"));
        Scene scene4 = new Scene(parent3);

        Stage window3 = (Stage)((Node)event.getSource()).getScene().getWindow();
        window3.setScene(scene4);
        window3.show();
    }

}
