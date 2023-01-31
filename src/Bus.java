public class Bus extends Car implements Competing{
    private Capacity capacity;

    public Bus(String brand, String model, double engineVolume, Capacity capacity) {

        super(brand, model, engineVolume);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    @Override
    public void start() {
        System.out.println(getBrand() + " " + getModel() + " начнал движение.");
    }

    @Override
    public void finish() {
        System.out.println(getBrand() + " " + getModel() + " закончил движение.");
    }

    @Override
    public void pitStop() {
        System.out.println(getBrand() + " " + getModel() + " заехал на питстоп");
    }

    @Override
    public void bestTime() {
        System.out.println("Лучшее время круга " + getBrand() + " " + getModel() + " -...");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость " + getBrand() + " " + getModel() + " -...");
    }
    public void printType() {
        if (capacity == null) {
            System.out.println("Данных по авто не достаточно.");
        } else {
            System.out.println("Вместимость автобуса: от " + capacity.getFrom() + " чел. до " + capacity.getTo() + " чел.");
        }
    }
}
