package CollectionFramework;

public class FullTimeStaff extends Staf {
    String department;
    double salary;
    double HRA;
    double DA;

    FullTimeStaff(String name, String address,
                  String department, double salary) {
        super(name, address);
        this.department = department;
        this.salary = salary;
        HRA = 0.08 * salary;
        DA = 0.05 * salary;
    }

    double calculateSalary() {
        return salary + HRA + DA;
    }
}