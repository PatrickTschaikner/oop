package at.pat.basic.oop.Kontos;

public class Bank {
    private Sparbuch sparbuch;
    private Girokonto girokonto;
    private Kreditkonto kreditkonto;

    //Constructor

    public Bank(Sparbuch sparbuch, Girokonto girokonto, Kreditkonto kreditkonto) {
        this.sparbuch = sparbuch;
        this.girokonto = girokonto;
        this.kreditkonto = kreditkonto;
    }

    //Funktionen

    public void Einzahlen(String x, double betrag){
        switch(x){
            case "sparbuch":
                double y = getSparbuch().getSparbuchValue() + betrag;
                System.out.println("Sie haben " + betrag + " in Ihr Sparbuch eingezahlt.");
                getSparbuch().setSparbuchValue(y);
                break;
            case "girokonto":
                y = getGirokonto().getGirokontoValue() + betrag;
                System.out.println("Sie haben " + betrag + " in Ihr Girokonto eingezahlt.");
                getGirokonto().setGirokontoValue(y);
                break;
            case "kreditkonto":
                y = getKreditkonto().getKreditkontoValue() + betrag;
                if(y < getKreditkonto().getKreditkontoLimit()){
                    System.out.println("Sie haben " + betrag + " in Ihr Kreditkonto eingezahlt");
                }else {
                    System.out.println("Sie haben zu wenig Schulden um so viel geld einzuzahlen.");
                }
                break;
            default:
                System.out.println("Kein gültiges Konto gefunden");
                break;
        }
    }

    public void Auszahlen(String x, double betrag){
        switch(x){
            case "sparbuch":
                double y = getSparbuch().getSparbuchValue() - betrag;
                if(y < 0){
                    System.out.println("Sie haben zu viel ausgezahlt.");
                }else{
                    System.out.println("Sie haben " + betrag + " ausgezahlt.");
                    getSparbuch().setSparbuchValue(y);
                }
                break;
            case "girokonto":
                y = getGirokonto().getGirokontoValue() - betrag;
                if(y < getGirokonto().getGirokontoLimit()){
                    System.out.println("Sie haben zu viel ausgezahlt.");
                }else{
                    System.out.println("Sie haben " + betrag + " ausgezahlt.");
                    getGirokonto().setGirokontoValue(y);
                }
                break;
            case "kreditkonto":
                y = getKreditkonto().getKreditkontoValue() - betrag;
                System.out.println("Sie haben " + betrag + " ausgezahlt.");
                getKreditkonto().setKreditkontoValue(y);
                break;
            default:
                System.out.println("Kein gültiges Konto gefunden.");
                break;
        }
    }

    public void Saldo(String x){
        switch (x){
            case "sparbuch":
                System.out.println(getSparbuch().getSparbuchValue());
                break;
            case "girokonto":
                System.out.println(getGirokonto().getGirokontoValue());
                break;
            case "kreditkonto":
                System.out.println(getKreditkonto().getKreditkontoValue());
                break;
            default:
                System.out.println("Kein gültiges Konto gefunden.");
                break;
        }
    }
    //GetterAndSetter

    public Sparbuch getSparbuch() {
        return sparbuch;
    }

    public void setSparbuch(Sparbuch sparbuch) {
        this.sparbuch = sparbuch;
    }

    public Girokonto getGirokonto() {
        return girokonto;
    }

    public void setGirokonto(Girokonto girokonto) {
        this.girokonto = girokonto;
    }

    public Kreditkonto getKreditkonto() {
        return kreditkonto;
    }

    public void setKreditkonto(Kreditkonto kreditkonto) {
        this.kreditkonto = kreditkonto;
    }
}
