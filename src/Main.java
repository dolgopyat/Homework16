import java.util.List;

public class Main {
    public static void main(String[] args) {
        Mechanic<PassengerCar> nikolay = new Mechanic<>("Николай", "Николаев", "Рога и копыта");
        Mechanic<Truck> boris = new Mechanic<>("Борис", "Борисов", "Pirelli");
        Mechanic<Bus> stiv = new Mechanic<>("Стивен", "Кинг", "Volvo");
        Sponsor lukoil = new Sponsor("Лукойл", 2000000);
        Sponsor michelin = new Sponsor("Michelin", 3000000);
        Sponsor gazprom = new Sponsor("Газпром", 2500000);


        PassengerCar lada = new PassengerCar("Lada", "Granta", 1.7, TypeOfBody.SEDAN);
        lada.addDriver(new Driver("Алекс", true, 10));
        lada.addMechanic(nikolay);
        lada.addSponsor(lukoil);
        PassengerCar audi = new PassengerCar("Audi", "A8 50L TDI quatro", 3.0, TypeOfBody.SEDAN);
        audi.addDriver(new Driver("Макс", true, 11));
        audi.addMechanic(nikolay);
        audi.addSponsor(lukoil);
        PassengerCar bmw = new PassengerCar("BMW", "Z8", 3.0, TypeOfBody.COUPE);
        bmw.addDriver(new Driver("Никита", true, 16));
        bmw.addMechanic(nikolay);
        bmw.addSponsor(lukoil);
        PassengerCar hyundai = new PassengerCar("Hyundai", "Avante", 1.6, TypeOfBody.SEDAN);
        hyundai.addDriver(new Driver("Сергей", true, 14));
        hyundai.addMechanic(nikolay);
        hyundai.addSponsor(lukoil);


        Bus vektor = new Bus("Vektor", "Next 7.6", 4.4, Capacity.SMALL);
        vektor.addDriver(new Driver("Владимир", true, 13));
        vektor.addMechanic(boris);
        vektor.addSponsor(michelin);
        Bus gazele = new Bus("Газель", "Next", 2.9, Capacity.EXTRA_SMALL);
        gazele.addDriver(new Driver("Антон", true, 17));
        gazele.addMechanic(boris);
        gazele.addSponsor(michelin);
        Bus liaz = new Bus("ЛиАЗ", "4292", 4.4, Capacity.LARGE);
        liaz.addDriver(new Driver("Игнат", true, 9));
        liaz.addMechanic(boris);
        liaz.addSponsor(michelin);
        Bus paz = new Bus("ПАЗ", "4234", 4.75, Capacity.MEDIUM);
        paz.addDriver(new Driver("Генадий", true, 11));
        paz.addMechanic(stiv);
        paz.addSponsor(gazprom);


        Truck kamaz = new Truck("Kamaz", "4911", 17.2, Weight.N1);
        kamaz.addDriver(new Driver("Виталий", true, 10));
        kamaz.addMechanic(boris);
        kamaz.addSponsor(michelin);
        Truck man = new Truck("MAN", "TGS 18 480", 10.5, Weight.N2);
        man.addDriver(new Driver("Константин", true, 14));
        man.addMechanic(boris);
        man.addSponsor(michelin);
        Truck volvo = new Truck("Volvo", "Mean Green", 13, Weight.N3);
        volvo.addDriver(new Driver("Евгений", true, 12));
        volvo.addMechanic(boris);
        volvo.addSponsor(michelin);
        Truck scania = new Truck("Scania", "R730", 16, Weight.N1);
        scania.addDriver(new Driver("Олег", true, 15));
        scania.addMechanic(boris);
        scania.addSponsor(michelin);


        List<Car> cars = List.of(lada, audi, bmw, hyundai,
                vektor, gazele, liaz, paz,
                kamaz, man, volvo, scania);
    }
    private static void printInfo(Car car) {
        System.out.println("Информация по автомобилю " + car.getBrand() + " " + car.getModel());
        System.out.println("Водитель: " + car.getDrivers());
        System.out.println("Спонсор: " + car.getSponsors());
        System.out.println("Механик: " + car.getMechanics());
        System.out.println();
    }

}