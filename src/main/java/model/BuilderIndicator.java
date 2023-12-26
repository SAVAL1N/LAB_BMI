package model;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class BuilderIndicator implements Builder {
    Indicator indicator = new Indicator();
    Pane pane = new Pane();

    @Override
    public void lineRectangle(int width, int height, Color color) {
        Rectangle rect = new Rectangle();
        rect.setWidth(width);
        rect.setHeight(height);
        rect.setFill(color);
        rect.setStroke(Color.BLACK);
        pane.getChildren().add(rect);
    }
    @Override
    public void line(int width, double centerX) {
        Rectangle line = new Rectangle();
        line.setWidth(width);
        line.setHeight(50);
        line.setX(centerX - width / 2);
        line.setFill(Color.BLACK);
        pane.getChildren().add(line);
    }

    @Override
    public Indicator Build() {
        indicator.add(pane);
        return indicator;
    }
    public void remove() {
        indicator.remove(pane);
    }
}
