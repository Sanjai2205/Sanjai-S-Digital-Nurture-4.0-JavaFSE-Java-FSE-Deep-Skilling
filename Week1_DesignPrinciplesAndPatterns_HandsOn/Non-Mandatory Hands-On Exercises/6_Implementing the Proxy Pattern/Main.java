public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");
        System.out.println("First time display:");
        image1.display(); 
        image1.display(); 
        System.out.println("\nAnother image:");
        image2.display(); 
    }
}
