package level1.javabasic.lesson3;

public class Loops {
    public static void main(String[] args) {
        String[] names = {"Sasha", "Masha", "Vasya"};

        for (int i = 0; i < names.length; i++) {
            System.out.println(i + ". " + names[i]);
        }

        for (String name : names) {
            System.out.println(name);
        }
    }
}
