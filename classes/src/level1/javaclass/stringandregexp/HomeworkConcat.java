package level1.javaclass.stringandregexp;

public class HomeworkConcat {
    Integer I = 1703;
    String a = "Петром Первым";
    String[] arrayNames = {"Санкт-Петербург", "Петроград", "Ленинград"};
    String b = "Питер";
    String str = String.format("Санкт-Петербург был основан в %d году %s. За свою историю он носил имена: %s. " +
            "Сейчас многие зовут его просто \"%s\".", I, a, String.join(", ", arrayNames), b);
    public static void main(String[] args) {
        HomeworkConcat hw = new HomeworkConcat();
        System.out.println(hw.str);
    }

}
