package at.pat.basic.oop.examples.cars;

import java.util.ArrayList;

public class Main {
    Producer producer = new Producer("Mecerdes",20,"Austria");
    Engine engine = new Engine(500, Engine.TYPE.GAS);
    Car car = new Car("red",200,15000,7,engine,0);


}
