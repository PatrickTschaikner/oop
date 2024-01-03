package at.pat.basic.oop.Phone;

import java.util.List;

public class Handy {
    private String color;
    private Camera camera;
    private SD_Card sdCard;
    private SIM sim;

    //Constructor

    public Handy(String color, Camera camera, SD_Card sdCard, SIM sim) {
        this.color = color;
        this.camera = camera;
        this.sdCard = sdCard;
        this.sim = sim;
    }

    //Functions
    public void takePicture(int extension, String name){
        camera.makePicture(extension, name);
    }

    public void printAllFiles() {
        List<PhoneFile> filesList = sdCard.getAllFiles();
        for (PhoneFile file : filesList) {
            System.out.println(file.getInfo());
        }
    }

    public void makeCall(String number){
        sim.doCall(number);
    }

    public int getFreeSpace(){
        System.out.println("Sie haben " + sdCard.getFreeSpace() + " MB frei");
        return sdCard.getFreeSpace();
    }
    //Getter & Setter
}
