package level1.javaclass.part1.homework;

public class Main {
    public static void main(String[] args) {

        Student student = new Student();
        sayHi(student);

        Docent docent = new Docent();
        docent.name = "Sam";
        sayHi(docent);
    }

    public static void sayHi(Human human) {
        human.sayHi();
    }
}
