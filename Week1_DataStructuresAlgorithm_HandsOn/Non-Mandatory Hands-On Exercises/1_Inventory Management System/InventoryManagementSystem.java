import java.util.HashMap;

public class InventoryManagementSystem {
    HashMap<Integer, Product> inventory = new HashMap<>();
    public void addProduct(Product p) {
        inventory.put(p.productId, p);
        System.out.println("Product added: " + p.productName);
    }
    public void updateProduct(int id, int quantity, double price) {
        Product p = inventory.get(id);
        if (p != null) {
            p.quantity = quantity;
            p.price = price;
            System.out.println("Product updated: " + p.productName);
        } else {
            System.out.println("Product not found.");
        }
    }
    public void deleteProduct(int id) {
        if (inventory.remove(id) != null) {
            System.out.println("Product deleted.");
        } else {
            System.out.println("Product not found.");
        }
    }
    public void displayInventory() {
        System.out.println("Inventory:");
        for (Product p : inventory.values()) {
            p.display();
        }
    }
    public static void main(String[] args) {
        InventoryManagementSystem system = new InventoryManagementSystem();
        system.addProduct(new Product(101, "Laptop", 10, 55000));
        system.addProduct(new Product(102, "Mouse", 50, 500));
        system.addProduct(new Product(103, "Keyboard", 30, 1200));
        system.displayInventory();
        system.updateProduct(102, 60, 480);
        system.deleteProduct(103);
        system.displayInventory();
    }
}
