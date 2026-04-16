class Employee {
    int employeeID;
    String name;
    String department;
    double salary;

    // Constructor to initialize attributes
    public Employee(int id, String name, String dept, double salary) {
        this.employeeID = id;
        this.name = name;
        this.department = dept;
        this.salary = salary;
    }

    // Method to calculate 10% bonus
    public double calculateBonus() {
        return this.salary * 0.10;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("--- Employee Details ---");
        System.out.println("ID: " + employeeID);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Monthly Salary: " + salary);
        System.out.println("Calculated Bonus (10%): " + calculateBonus());
        System.out.println("-------------------------");
    }
}

public class EmployeeTask {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "Vikram Singh", "Software Engineering", 50000);
        emp.displayDetails();
    }
}