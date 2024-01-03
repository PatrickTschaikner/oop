package at.pat.basic.oop.Phone;

public class SIM {
    private int id;
    private String number;

    //Constructor

    public SIM(int id, String number) {
        this.id = id;
        this.number = number;
    }

    //Functions
    public void Sim(int id, String number){
        System.out.println(id);
        System.out.println(number);
    }

    public void doCall(String number){
        System.out.println(number + " wird angerufen...");
    }
    //Getter & Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
