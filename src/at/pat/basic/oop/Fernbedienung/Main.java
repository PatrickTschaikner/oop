package at.pat.basic.oop.Fernbedienung;

public class Main {
    public static void main(String[] args) {
        Battery battery = new Battery(100);
        Battery battery1 = new Battery(100);
        Remote remote = new Remote(false,true);

        remote.addBatteries(battery);
        remote.addBatteries(battery1);

        remote.turnOn();
        remote.turnOff();
        remote.getStatus();
    }
}
