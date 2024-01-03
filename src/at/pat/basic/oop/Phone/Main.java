package at.pat.basic.oop.Phone;

public class Main {
    public static void main(String[] args) {
        SD_Card sdCard1 = new SD_Card(200);
        SIM sim1 = new SIM(3, "+436509905076");
        PhoneFile phoneFile1 = new PhoneFile(1,10,"PF1");
        PhoneFile phoneFile2 = new PhoneFile(2,15,"PF2");
        Camera camera1 = new Camera(10,sdCard1);
        sdCard1.addFile(phoneFile1);
        sdCard1.addFile(phoneFile2);
        Handy phone = new Handy("cyan",camera1,sdCard1,sim1);
        sdCard1.setCamera(camera1);

        phone.takePicture(31, "photo-55982613126439");
        phone.printAllFiles();
        phone.makeCall("+434236239");
        phone.getFreeSpace();
    }
}
