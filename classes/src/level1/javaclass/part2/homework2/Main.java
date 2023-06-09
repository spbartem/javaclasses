package level1.javaclass.part2.homework2;

public class Main {

    public static void main(String[] args) {
        Car jeep = new CombustionCar("Jeep", 250.70f, 2100, TypeCar.SUV);
        Car ford = new CombustionCar("Ford", 150.57f, 1500, TypeCar.SEDAN);
        Car tesla = new ElectricCar("Tesla", 300f, 1200, TypeCar.SEDAN);

        testTheCar(jeep);
        testTheCar(ford);
        testTheCar(tesla);
    }

    public static void testTheCar(Car car){
        System.out.println("--------------");
        car.describeCar();
        driveCar(car);

    }
    public static void driveCar(Driveable driveable){
        driveable.drive();
    }


}
