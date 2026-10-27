package Assingmennt2;

public class Employee {
	 private int id;
	    private String name;
	    private String department;
	    protected double salary;

	    Employee() {
	        id = 0;
	        name = "Unknown";
	        department = "Unknown";
	        salary = 0;
	    }

	    Employee(int id, String name, String department, double salary) {
	        this.id = id;
	        this.name = name;
	        this.department = department;
	        this.salary = salary;
	    }

	    void display() {
	        System.out.println("ID: " + id);
	        System.out.println("Name: " + name);
	        System.out.println("Department: " + department);
	        System.out.println("Salary: " + salary);
	    }
	}



