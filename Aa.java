package Assingment2;

public class Aa {

	public static void main(String[] args) {
		Circle c=new Circle(5);
		Cylinder cy=new Cylinder(5,10);
		System.out.println("area of circle="+c.area());
		System.out.println(" surface of area of cylinder="+cy.area());
		System.out.println("volume of cylinder ="+cy.volume());
	}
}
