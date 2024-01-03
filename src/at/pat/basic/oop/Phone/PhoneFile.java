package at.pat.basic.oop.Phone;

public class PhoneFile {
    private int extensions;
    private int size;
    private String name;
    //Constructor

    public PhoneFile(int extensions, int size, String name) {
        this.extensions = extensions;
        this.size = size;
        this.name = name;
    }

    //Functions
    public String getInfo() {
        return "Name: " + this.name + ", Size: " + this.size;
    }

    //Getter & Setter

    public int getExtensions() {
        return extensions;
    }

    public void setExtensions(int extensions) {
        this.extensions = extensions;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
