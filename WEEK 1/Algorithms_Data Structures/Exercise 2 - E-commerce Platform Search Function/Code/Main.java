public class Main {
    public static void main(String[] args) {
        // Sample product list
        Product[] inventory = {
                new Product(101, "Smartphone", "Electronics"),
                new Product(203, "Notebook", "Stationery"),
                new Product(150, "Sneakers", "Footwear"),
                new Product(178, "Backpack", "Bags"),
                new Product(122, "T-shirt", "Clothing")
        };

        int searchId = 150;

        // Linear Search
        System.out.println("Searching using Linear Search...");
        Product foundLinear = LinearSearch.findProductById(inventory, searchId);
        System.out.println(foundLinear != null ? "Product found: " + foundLinear : "Product not found");

        // Binary Search
        System.out.println("\nSearching using Binary Search...");
        Product foundBinary = BinarySearch.findProductById(inventory, searchId);
        System.out.println(foundBinary != null ? "Product found: " + foundBinary : "Product not found");
    }
}