package payment;

public class PaymentForm {
    public static void main(String[] args) {
        // Example usage
        processPayment("John Doe", 49.99);
    }

    /**
     * A simple method to simulate a payment process.
     *
     * @param payee  The person or entity being paid
     * @param amount The amount to be paid
     */
    private static void processPayment(String payee, double amount) {
        System.out.println("Initiating payment of $" + amount + " to " + payee + "...");
        // Here you'd integrate with a payment gateway or perform the actual payment steps
        System.out.println("Payment successful!");
    }

}
