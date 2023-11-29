package at.pat.basic.oop.examples.cars;

import java.util.ArrayList;
public class Main {
public static void main(String[]args) {


    Engine engine = new Engine(350, Engine.TYPE.DIESEL);
    Car car = new Car("red", 250, 30000, 7, engine, 0);
    Producer producer = new Producer("Mecredes", 20, "Deutschland");

    producer.addcar(car);

    car.calcrealPrice();
    }
}
