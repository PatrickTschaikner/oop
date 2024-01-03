package at.pat.basic.oop.Figure;

public class Quadrat {
    private int seiteA;
    private String name;

    //Constructor

    public Quadrat(int seiteA, String name) {
        this.seiteA = seiteA;
        this.name = name;
    }

    //Funktionen
    public void getArea(int seiteA){
        int area = seiteA^2;
        System.out.println("Flächeninhalt: " + area);
    }

    //Getter & Setter

    public int getSeiteA() {
        return seiteA;
    }

    public void setSeiteA(int seiteA) {
        this.seiteA = seiteA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
