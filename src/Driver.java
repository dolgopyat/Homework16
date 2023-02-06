public class Driver <B extends PassengerCar, C extends Truck, D extends Bus>  {
    private String name;
    private boolean license;
    private double experience;


    public Driver(String name, boolean license, double experience) {
        this.name = ValidationUtils.validOrDefault(name, "ФИО не указаны");
        this.license = license;
        this.experience = experience;
    }

    public void driveB (B passengerCar) {
        System.out.println("Водитель " + getName() + " управляет легковым автомобилем " + passengerCar.getBrand() + " " + passengerCar.getModel() + " и будет участвовать в заезде.");
    }
    public void driveC (C truck) {
        System.out.println("Водитель " + getName() + " управляет грузовым автомобилем " + truck.getBrand() + " " + truck.getModel() + " и будет участвовать в заезде.");
    }
    public void driveD (D bus) {
        System.out.println("Водитель " + getName() + " управляет автобусом " + bus.getBrand() + " " + bus.getModel() + " и будет участвовать в заезде.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isLicense() {
        return license;
    }

    public void setLicense(boolean license) {
        this.license = license;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return name + ", стаж вождения: " + experience + "лет, категория: " + license;
    }

}
