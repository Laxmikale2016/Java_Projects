package Assingmennt2;

public class Cylinderr  implements Operation {
    double radius, height;

    Cylinderr(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double area() {
        return 2 * 3.142 * radius * (radius + height);
    }

    public double volume() {
        return 3.142 * radius * radius * height;
    }


    public static void main(String[] args) {
        Circle c = new Circle(5);
        Cylinderr cy = new Cylinderr(5, 10);

        System.out.println("Circle Area = " + c.area());
        System.out.println("Cylinder Area = " + cy.area());
        System.out.println("Cylinder Volume = " + cy.volume());
    }
 {

}
 }
