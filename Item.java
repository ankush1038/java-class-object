import java.util.Scanner;

public class Item {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input for item details
        System.out.println("Enter Item Code : ");
        int itemCode = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        System.out.println("Enter Item Name : ");
        String itemName = sc.nextLine();

        System.out.println("Enter Item Price : ");
        double price = sc.nextDouble();

        // Creating an Item object with user input
        Item item = new Item(itemCode, itemName, price);

        // Displaying item details
        item.displayDetails();

        // Taking user input for quantity
        System.out.println("\nEnter Quantity to Purchase : ");
        int quantity = sc.nextInt();

        // Calculating and displaying total cost
        System.out.println("Total Cost : $" + item.calculateTotalCost(quantity));

        // Closing Scanner
        sc.close();
    }

    // Attributes (fields)
    private int itemCode;
    private String itemName;
    private double price;

    // Constructor to initialize Item object
    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to calculate total cost
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    // Method to display item details
    public void displayDetails() {
        System.out.println("==== Item Details ====");
        System.out.println("Item Code : " + itemCode);
        System.out.println("Item Name : " + itemName);
        System.out.println("Price : $" + price);
    }
}
