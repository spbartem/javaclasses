package level1.javabasic.lesson4;

import java.util.Scanner;
public class HomeWork {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {

            while (true) {
                System.out.println("\nВведите число: ");

                int number = in.nextInt();

                for (int i = 0; i <= number; i++) {
                    if (i % 3 == 0 && i % 5 == 0 && i != 0) {
                        System.out.print("fizzbuzz ");
                    } else if (i % 3 == 0 && i != 0) {
                        System.out.print("fizz ");
                    } else if (i % 5 == 0 && i != 0) {
                        System.out.print("buzz ");
                    } else {
                        System.out.print(i + " ");
                    }
                }
                System.out.println("\nДля выхода нажмите клавишу q");
                String isExit = in.next();
                if (isExit.equalsIgnoreCase("q")) {
                    break;
                }
            }
        }
    }
}