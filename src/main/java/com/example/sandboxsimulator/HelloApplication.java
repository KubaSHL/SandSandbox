package com.example.sandboxsimulator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        CanvasController canvasController = new CanvasController();
        Scene canvasScene = canvasController.createTilePaneGroup(100,100,0);
        NodeController nodeController = new NodeController(1024, 768, 5, 5);
        Scene nodeScene = nodeController.GetNodeScene();
        stage.setTitle("Hello!");
        stage.setScene(nodeScene);

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}


