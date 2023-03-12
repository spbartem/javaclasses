package level1.javaclass.part1;

public abstract class Animal {
    private int age;
    Color color;
    boolean gender;
    String name;

    protected int lives;

    public Animal() {
        System.out.println("Animal constructor called");
        this.lives = 1;
        System.out.println("Animal has " + this.lives + " lives");
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public String getName() {
        if (name == null) {
            return "Unnamed";
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void jump() {
        System.out.println("Jump!");
    }

    public abstract void makeSound();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Age is negative!");
        }
        this.age = Math.max(0, age);
    }
}
