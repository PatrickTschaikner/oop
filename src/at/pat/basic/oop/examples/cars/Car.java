package at.pat.basic.oop.examples.cars;

import at.pat.basic.oop.Fernbedienung.Battery;

import java.util.ArrayList;

public class Car {
    private String color;
    private int maxSpeed;
    private int basePrice;
    private double baseUsage;
    private Engine engine;
    private double distanceDriven;
    private double realPrice;
    private Producer producer;
    //constructor

    public Car(String color, int maxSpeed, int basePrice, double baseUsage, Engine engine, double distanceDriven) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.basePrice = basePrice;
        this.baseUsage = baseUsage;
        this.engine = engine;
        this.distanceDriven = distanceDriven;
    }

    //code
    //calculate realPrice
    public void calcrealPrice(){
        this.realPrice = (this.producer.getSale()/100) * this.basePrice + this.basePrice;

        System.out.println(realPrice);
    }
    //drive
    public double drive(){
        this.distanceDriven += 10000;
        if(this.distanceDriven > 50000){
            this.baseUsage *= 1.098;
        }
        System.out.println(this.distanceDriven);
        return this.distanceDriven;

    }
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

    public double getBaseUsage() {
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


    public double getDistanceDriven() {
        return distanceDriven;
    }

    public void setDistanceDriven(double distanceDriven) {
        this.distanceDriven = distanceDriven;
    }

    public double getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(double realPrice) {
        this.realPrice = realPrice;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }
}
