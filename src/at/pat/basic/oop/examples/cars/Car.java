package at.pat.basic.oop.examples.cars;

import at.pat.basic.oop.Fernbedienung.Battery;

import java.util.ArrayList;

public class Car {
    private String color;
    private int maxSpeed;
    private int basePrice;
    private float baseUsage;
    private Engine engine;
    private int distanceDriven;

    //constructor
    public Car(String color, int maxSpeed, int basePrice, int baseUsage, Engine engine, int distanceDriven) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.basePrice = basePrice;
        this.baseUsage = baseUsage;
        this.engine = engine;
        this.distanceDriven = distanceDriven;
    }

    //code


    //getterandsetter

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public float getBaseUsage() {
        return baseUsage;
    }

    public void setBaseUsage(int baseUsage) {
        this.baseUsage = baseUsage;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }


    public int getDistanceDriven() {
        return distanceDriven;
    }

    public void setDistanceDriven(int distanceDriven) {
        this.distanceDriven = distanceDriven;
    }
}
