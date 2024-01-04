package at.pat.basic.oop.Camera;

public class Main {
    public static void main(String[] args) {
        Producer producer = new Producer("Canon","Finnland");
        File file = new File("file-2140", "31/12/2023", 6);
        Lens lens = new Lens(6000);
        SDCard sdCard = new SDCard(16, lens);
        sdCard.AddFile(file);
        Camera camera = new Camera(6,200,"Black",sdCard,lens,producer);

        camera.takePicture("picture-23590426047123", "29/12/2023");
        camera.takePicture("picture-54736565264547", "29/12/2023");
        camera.changeSDCard();
        camera.takePicture("picture-24357687903452", "30/3/2023");
        camera.takePicture("picture-4789021ß0ß0876", "31/3/2023");
        camera.takePicture("picture-67490ß83691353", "31/3/2023");
    }
}
