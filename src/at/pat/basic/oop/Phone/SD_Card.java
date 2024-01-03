package at.pat.basic.oop.Phone;

import java.util.ArrayList;
import java.util.List;

public class SD_Card {
    private int capacity;
    private List<PhoneFile> files;
    private  PhoneFile phoneFile;
    private Camera camera;

    //Constructor

    public SD_Card(int capacity) {
        this.capacity = capacity;
        this.files = new ArrayList<>();
    }

    //Functions
    public void addFile(PhoneFile file){
        this.files.add(file);
    }

    public int getFreeSpace(){
        int x = 0;
        int y;
        for (PhoneFile file: this.files){
            x += file.getSize();
        }
        y = this.capacity - x;
        return y;
    }

    public List<PhoneFile> getAllFiles() {
        return new ArrayList<>(files);
    }

    public void saveFile(){
        int freeSpace = getFreeSpace();
        int spaceConsume = getCamera().getResolution();
        if (freeSpace > spaceConsume){
            addFile(phoneFile);
            System.out.println("Es wurde erfolgreich gespeichert");
        }else {
            System.out.println("Sie haben zu wenig Speicherplatz");
        }
    }

    //Getter & Setter

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<PhoneFile> getFiles() {
        return files;
    }

    public void setFiles(List<PhoneFile> files) {
        this.files = files;
    }

    public PhoneFile getPhoneFile() {
        return phoneFile;
    }

    public void setPhoneFile(PhoneFile phoneFile) {
        this.phoneFile = phoneFile;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }
}
