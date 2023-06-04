package level1.javacore.collection.lesson6;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnagramWorkShop {
    public static void main(String[] args) throws URISyntaxException, IOException {
        System.out.println("Твой ответ:");
        System.out.println(new AnagramWorkShop().findAnagrams(readFile()));
    }

    private static String readFile() throws URISyntaxException, IOException {
        Path path = Paths.get(AnagramWorkShop.class.getClassLoader().getResource("level1/javacore/collection/lesson6/input.txt").toURI());

        Stream<String> lines = Files.lines(path);
        String data = lines.collect(Collectors.joining("\n"));
        lines.close();

        return data;
    }

    private List<List<String>> findAnagrams(String text) {

        // выберем структуру данных
        Map<String, SortedSet<String>> answer = new HashMap<>();

        // очистим текст
        var cleanedText = text
                .replaceAll("^а-яА-Я ", " ")
                .replaceAll("( )+", " ")
                .toLowerCase();

        // разобьём текст на слова
        String[] words = cleanedText.split(" ");

        // заполняем наш Map
        for (String word : words) {
            var key = createKey(word);
            SortedSet<String> anagramGroup = answer.getOrDefault(key, new TreeSet<>());
            anagramGroup.add(word);
            answer.put(key, anagramGroup);
        }

        // найдём топ-3 самые длинные группы
        Comparator<Set<String>> listSizeComparator = Comparator.comparing(Set::size);
        return answer
                .values()
                .stream()
                .sorted(listSizeComparator.reversed())
                .limit(3)
                .map(ArrayList::new)
                .collect(Collectors.toList());
    }

    private String createKey(String word) {
        var chars = word.toCharArray();
        Arrays.sort(chars);

        return new String(chars);
    }
}
