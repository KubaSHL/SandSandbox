package com.example.sandboxsimulator;

import javafx.scene.Scene;
import javafx.scene.control.Cell;
import javafx.scene.control.TableView;

public class UseTableView {
    private TableView<int[][]> tableView = new TableView<>();
    private int[][] cellData;

    Scene getTableViewScene(int rows, int cols){
        cellData = new int[rows][cols];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){

            }
        }
        return  new Scene(tableView);
    }


}
