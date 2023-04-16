package level1.javabasic.lesson3.upd;

import java.util.Arrays;

public class WorkShop {
    public static void main(String[] args) {
        Friend[] friends = new Friend[] {
                new Friend("Вася", Integer.parseInt("18"), false, 8.25f),
                new Friend("Катя", Integer.parseInt("19"), true, 14.00f),
                new Friend("Дима", Integer.parseInt("20"), true, 12.15f),
                null,
                null
        };
        friends[3] = new Friend("Петя", 21, false, 0.00f);
        friends[4] = new Friend("Маша", 22, true, 5.77f);

        System.out.println("My friends:" + Arrays.toString(friends));
    }
}

class Friend {
    private String name;
    private int age;
    private boolean isFriendFromSchool;
    private float hoursSpentTogetherLastWeek;

    public Friend(String name, int age, boolean isFriendFromSchool, float hoursSpentTogetherLastWeek) {
        this.name = name;
        this.age = age;
        this.isFriendFromSchool = isFriendFromSchool;
        this.hoursSpentTogetherLastWeek = hoursSpentTogetherLastWeek;
    }

    @Override
    public String toString() {
        return "\nFriend{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isFriendFromSchool=" + isFriendFromSchool +
                ", hoursSpentTogetherLastWeek=" + hoursSpentTogetherLastWeek +
                '}';
    }
}
