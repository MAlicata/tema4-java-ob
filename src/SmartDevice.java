public class SmartDevice {
    protected double duracionBateria;
    protected double versionSoftware;
    protected int memoriaRam;

    public SmartDevice(){

    }
    public SmartDevice(double duracionBateria, double versionSoftware, int memoriaRam) {
        this.duracionBateria = duracionBateria;
        this.versionSoftware = versionSoftware;
        this.memoriaRam = memoriaRam;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "duracionBateria=" + duracionBateria +
                ", versionSoftware=" + versionSoftware +
                ", memoriaRam=" + memoriaRam +
                '}';
    }
}
