public class Truck extends Car implements Competing{
    private Weight weight;

    public Truck(String brand, String model, double engineVolume, Weight weight) {

        super(brand, model, engineVolume);
        this.weight = weight;
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
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
        if (weight == null) {
            System.out.println("Данных по авто не достаточно.");
        } else {
            String from = weight.getFrom() == null ? "" : "от " + weight.getFrom() + "т. ";
            String to = weight.getTo() == null ? "" : "до " + weight.getTo() + "т.";
            System.out.println("Грузоподъёмность авто: " + from + to);
        }
    }

    @Override
    public boolean service() {
        return Math.random() > 0.7;
    }

    @Override
    public void repair() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " починен");
    }

}
