package com.example.isdlab1;

public class Aircraft {
    private String name;
    private double wingspan;
    private int speed;
    private double ceiling;

    public Aircraft(String name, double wingspan, int speed, double ceiling) {
        this.name = name;
        this.wingspan = wingspan;
        this.speed = speed;
        this.ceiling = ceiling;
    }

    public Aircraft() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getCeiling() {
        return ceiling;
    }

    public void setCeiling(double ceiling) {
        this.ceiling = ceiling;
    }
}
