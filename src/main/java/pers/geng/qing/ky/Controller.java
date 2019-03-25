package pers.geng.qing.ky;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Label label;

    @FXML
    public void showKnowledge(Event event) {

        label.setText("你改变了状态");

    }
}
