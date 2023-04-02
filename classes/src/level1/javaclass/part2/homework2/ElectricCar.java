package level1.javaclass.part2.homework2;

public class ElectricCar extends Car {
    public ElectricCar(String name, float hp, int weight, TypeCar typeCar) {
        super(name, hp, weight, typeCar);
    }

    @Override
    public void drive() {
        getWheel().steerTheWheel();
    }
}
