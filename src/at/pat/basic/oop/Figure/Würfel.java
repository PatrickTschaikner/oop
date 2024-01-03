package at.pat.basic.oop.Figure;

public class Würfel extends Viereck{
    private int hoeheC;

    //Constructor

    public Würfel(int seiteA, String name, int seiteB, int hoeheC) {
        super(seiteA, name, seiteB);
        this.hoeheC = hoeheC;
    }

    //Funktionen
    public void getArea(int seiteA, int seiteB, int hoeheC){
        int area = seiteA * seiteB * hoeheC;
        System.out.println("Flächeninhalt: " + area);
    }

    //Getter & Setter

    public int getHoeheC() {
        return hoeheC;
    }

    public void setHoeheC(int hoeheC) {
        this.hoeheC = hoeheC;
    }
}
