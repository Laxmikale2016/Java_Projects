package Assingmennt2;

public class Manager extends Employee {
    private double bonus;

    Manager(int id, String name, String department,
            double salary, double bonus) {

        super(id, name, department, salary);
        this.bonus = bonus;
    }

    double totalSalary() {
        return salary + bonus;
    }

    void display() {
        super.display();
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + totalSalary());
    }

    

    public static void main(String[] args) {
        Manager m1 = new Manager(1, "Rahul", "IT", 50000, 10000);
        Manager m2 = new Manager(2, "Anita", "HR", 45000, 5000);

        Manager max = m1.totalSalary() > m2.totalSalary() ? m1 : m2;

        System.out.println("Manager having maximum salary:");
        max.display();
    }
    }


