package at.pat.basic.oop.Figure;

public class Main {
    public static void main(String[] args) {
        Kreis kreis1 = new Kreis("K1",3);
        Quadrat quadrat1 = new Quadrat(5,"Q1");
        Viereck viereck1 = new Viereck(4,"V1",6);
        Würfel würfel1 =new Würfel(13,"W1",31,53);

        würfel1.getArea(13,31,53);
        kreis1.getArea(5);
        viereck1.getArea(4,6);
        quadrat1.getArea(5);
    }
}
