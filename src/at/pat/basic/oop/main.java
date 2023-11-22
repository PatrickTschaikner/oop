package at.pat.basic.oop;

import at.pat.basic.oop.Car;

import java.nio.channels.ReadPendingException;

public class main {
    public static void main(String[] args) {
        int a = 7;

        RearMirror r2 = new RearMirror(90, -40);
        Engine e1 = new Engine(140, Engine.TYPE.DIESEL);
        Car c1 = new Car(e1,6,"Mercedes","M1234");
        RearMirror r1 = new RearMirror(100,0);
        c1.setFuelAmount(23);

        c1.addMirror(r1);
        c1.addMirror(r2);

        System.out.println(c1.getMirrors().get(0).getPosition());

        System.out.println(c1.getFuelAmount());
        c1.drive();
        System.out.println(c1.getFuelAmount());


    }

}
