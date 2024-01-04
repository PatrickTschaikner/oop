package at.pat.basic.oop.Camera;

public class Lens {
    private int pixel;
    private int size;

    //Constructor

    public Lens(int pixel) {
        this.pixel = pixel;
    }

    //Functions
    public int fileSize(){
        switch(pixel){
            case 2000:
                size = 2;
                break;
            case 4000:
                size = 4;
                break;
            case 6000:
                size = 6;
                break;
            default:
                break;
        }
        return size;
    }

    //Getter & Setter

    public int getPixel() {
        return pixel;
    }

    public void setPixel(int pixel) {
        this.pixel = pixel;
    }
}
