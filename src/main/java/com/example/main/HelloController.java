package com.example.main;
import model.Director;
import model.Indicator;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class HelloController {
    private final Imt_class bmi = new Imt_class();
    public TextField mass;
    public TextField rost;
    public Button btnRes;
    public Label msg;
    public Indicator indicator;
    public boolean indicatorOk = false;
    public HBox panel;
    public void BMI(ActionEvent actionEvent) {
        if (indicatorOk) indicator.remove(panel);
        indicatorOk = true;
        Director director = new Director();
        bmi.setMass_p(mass.getText());
        bmi.setRost_p(rost.getText());
        Color color;
        if (bmi.getImt() < 16) color = Color.RED;
        else if (bmi.getImt() < 25) color = Color.GREEN;
        else color = Color.RED;
        indicator = new Indicator();
        int flag = (int)bmi.getImt()*3;
        if (flag > 150){
            flag = 138;
        }

        indicator = director.Constr(color, flag);
        indicator.show(panel);
        msg.setText(bmi.toString());
    }
}