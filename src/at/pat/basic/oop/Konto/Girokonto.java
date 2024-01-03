package at.pat.basic.oop.Konto;

public class Girokonto {
    private double girokontoValue;
    private double  girokontoLimit;

    //Constructor

    public Girokonto(double girokontoValue, double girokontoLimit) {
        this.girokontoValue = girokontoValue;
        this.girokontoLimit = girokontoLimit;
    }

    //GetterAndSetter

    public double getGirokontoValue() {
        return girokontoValue;
    }

    public void setGirokontoValue(double girokontoValue) {
        this.girokontoValue = girokontoValue;
    }

    public double getGirokontoLimit() {
        return girokontoLimit;
    }

    public void setGirokontoLimit(double girokontoLimit) {
        this.girokontoLimit = girokontoLimit;
    }
}
