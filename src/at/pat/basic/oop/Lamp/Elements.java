package at.pat.basic.oop.Lamp;

public class Elements {
    private String name;
    private String color;
    private int power;
    private boolean isOn;

    //constructor
    public Elements(String name, String color, int power, boolean isOn) {
        this.name = name;
        this.color = color;
        this.power = power;
        this.isOn = isOn;
    }
    //code


    //getterandsetter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getElUsage() {
        return power;
    }

    public void setElUsage(int elUsage) {
        this.power = elUsage;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }
}
