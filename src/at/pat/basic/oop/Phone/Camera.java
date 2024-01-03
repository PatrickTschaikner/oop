package at.pat.basic.oop.Phone;

public class Camera {
    private int resolution;
    private SD_Card sdCard;
    //Constructor

    public Camera(int resolution, SD_Card sdCard) {
        this.resolution = resolution;
        this.sdCard = sdCard;
    }

    //Functions
    public void makePicture(int extensions, String name){
        PhoneFile phoneFile =new PhoneFile(extensions,this.resolution,name);
        sdCard.setPhoneFile(phoneFile);
        sdCard.saveFile();
    }
    //Getter & Setter

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public SD_Card getSdCard() {
        return sdCard;
    }

    public void setSdCard(SD_Card sdCard) {
        this.sdCard = sdCard;
    }
}
