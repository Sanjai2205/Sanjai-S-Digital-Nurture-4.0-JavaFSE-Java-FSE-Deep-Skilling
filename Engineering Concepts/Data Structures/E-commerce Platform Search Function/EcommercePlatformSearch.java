public class EcommercePlatformSearch {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Footwear"),
            new Product(103, "Watch", "Accessories")
        };
        Product result = LinearAndBinarySearch.binarySearch(products, 102);
        if (result != null) {
            System.out.println("Found: " + result.productName);
        } else {
            System.out.println("Product not found");
        }
         Product result2 = LinearAndBinarySearch.binarySearch(products, 109);
        if (result2 != null) {
            System.out.println("Found: " + result2.productName);
        } else {
            System.out.println("Product not found");
        }
    }
}
