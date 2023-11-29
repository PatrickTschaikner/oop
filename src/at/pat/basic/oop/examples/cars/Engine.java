package at.pat.basic.oop.examples.cars;

public class Engine {
    private int horsePower;
    private TYPE type;
    public enum TYPE {DIESEL, GAS};

    //Konstruktor

    public Engine(int horsePower, TYPE type) {
        this.horsePower = horsePower;
        this.type = type;
    }


    //code

    //Getter and Setter
    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
