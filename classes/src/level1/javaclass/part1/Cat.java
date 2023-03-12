package level1.javaclass.part1;

public class Cat extends Animal implements Walkable, Fightable {
    public Cat(int lives) {
        super();
        System.out.println("Cat constructor called");
        this.lives = 9;
        System.out.println("Cat has " + this.lives + " lives");
    }

    @Override
    public void makeSound() {
        System.out.println("Mew!");
    }

    @Override
    public void scratch() {
        System.out.println("Scraaatch!!!");
    }

    @Override
    public void bite() {
        System.out.println("BITEEE!");
    }

    @Override
    public void walk() {
        System.out.println("Walk the cat");
    }
}
