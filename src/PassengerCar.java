public class PassengerCar extends Car implements Competing{
    private TypeOfBody typeOfBody;

    public PassengerCar(String brand, String model, double engineVolume, TypeOfBody typeOfBody) {

        super(brand, model, engineVolume);
        this.typeOfBody = typeOfBody;
    }

    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
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
        System.out.println(getBrand() + " " + getModel() + " заехал на питстоп.");
    }

    @Override
    public void bestTime() {
        System.out.println("Лучшее время круга " + getBrand() + " " + getModel() + " -...");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость " + getBrand() + " " + getModel() + " -...");
    }

    @Override
    public void printType() {
        if (typeOfBody == null) {
            System.out.println("Данных по авто не достаточно.");
        } else {
            System.out.println("Тип кузова авто: " + typeOfBody);
        }
    }

    @Override
    public boolean service() {
        return Math.random() > 0.5;
    }

    @Override
    public void repair() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " починен");
    }
}
