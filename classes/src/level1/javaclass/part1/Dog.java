package level1.javaclass.part1;

public class Dog extends Animal implements Walkable {

    public Dog (String say) {
        System.out.println("Bark, bark");
    }
    @Override
    public void makeSound() {
        System.out.println("Bark!");
    }

    @Override
    public void walk() {
        System.out.println("Walk the dog");
    }
}
