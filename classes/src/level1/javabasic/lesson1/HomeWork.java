package level1.javabasic.lesson1;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Расскажите о Вашем друге");

        System.out.println("Как зовут Вашего друга?");
        String nameOfFriend = in.nextLine();

        System.out.println("Сколько лет Вашему другу?");
        String ageOfFriend = in.nextLine();

        String sumText = String.format("Моему другу <%s> сейчас <%s> лет", nameOfFriend, ageOfFriend);
        System.out.println(sumText);

        in.close();
    }
}
