import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Car {

    private final String brand;
    private final String model;
    private double engineVolume;
    private final List<Driver> drivers = new ArrayList<>();
    private final List<Mechanic> mechanics = new ArrayList<>();
    private final List<Sponsor> sponsors = new ArrayList<>();

    public Car(String brand, String model, double engineVolume) {
        this.brand = ValidationUtils.validOrDefault(brand, "default");
        this.model = ValidationUtils.validOrDefault(model, "default");
        setEngineVolume(engineVolume);
    }
    public abstract void start ();
    public abstract void finish ();
    public abstract void  printType();

    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public double getEngineVolume() { return engineVolume; }
    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume > 0 ? engineVolume : 2.0;
    }

    public List<Driver> getDrivers() {
        return drivers;
    }

    public List<Mechanic> getMechanics() {
        return mechanics;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public void addDriver(Driver... drivers){
        this.drivers.addAll(Arrays.asList(drivers));
    }
    public void addMechanic(Mechanic... mechanics){
       this.mechanics.addAll(Arrays.asList(mechanics));
    }
    public void addSponsor(Sponsor... sponsors){
       this.sponsors.addAll(Arrays.asList(sponsors));
    }
    public abstract boolean service();

    public void repair() {
    }
}
