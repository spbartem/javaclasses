package level1.javaclass.part2.homework2;

public class CombustionCar extends Car {
    public CombustionCar(String name, float hp, int weight, TypeCar typeCar) {
        super(name, hp, weight, typeCar);
    }

    @Override
    public void drive() {
        getEngine().startEngine();
        getWheel().steerTheWheel();
        getEngine().stopEngine();
    }
}
