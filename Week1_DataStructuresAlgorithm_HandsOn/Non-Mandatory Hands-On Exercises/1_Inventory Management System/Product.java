class Product {
    int productId;
    String productName;
    int quantity;
    double price;

    public Product(int productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public void display() {
        System.out.println("ID: " + productId + ", Name: " + productName +
                           ", Qty: " + quantity + ", Price: ₹" + price);
    }
}
