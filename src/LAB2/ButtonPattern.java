package LAB2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class ButtonPattern extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Button[] btns1 = new Button[4];

        for (int i = 0; i < btns1.length; i++) {
            btns1[i] = new Button();
            btns1[i].setText("B");
            btns1[i].setMinHeight(100);
            btns1[i].setMinWidth(100);
        }

        Button[] btns2 = new Button[3];

        for (int i = 0; i < btns2.length; i++) {
            btns2[i] = new Button();
            btns2[i].setText("B");
            btns2[i].setMinHeight(100);
            btns2[i].setMinWidth(100);
        }

        HBox hBox1 = new HBox(); // 4
        hBox1.getChildren().addAll(btns1);

        VBox hBox2 = new VBox(); //3
        hBox2.getChildren().addAll(btns2);

        VBox parent = new VBox();
        parent.getChildren().add(hBox1);
        parent.getChildren().add(hBox2);

        Scene scene = new Scene(parent, 800, 600);
        stage.setScene(scene);
        stage.setTitle("My JavaFX App");
        stage.show();
    }
}
