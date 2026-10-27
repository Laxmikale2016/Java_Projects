package Assingmennt2;

public class Developer extends Employe {
    String projectName;

    Developer(String name, double salary, String projectName) {
        super (name, salary);
        this.projectName = projectName;
    }

public static void main(String[] args) {
    Programmer p =
        new Programmer("Amit", 60000, "Banking App", "Java");

    p.display();
}
}
