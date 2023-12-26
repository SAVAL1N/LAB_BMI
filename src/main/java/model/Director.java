package model;

import javafx.scene.paint.Color;

public class Director {
    BuilderIndicator builder = new BuilderIndicator();
    public Indicator Constr(Color color, double centerX){
        builder.lineRectangle(140, 50, color);
        builder.line(4, centerX);
        return builder.Build();
    }
    public void hidden(){
        builder.remove();
    }
}
