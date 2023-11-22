package at.pat.basic.oop;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private Engine engine;
    private List<RearMirror> mirrors;
    private int fuelConsumption;
    private int fuelAmount;
    private String brand;
    private String serialNumber;
    private String color;
    public Car(Engine enginge, int fuelConsumption, String brand, String serialNumber){
        this.fuelConsumption = fuelConsumption;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.engine = engine;
        this.mirrors = new ArrayList<>();
    }

    public void addMirror(RearMirror rearMirror){
        this.mirrors.add(rearMirror);
    }

    public List<RearMirror> getMirrors() {
        return mirrors;
    }

    public void honk(){
        System.out.println("Ich bin ein " + this.brand + " und habe die farbe" + this.color + " und habe " + this.getEngine().getHorsePower() + "ps");
    }
    public void drive(){
        this.fuelAmount = this.fuelAmount - this.fuelConsumption;
        System.out.println("I am driving!");
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
