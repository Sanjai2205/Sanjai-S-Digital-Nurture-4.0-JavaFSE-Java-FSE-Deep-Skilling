public class Main {
    public static void main(String[] args) {
        PaymentProcessor paypalProcessor = new PayPalAdapter();
        PaymentProcessor stripeProcessor = new StripeAdapter();

        System.out.println("Processing payment through PayPal:");
        paypalProcessor.processPayment(1000.00);

        System.out.println("\nProcessing payment through Stripe:");
        stripeProcessor.processPayment(1500.50);
    }
}
