package at.pat.basic.oop.Fernbedienung;

import java.util.ArrayList;

public class Remote {
    private boolean isOn;
    private boolean hasPower;
    private ArrayList<Battery> batteries;


    //constructor
    public Remote(boolean isOn, boolean hasPower) {
        this.isOn = isOn;
        this.hasPower = hasPower;
        this.batteries = new ArrayList<>();
    }

    //Füge Battery hinzu
    public void addBatteries(Battery battery){this.batteries.add(battery);}

    //Einschalten
    public void turnOn(){
        if(!isOn) {

            if (batteries.get(0).getChargingStatus() > 5) {
                float chargingStatusBattery = batteries.get(0).getChargingStatus();
                isOn = true;

                chargingStatusBattery -= 5;

                batteries.get(0).setChargingStatus(chargingStatusBattery);

                System.out.println("Verbraucher angeschlossen.");
            } else {
                System.out.println("Ist schon an oder ist unter 5%.");
            }

            if (batteries.get(1).getChargingStatus() > 5) {
                float chargingStatusBattery1 = batteries.get(1).getChargingStatus();
                isOn = true;

                chargingStatusBattery1 -= 5;

                batteries.get(1).setChargingStatus(chargingStatusBattery1);

                System.out.println("Verbraucher angeschlossen.");
            } else {
                System.out.println("Ist schon an oder ist unter 5%");
            }
        }else{
            System.out.println("Fernbedienung is schon an oder unter 5%");
        }
    }

    //Ausschalten
    public void turnOff(){

        isOn = false;
        System.out.println("Keine Verbraucher angeschlossen.");
        System.out.println(getBatteries().get(0).getChargingStatus());
    }

    //Status
    public void getStatus(){
        float chargingStatus = getBatteries().get(0).getChargingStatus();
        float chargingStatus1 = getBatteries().get(1).getChargingStatus();
        float Mittelwert = (chargingStatus1 + chargingStatus)/2 ;

        System.out.println(Mittelwert);
    }

    //getter and setter

    public void setOn(boolean on) {
        isOn = on;
    }

    public boolean isHasPower() {
        return hasPower;
    }

    public void setHasPower(boolean hasPower) {
        this.hasPower = hasPower;
    }

    public ArrayList<Battery> getBatteries() {
        return batteries;
    }

    public void setBatteries(ArrayList<Battery> batteries) {
        this.batteries = batteries;
    }
}
