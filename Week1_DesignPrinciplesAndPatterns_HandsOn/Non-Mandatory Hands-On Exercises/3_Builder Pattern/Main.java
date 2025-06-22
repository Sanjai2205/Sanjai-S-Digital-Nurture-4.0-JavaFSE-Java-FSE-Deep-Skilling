public class Main {
    public static void main(String[] args) {
        Computer gamingPC = new Computer.Builder()
                .setCPU("Intel i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .build();
        Computer officePC = new Computer.Builder()
                .setCPU("Intel i5")
                .setRAM("8GB")
                .setStorage("512GB SSD")
                .build();
        System.out.println("Gaming PC Configuration:");
        gamingPC.display();
        System.out.println("\nOffice PC Configuration:");
        officePC.display();
    }
}
