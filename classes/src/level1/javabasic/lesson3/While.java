package level1.javabasic.lesson3;

public class While {
    public static void main(String[] args) {
        String[] names = {"Sasha", "Masha", "Vasya"};

        int i = 0;
        while (i < names.length) {
            System.out.println(i + ". " + names[i]);
            i++;
        }

        do {
            System.out.println("Hello!");
        } while (false);
    }
}
