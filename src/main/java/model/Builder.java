package model;

import javafx.scene.paint.Color;

public interface Builder {
    public void lineRectangle(int width, int height, Color color);
    public void line(int radix, double CenterX);


    public Indicator Build();
}
