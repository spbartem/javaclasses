package level1.javaclass.part1;

import java.util.jar.JarOutputStream;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat(7);
        cat.color = Color.BLACK;

        System.out.println(cat.color);
    }
}
