public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();
        Observer mobileApp = new MobileApp("Investor1");
        Observer webApp = new WebApp("Investor2");
        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);
        stockMarket.setStock("Cognizant", 3450.75);
        stockMarket.setStock("INFY", 1580.00);
        stockMarket.removeObserver(mobileApp);
        stockMarket.setStock("WIPRO", 480.55);
    }
}
