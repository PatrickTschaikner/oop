package at.pat.basic.oop.Camera;

public class File {
    private String name;
    private String date;
    private int size;

    //Cosntructor

    public File(String name, String date, int size) {
        this.name = name;
        this.date = date;
        this.size = size;
    }

    //Getter & Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
