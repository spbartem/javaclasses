package level1.javacore.collection.lesson6;

import java.util.Arrays;
import java.util.stream.Stream;

public class HomeWork {
    public static void main (String[] args) {
        String[] words = {"I", "am", "stUdyIng", "prograMming", "In", "java", "suPErr"};

        Arrays.stream(words)
                .filter(str -> str.length() > 5)
                .map(str -> str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase())
                .forEach(System.out::println);
    }
}
