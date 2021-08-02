package LAB4;

import javafx.fxml.FXML;
import javafx.scene.text.Text;

class WelcomeController {

    @FXML
    private Text txt_userid;

    public void setTxt_userid_value(String text){
        txt_userid.setText(text);
    }
}
