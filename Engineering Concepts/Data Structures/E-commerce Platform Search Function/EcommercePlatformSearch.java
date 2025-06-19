public class EcommercePlatformSearch {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Footwear"),
            new Product(103, "Watch", "Accessories")
        };
        System.out.println("This is Binary Search:");
        Product result = LinearAndBinarySearch.binarySearch(products, 102);
        if (result != null) {
            System.out.println("Found: " + result.productName);
        } else {
            System.out.println("Product not found");
        }
        System.out.println();
        System.out.println();
        System.out.println("This is Linear search:");
        Product result3=LinearAndBinarySearch.binarySearch(products, 101);
        if (result3!= null) {
            System.out.println("Found: " + result3.productName);
        } else {
            System.out.println("Product not found");
        }
    }
}
