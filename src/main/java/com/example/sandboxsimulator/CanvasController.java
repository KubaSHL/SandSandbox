package com.example.sandboxsimulator;

import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

public class CanvasController {



    @FXML
    Scene createTilePaneGroup(int rows, int cols, int spacing){

        TilePane tilePane = new TilePane(spacing,spacing);
        tilePane.setPrefColumns(cols);

        Group group = new Group();

        for(int i = 1; i < rows; i++){
            for(int j = 1; j < cols; j++){
                Circle point = new Circle(2);
                point.setFill((j+i)%2==0?Color.BLACK:Color.WHITE);
                point.centerXProperty().bind(
                        tilePane.tileWidthProperty().add(tilePane.hgapProperty())
                                .multiply(j)
                                .subtract(tilePane.hgapProperty().divide(2)));
                point.centerYProperty().bind(
                        tilePane.tileHeightProperty().add(tilePane.vgapProperty())
                                .multiply(i)
                                .subtract(tilePane.vgapProperty().divide(2)));
                group.getChildren().add(point);
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                Text text = new Text(String.valueOf(i * rows + j));
                tilePane.getChildren().add(text);
            }
        }


        return new Scene(group);
    }

}
