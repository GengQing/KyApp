package pers.geng.qing.ky;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Button btn;


    @FXML
    private TextField showText;

    public void sendOK() {
        showText.setText("hello world");
    }
}
