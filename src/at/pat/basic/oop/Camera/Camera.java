package at.pat.basic.oop.Camera;

public class Camera {
    private int pixel;
    private int weight;
    private String color;
    private SDCard sdCard;
    private Lens lens;
    private Producer producer;

    //Constructor


    public Camera(int pixel, int weight, String color, SDCard sdCard, Lens lens, Producer producer) {
        this.pixel = pixel;
        this.weight = weight;
        this.color = color;
        this.sdCard = sdCard;
        this.lens = lens;
        this.producer = producer;
    }

    //Functions
    public void takePicture(String name, String date){
        if(sdCard.isTaking() == true){
            File pictrue = new File(name,date, lens.fileSize());
            sdCard.AddFile(pictrue);
        }
    }

    public void changeSDCard(){
        SDCard freshSDCard = new SDCard(32,lens);
        sdCard = freshSDCard;
        sdCard.CalcFreeSpace();
        System.out.println("SDKarte wurde erfolgreich ausgewechselt");
    }

    //Getter & Setter

    public int getPixel() {
        return pixel;
    }

    public void setPixel(int pixel) {
        this.pixel = pixel;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
