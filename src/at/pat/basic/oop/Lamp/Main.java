package at.pat.basic.oop.Lamp;


public class Main {
    public static void main(String[] args) {

        Element elements = new Element("lamp 1","red",200,false);
        Element elements1 = new Element("lamp 2","red",200,true);
        Lamp lamp = new Lamp();

        lamp.addElement(elements);
        lamp.addElement(elements1);

        lamp.turnOn();
        lamp.turnAllOn();
        System.out.println(lamp.OverallPowerUsage());
        lamp.printNamesOfLightElements();
    }
}
