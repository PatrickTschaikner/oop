package at.pat.basic.oop.examples.cars;

import java.util.ArrayList;

public class Producer {
    private String brand;
    private int sale;
    private String country;
    private ArrayList<Car> cars;

    //constructor
    public Producer(String brand, int sale, String country) {
        this.brand = brand;
        this.sale = sale;
        this.country = country;
        this.cars = new ArrayList<>();
    }


    //code
    //realPrice berechnung

    //Producer hinzufügen
    public void addcar(Car car){this.cars.add(car);}
    //getterandsetter
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }
}
