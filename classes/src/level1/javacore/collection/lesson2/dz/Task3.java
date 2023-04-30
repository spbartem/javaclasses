package level1.javacore.collection.lesson2.dz;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*
Задание 3: Реализуй метод, который на вход примет ArrayList строк и удаляет из него все дубликаты,
не используя метод contains(). Можно использовать другие коллекции, которые были изучены на уроке.
*/
public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("pear");
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("pear");

        fruits = removeDuplicates(fruits);
        System.out.println(fruits);
    }

    public static ArrayList<String> removeDuplicates(ArrayList<String> list) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.addAll(list);
        list.clear();
        list.addAll(hashSet);
        return list;
    }
}
