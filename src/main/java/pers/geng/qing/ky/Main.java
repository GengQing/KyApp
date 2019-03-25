package pers.geng.qing.ky;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import lombok.val;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        val resource = getClass().getResource("/kyApp.fxml");
        GridPane pane = FXMLLoader.load(resource);
//        MathFormulaCanvas canvas = new MathFormulaCanvas();
//        canvas.setId("canvas");

        StackPane stackPane = new StackPane();
        MathFormulaCanvas canvas = new MathFormulaCanvas();
        stackPane.getChildren().add(canvas);
        // Bind canvas size to stack pane size.
        canvas.widthProperty().bind(stackPane.widthProperty());
        canvas.heightProperty().bind(stackPane.heightProperty());

        GridPane.setValignment(stackPane, VPos.CENTER);
        GridPane.setHalignment(stackPane, HPos.CENTER);

        pane.addRow(1, stackPane);
        System.out.println("the size " + pane.getRowConstraints().size());
//        GridPane.setHgrow(canvas, Priority.ALWAYS);
//        GridPane.setVgrow(canvas, Priority.ALWAYS);

//        GridPane.setValignment(canvas, VPos.CENTER);
//        canvas.widthProperty().bind(pane.widthProperty());
        canvas.heightProperty().bind(pane.heightProperty());


        canvas.draw();
        primaryStage.setTitle("Diligence");


        primaryStage.setScene(new Scene(pane, 600, 400));

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
