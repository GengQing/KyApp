package pers.geng.qing.ky;

import com.proudapes.jlatexmathfx.Control.LateXMathControl;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Created by Geng Qing on 2019-03-26
 **/
public class Mathjax extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        String latex = "\\sin x";
        LateXMathControl lc = new LateXMathControl(latex);

        StackPane pane = new StackPane();
        pane.getChildren().add(lc);

        Scene scene = new Scene(pane, 400, 300);
        primaryStage.setScene(scene);
//        primaryStage.setWidth(800);
//        primaryStage.setHeight(600);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
