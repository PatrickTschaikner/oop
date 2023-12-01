package at.pat.basic.oop.Rechner;

public class Main {
    public static void main(String[] args) {
        Rechner rechner = new Rechner(10,5);
        Wissenschaftlicher_Rechner wissenschaftlicher_rechner = new Wissenschaftlicher_Rechner(10,5,4);
        Wurzelrechner wurzelrechner = new Wurzelrechner(800,532,23);

        rechner.addieren();
        rechner.subtrahieren();
        rechner.dividieren();
        rechner.multiplizieren();

        wissenschaftlicher_rechner.cosinus();
        wissenschaftlicher_rechner.sinus();

        wurzelrechner.Wurzelrechnen();
    }
}
