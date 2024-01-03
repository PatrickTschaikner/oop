package at.pat.basic.oop.Kontos;

public class Kreditkonto {
    private double kreditkontoValue;
    private double KreditkontoLimit;

    //Constructor

    public Kreditkonto(double kreditkontoValue, double kreditkontoLimit) {
        this.kreditkontoValue = kreditkontoValue;
        KreditkontoLimit = kreditkontoLimit;
    }

    //GetterAndSetter

    public double getKreditkontoValue() {
        return kreditkontoValue;
    }

    public void setKreditkontoValue(double kreditkontoValue) {
        this.kreditkontoValue = kreditkontoValue;
    }

    public double getKreditkontoLimit() {
        return KreditkontoLimit;
    }

    public void setKreditkontoLimit(double kreditkontoLimit) {
        KreditkontoLimit = kreditkontoLimit;
    }
}
