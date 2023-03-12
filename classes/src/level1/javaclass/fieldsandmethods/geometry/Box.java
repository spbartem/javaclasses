package level1.javaclass.fieldsandmethods.geometry;

public class Box extends Rectangle {

    double c;
    public Box(double a, double b, double c) {
        super(a, b);
        this.c = c;
    }

    public double getVolume() {
        return a * b * c;
    }
}
