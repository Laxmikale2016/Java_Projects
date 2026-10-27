package Assingmennt2;

public class Circlee implements Operation {
    double radius;

    Circlee(double radius) {
        this.radius = radius;
    }

    public double area() {
        return 3.142 * radius * radius;
    }

    public double volume() {
        return 0;
    }

}


