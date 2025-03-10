import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input for employee details
        System.out.println("Enter name : ");
        String name = sc.nextLine(); // Reads full name

        System.out.println("Enter ID : ");
        int id = sc.nextInt();

        System.out.println("Enter salary : ");
        int salary = sc.nextInt();

        // Creating an Employee object with user input
        Employee emp = new Employee(name, id, salary);

        // Displaying employee details
        emp.displayDetails();

        // Closing Scanner
        sc.close();
    }

    // Attributes (fields)
    private String name;
    private int id;
    private int salary;

    // Constructor to initialize Employee object
    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("==== Employee Details ====");
        System.out.println("Name : " + name);
        System.out.println("Id : " + id);
        System.out.println("Salary : " + salary);
    }
}
