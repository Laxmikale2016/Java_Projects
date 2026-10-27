package Assingment2;

public class Cylinder extends Circle{
	double height;
	Cylinder(double radius,double height){
		super(radius);
		this.height=height;
	}
	double area() {
		return 2*Math.PI*radius*(radius+height);
	}
	double volume() {
		return super.area()*height;
	}
}
