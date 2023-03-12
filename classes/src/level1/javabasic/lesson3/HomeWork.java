package level1.javabasic.lesson3;

public class HomeWork {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("-----------------");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        System.out.println("-----------------");
        int h = 1;
        do {
            System.out.print(h + " ");
            h++;
        } while (h <= 10);
        System.out.println();

        System.out.println("-----------------");
        for (int n = 9; n >= 1; n--) {
            if (n % 2 != 0) {
                System.out.print(n + " ");
            }
        }
        System.out.println();

        System.out.println("-----------------");
        int t = 9;
        while (t >= 1) {
            System.out.print(t + " ");
            t = t - 2;
        }
    }
}