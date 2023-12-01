package at.pat.basic.oop.Rechner;

public class Wissenschaftlicher_Rechner extends Rechner{

    private double zahl3;

    //konstruktor
    public Wissenschaftlicher_Rechner(double zahl1, double zahl2, double zahl3) {
        super(zahl1, zahl2);
        this.zahl3 = zahl3;

    }

    //code
    public void cosinus(){
        double cosinus = Math.cos(getZahl1()/getZahl2());
        System.out.println(cosinus);
    }

    public void sinus(){
        double sinus = Math.sin(getZahl3()/getZahl1());
        System.out.println(sinus);
    }

    //getterandsetter

    public double getZahl3() {
        return zahl3;
    }

    public void setZahl3(double zahl3) {
        this.zahl3 = zahl3;
    }
}
