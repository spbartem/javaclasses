package level1.javaclass.fieldsandmethods.geometry;

public class Rectangle {
    double a;
    double b;

    public Rectangle (double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void setA(double newA) {
        if (newA <= 0) {
            throw new IllegalArgumentException("A cannot be less then 0");
        }
        this.a = newA;
    }

    public void setB(double newB) {
        if (newB <= 0) {
            throw new IllegalArgumentException("B cannot be less then 0");
        }
        this.b = newB;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getArea() {
        return a * b;
    }

    public String toString() {
        return ("Rectangle(" + a + ", " + b + ")");
    }
}
