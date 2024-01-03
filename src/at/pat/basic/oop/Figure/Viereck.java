package at.pat.basic.oop.Figure;

public class Viereck extends Quadrat{

    private int seiteB;

    //Constructor

    public Viereck(int seiteA, String name, int seiteB) {
        super(seiteA, name);
        this.seiteB = seiteB;
    }

    //Funktionen
    public void getArea(int seiteA, int seiteB){
        int area = seiteA * seiteB;
        System.out.println("Flächeninhalt: " + area);
    }

    //Getter & Setter

    public int getSeiteB() {
        return seiteB;
    }

    public void setSeiteB(int seiteB) {
        this.seiteB = seiteB;
    }
}
