package level1.javaclass.fieldsandmethods.homework.circle;

public class Circle {
    private double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius cannot be less than 0");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius cannot be less than 0");
        }
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

//    public static double powTest(double val, int powVal) {
//        if (powVal == 1) {
//            return val;
//        } else {
//            return val = val * powTest(val, powVal - 1);
//        }
//    }
}
