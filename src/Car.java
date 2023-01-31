public class Car {

    private final String brand;
    private final String model;
    private double engineVolume;

    public Car(String brand, String model, double engineVolume) {
        this.brand = ValidationUtils.validOrDefault(brand, "default");
        this.model = ValidationUtils.validOrDefault(model, "default");
        setEngineVolume(engineVolume);
    }
    public void start () {}
    public void finish () {}
    public void  printType() {}

    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public double getEngineVolume() { return engineVolume; }
    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume > 0 ? engineVolume : 2.0;
    }
}
