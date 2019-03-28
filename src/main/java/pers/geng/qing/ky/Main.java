package pers.geng.qing.ky;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.net.URL;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        URL resource = getClass().getResource("/kyApp.fxml");
        GridPane pane = FXMLLoader.load(resource);

        primaryStage.setTitle("Diligence");
        primaryStage.setScene(new Scene(pane, 600, 400));

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
