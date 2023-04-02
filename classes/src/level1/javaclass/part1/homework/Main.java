package level1.javaclass.part1.homework;

public class Main {
    public static void main(String[] args) {

        Student student = new Student();

        Docent docent = new Docent();
        docent.name = "Sam";

        getTogether(student, docent);
    }

    public static void getTogether(Human human1, Human human2) {
        human1.sayHi();
        human2.sayHi();
    }
}
