import java.util.Scanner;

public class Student {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input for student details
        System.out.println("Enter Student Name : ");
        String name = sc.nextLine();

        System.out.println("Enter Roll Number : ");
        int rollNumber = sc.nextInt();

        System.out.println("Enter Marks : ");
        double marks = sc.nextDouble();

        // Creating a Student object with user input
        Student student = new Student(name, rollNumber, marks);

        // Displaying student details and grade
        student.displayDetails();

        // Closing Scanner
        sc.close();
    }

    // Attributes (fields)
    private String name;
    private int rollNumber;
    private double marks;

    // Constructor to initialize Student object
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate grade based on marks
    public String calculateGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    // Method to display student details and grade
    public void displayDetails() {
        System.out.println("==== Student Details ====");
        System.out.println("Name : " + name);
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Marks : " + marks);
        System.out.println("Grade : " + calculateGrade());
    }
}
