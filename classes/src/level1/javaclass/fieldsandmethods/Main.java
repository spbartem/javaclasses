package level1.javaclass.fieldsandmethods;

import level1.javaclass.fieldsandmethods.geometry.Box;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(1, 2, 3);
        System.out.println(box.getVolume());
    }
}
