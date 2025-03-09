// Class Definition
public class FoodDeliveryApp {
    // Fields (Attributes)
    private String name;
    private String location;
    private String[] foodItems;

    // Constructor
    public FoodDeliveryApp(String name, String location, String[] foodItems) {
        this.name = name;
        this.location = location;
        this.foodItems = foodItems;
    }

    // Method to display restaurant details
    public void displayDetails() {
        System.out.println("Restaurant Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Food Items: ");
        for (String item : foodItems) {
            System.out.println("- " + item);
        }
    }

    // Method to check if a food item is available
    public boolean isFoodAvailable(String food) {
        for (String item : foodItems) {
            if (item.equalsIgnoreCase(food)) {
                return true;
            }
        }
        return false;
    }
}

// Main Class to Test
class Main { // Removed 'public' to avoid filename restriction
    public static void main(String[] args) {
        // Define food items for restaurants
        String[] foodItems1 = {"Pizza", "Pasta", "Burger"};
        String[] foodItems2 = {"Sushi", "Ramen", "Tempura"};

        // Create Restaurant objects
        FoodDeliveryApp restaurant1 = new FoodDeliveryApp("Italian Delight", "Downtown", foodItems1);
        FoodDeliveryApp restaurant2 = new FoodDeliveryApp("Tokyo Treats", "Uptown", foodItems2);

        // Display details of each restaurant
        System.out.println("=== Restaurant 1 ===");
        restaurant1.displayDetails();
        System.out.println("\n=== Restaurant 2 ===");
        restaurant2.displayDetails();

        // Check food availability
        System.out.println("\nChecking Food Availability:");
        System.out.println("Is Pasta available in Italian Delight? " + restaurant1.isFoodAvailable("Pasta"));
        System.out.println("Is Sushi available in Italian Delight? " + restaurant1.isFoodAvailable("Sushi"));
    }
}
