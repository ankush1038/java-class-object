import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input for radius
        System.out.println("Enter radius of the circle : ");
        double radius = sc.nextDouble();

        // Creating a Circle object with user input
        Circle circle = new Circle(radius);

        // Displaying circle details
        circle.displayDetails();

        // Closing Scanner
        sc.close();
    }

    // Attribute (field)
    private double radius;

    // Constructor to initialize Circle object
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display circle details
    public void displayDetails() {
        System.out.println("==== Circle Details ====");
        System.out.println("Radius : " + radius);
        System.out.println("Area : " + calculateArea());
        System.out.println("Circumference : " + calculateCircumference());
    }
}
