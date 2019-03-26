package pers.geng.qing.ky;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Created by Geng Qing on 2019-03-25
 **/
public class Hello extends Application {


    @Override
    public void start(Stage stage) throws Exception {
        StackPane stackPane = new StackPane();
        MathFormulaCanvas canvas = new MathFormulaCanvas();
        stackPane.getChildren().add(canvas);
        // Bind canvas size to stack pane size.
        canvas.widthProperty().bind(stackPane.widthProperty());
        canvas.heightProperty().bind(stackPane.heightProperty());
        stage.setScene(new Scene(stackPane));
        stage.setTitle("FXGraphics2DDemo3.java");
        stage.setWidth(100);
        stage.setHeight(278);
        stage.show();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
