public class EcommercePlatformSearch {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Footwear"),
            new Product(103, "Watch", "Accessories")
        };
        System.out.println("This is Binary Search:");
        Product result1 = LinearAndBinarySearch.binarySearch(products, 102);
        if (result1 != null) {
            System.out.println("Found: " + result1.productName);
        } else {
            System.out.println("Product not found");
        }
        Product result2 = LinearAndBinarySearch.binarySearch(products, 109);
        if (result2 != null) {
            System.out.println("Found: " + result2.productName);
        } else {
            System.out.println("Product not found");
        }
        System.out.println("\nThis is Linear Search:");
        Product result3 = LinearAndBinarySearch.linearSearch(products, 101);
        if (result3 != null) {
            System.out.println("Found: " + result3.productName);
        } else {
            System.out.println("Product not found");
        }

        Product result4 = LinearAndBinarySearch.linearSearch(products, 109);
        if (result2 != null) {
            System.out.println("Found: " + result4.productName);
        } else {
            System.out.println("Product not found");
        }
    }
}
