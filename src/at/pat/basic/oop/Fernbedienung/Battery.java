package at.pat.basic.oop.Fernbedienung;

public class Battery {
    private float chargingStatus;

    public Battery(float chargingStatus) {
        this.chargingStatus = chargingStatus;
    }

    public float getChargingStatus() {
        return chargingStatus;
    }

    public void setChargingStatus(float chargingStatus) {
        this.chargingStatus = chargingStatus;

    }
}
