package at.pat.basic.oop.Lamp;

import at.pat.basic.oop.examples.cars.Car;

import java.util.ArrayList;

public class Lamp {
    private ArrayList<Element> elements;

    //constructor
    public Lamp() {
        this.elements = new ArrayList<>();
    }

    //code
    public void turnOn(){

        if(elements != null){
            for(Element element : elements){

                element.powerState();
                if(element.getstate() == false){
                    element.setstate(true);
                }
            }
        }
    }

    public void turnAllOn(){
        for(Element element : elements){
            element.setstate(true);
        }
        System.out.println("Es wurden alle eingeschaltet");
    }

    public double OverallPowerUsage(){
        double overallPowerusage = 0;

        for(Element element : elements){
            overallPowerusage = overallPowerusage + element.getPower();
        }

        return overallPowerusage;
    }

    public void printNamesOfLightElements(){
        for (int i = 0; i < elements.size(); i++) {
            System.out.println("ich bin " + elements.get(i).getName());
        }
    }

    //addElement
    public void addElement(Element elements){this.elements.add(elements);}

    //getter and setter
    public ArrayList<Element> getElements() {
        return elements;
    }

    public void setElements(ArrayList<Element> elements) {
        this.elements = elements;
    }
}
