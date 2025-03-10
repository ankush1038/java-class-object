import java.util.Scanner;

public class MobilePhone {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input for mobile phone details
        System.out.println("Enter Mobile Brand : ");
        String brand = sc.nextLine();

        System.out.println("Enter Mobile Model : ");
        String model = sc.nextLine();

        System.out.println("Enter Mobile Price : ");
        double price = sc.nextDouble();

        // Creating a MobilePhone object with user input
        MobilePhone phone = new MobilePhone(brand, model, price);

        // Displaying mobile phone details
        phone.displayDetails();

        // Closing Scanner
        sc.close();
    }

    // Attributes (fields)
    private String brand;
    private String model;
    private double price;

    // Constructor to initialize MobilePhone object
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display mobile phone details
    public void displayDetails() {
        System.out.println("==== Mobile Phone Details ====");
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : $" + price);
    }
}
