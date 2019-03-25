package pers.geng.qing.ky;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Label label;



    public void sendOK() {

        label.setText("你改变了状态");

    }
}
