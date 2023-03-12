package level1.javaclass.part2.homework2;

class Car implements Driveable {
    private String name;
    private float hp;
    private int weight;
    private TypeCar typeCar;
    Wheel wheel;
    Engine engine;

    public Car(String name, float hp, int weight, TypeCar typeCar) {
        this.name = name;
        this.hp = hp;
        this.weight = weight;
        this.typeCar = typeCar;
        this.engine = new Engine();
        this.wheel = new Wheel();
    }

    @Override
    public String toString() {
        System.out.println("======================");
        return "Car{" +
                "name='" + this.name + '\'' +
                ", hp=" + hp +
                ", weight=" + weight +
                ", typeCar=" + typeCar +
                '}';
    }

    @Override
    public void drive() {
        System.out.println("Car wrum-wrum!");
    }

    class Wheel {
        public void turnWheel() {
            System.out.println("Turned the steering wheel");
        }
    }

    class Engine {
        public void startEngine() {
            System.out.println("Engine started");
        }
        public void stopEngine() {
            System.out.println("Engine stopped");
        }
    }

    public String getName() {
        return name;
    }

    public float getHp() {
        return hp;
    }

    public int getWeight() {
        return weight;
    }

    public TypeCar getTypeCar() {
        return typeCar;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public Engine getEngine() {
        return engine;
    }
}
