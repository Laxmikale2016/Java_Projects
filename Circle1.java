package Assingmennt2;

public class Circle1 implements Shape {
    double radius;

    Circle1(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }



    public static void main(String[] args) {
        Circle1 c = new Circle1(7);

        System.out.println("Area of Circle1 = " + c.area());
    }

}

q	
