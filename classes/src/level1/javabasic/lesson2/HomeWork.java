package level1.javabasic.lesson2;

public class HomeWork
{
    public double number1 = 2;
    public double number2 = 3;
    public double number3 = 4;
    public double number4 = 5;
    public double number5 = 6;
    public double number6 = 7;
    public double number7 = 8;
    public double number8 = 9;
    public double averageVal = 0;

    public String phrase1 = "I finished ";
    public String phrase2 = " lessons";
    public byte countOfLessons = 2;

    public static void main(String[] args) {
        HomeWork hm2 = new HomeWork();

        hm2.averageVal = (hm2.number1 + hm2.number2 + hm2.number3 + hm2.number4 + hm2.number5 + hm2.number6 +
                hm2.number7 + hm2.number8) / 8;

        System.out.println(hm2.averageVal);

        System.out.println(hm2.phrase1 + hm2.countOfLessons + hm2.phrase2);
    }
}
