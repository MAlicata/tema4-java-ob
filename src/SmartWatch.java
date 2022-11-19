class SmartWatch extends SmartDevice{
    String modelo;

    public SmartWatch(){

    }
    public SmartWatch(String modelo) {
        this.modelo = modelo;
    }

    public SmartWatch(double duracionBateria, double versionSoftware, int memoriaRam, String modelo) {
        super(duracionBateria, versionSoftware, memoriaRam);
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "duracionBateria=" + duracionBateria +
                ", versionSoftware=" + versionSoftware +
                ", memoriaRam=" + memoriaRam +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
