package at.pat.basic.oop;

public class Flasche {
    private String hersteller;

    private int volumen;

    private String gefuelltmit;

    public Flasche(String hersteller, int volumen, String gefuelltmit) {
        this.hersteller = hersteller;
        this.volumen = volumen;
        this.gefuelltmit = gefuelltmit;
    }

    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }


}
