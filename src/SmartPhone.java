public class SmartPhone extends SmartDevice{

    String modelo;

    public SmartPhone() {
    }

    public SmartPhone(String modelo) {
        this.modelo = modelo;
    }

    public SmartPhone(double duracionBateria, double versionSoftware, int memoriaRam, String modelo) {
        super(duracionBateria, versionSoftware, memoriaRam);
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "duracionBateria=" + duracionBateria +
                ", versionSoftware=" + versionSoftware +
                ", memoriaRam=" + memoriaRam +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
