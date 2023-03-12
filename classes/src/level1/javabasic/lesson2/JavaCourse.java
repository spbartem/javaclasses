package level1.javabasic.lesson2;

class Lesson {
    private String name;

    public Lesson(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class JavaCourse {
    public int studentsCount = 0;

    public static String platform = "ProductStar";

    public JavaCourse(int studentsCount) {
        this.studentsCount = studentsCount;
    }

    public static void main(String[] args) {
        JavaCourse firstCourse = new JavaCourse(10);
        System.out.println(firstCourse.studentsCount);
        System.out.println(firstCourse.platform);

        JavaCourse secondCourse = new JavaCourse(100);
        System.out.println(secondCourse.studentsCount);
        System.out.println(secondCourse.platform);

        System.out.println(JavaCourse.platform);

        Lesson firstLesson = new Lesson("Введение в java");
        System.out.println(firstLesson.getName());
    }
}
