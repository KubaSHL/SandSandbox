package com.example.sandboxsimulator;

import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;

import java.io.Console;


public class NodeController {

    public NodeController(double sceneWidth, double sceneHeight, int rows, int cols) {
        this.sceneWidth = sceneWidth;
        this.sceneHeight = sceneHeight;
        this.rows = rows;
        this.cols = cols;
    }

    private double sceneWidth;
    private double sceneHeight;

    private int rows;
    private int cols;

    double gridWidth = sceneWidth / rows;
    double gridHeight = sceneHeight / cols;

    @FXML
    Scene GetNodeScene(){

        Group group = new Group();
        MyNode[][] myNode = new MyNode[rows][cols];

        for( int i = 0; i < rows; i++){
            for( int j = 0; j < cols; j++){
                MyNode node = new MyNode("",i * gridWidth, j * gridHeight, gridWidth, gridHeight,j+i);
                group.getChildren().add(node);
                myNode[i][j] = node;
                System.out.print(i+""+j+"|");
            }
            System.out.print("\n");
        }

        return new Scene(group);
    }
}
