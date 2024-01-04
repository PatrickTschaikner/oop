package at.pat.basic.oop.Camera;

public class Producer {
    private String name;
    private String country;

    //Constructor

    public Producer(String name, String country) {
        this.name = name;
        this.country = country;
    }

    //Getter & Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
