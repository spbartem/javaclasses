package level1.javacore.collection.lesson2.dz;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Задание 1: Реализуй метод, который поменяет ключи и значения в HashMap местами.
На вход в метод поступает HashMap<Integer, String>, надо вернуть HashMap<String, Integer>.
Выведи результат.
*/
public class Task1 {
    public static final String NUMBER_REGEXP = "[-+]?\\d+";
    public static void main(String[] args) {
        HashMap<Integer, String> originalHashMap = new HashMap<>();

        originalHashMap.put(1, "2");
        originalHashMap.put(3, "4");
        originalHashMap.put(5, "6");
        originalHashMap.put(7, "eight");

        HashMap<String, Integer> reversedHashMap = reverseHashMap(originalHashMap);

        System.out.println("Result: ");

        for (Map.Entry<String, Integer> reversedEntry : reversedHashMap.entrySet()) {
            System.out.println("Reversed key: " + reversedEntry.getKey() + "; Reversed value: " + reversedEntry.getValue());
        }
    }

    public static HashMap reverseHashMap(HashMap<Integer, String> originalHashMap) {
        HashMap<String, Integer> reversedHasMap = new HashMap<>();
        for (Map.Entry<Integer, String> entry : originalHashMap.entrySet()) {
            if (checkInteger(entry.getValue())) {
                reversedHasMap.put(entry.getValue(), entry.getKey());
            } else {
                System.out.println("Value " + entry.getValue() + " with Key " + entry.getKey() + " is not Integer");
            }
        }
        return reversedHasMap;
    }

    public static boolean checkInteger(String number) {
        Pattern pattern = Pattern.compile(NUMBER_REGEXP);
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
    }
}
