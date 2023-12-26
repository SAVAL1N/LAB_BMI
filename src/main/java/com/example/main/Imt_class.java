package com.example.main;

public class Imt_class {
    private double mass_p;
    private double rost_p;
    public Imt_class(){
        this.mass_p = 0;
        this.rost_p = 0;
    }
    public Imt_class(double massa,double rost){
        this.mass_p = massa;
        this.rost_p = rost;
    }
    public void setMass_p(String mass){
        mass_p = Double.parseDouble(mass);
    }
    public void setRost_p(String rost){
        rost_p = Double.parseDouble(rost);
    }
    public double getImt(){
        return (mass_p/(rost_p*rost_p)*10000);
    }

    public String toString(){
        String message = "";
        if (getImt() < 16) message = "У Вас дефицит массы тела";
        else if (getImt() < 18.5) message = "У Вас дефицит массы тела";
        else if (getImt() < 25) message = "Вы в норме";
        else if (getImt() < 30) message = "У Вас избыточная масса тела";
        else if (getImt() < 35) message = "У Вас Ожирение 1 степени";
        else if (getImt() < 40) message = "У Вас Ожирение 2 степени";
        else message = "У Вас Ожирение 3 степени";
        return "ИМТ " + getImt() + "\n" + message;
    }
}
