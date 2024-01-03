package at.pat.basic.oop.Figure;

public class Kreis {
    private String name;
    private double radius;

    //Constructor

    public Kreis(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    public Kreis(double radius) {
        this.radius = radius;
    }

    //Funktion

    public void getArea(double radius){
        double area = 2 * radius * 3.14159;
        System.out.println("Fächeninhalt" + area);
    }

    //Getter & Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
