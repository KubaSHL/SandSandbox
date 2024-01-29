package com.example.sandboxsimulator;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Mesh;
import javafx.scene.shape.Rectangle;

public class MyNode extends StackPane {

    public MyNode( String name, double x, double y, double w, double h, int color){

        Rectangle rectangle = new Rectangle(w,h);
        rectangle.setFill(color%2==0?Color.WHITE:Color.BLACK);
        rectangle.setStroke(color%2==1?Color.ORANGE:Color.BLUE);
        Label label = new Label( name);

        // set position
        setTranslateX(x);
        setTranslateY(y);

        getChildren().addAll(rectangle, label);
    }

}
