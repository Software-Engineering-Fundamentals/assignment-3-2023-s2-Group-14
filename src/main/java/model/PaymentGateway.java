package main.java.model;

public class PaymentGateway {
    private String paymentID;
    private String transactionDetails;
    private String userID;
    private double totalCost;

    // Constructor
    public PaymentGateway(String paymentID, String transactionDetails, String userID, double totalCost) {
        this.paymentID = paymentID;
        this.transactionDetails = transactionDetails;
        this.userID = userID;
        this.totalCost = totalCost;
    }

    // Process payment method, will check if successful or not.
    public Boolean processPayment(boolean payment) {
        if (payment == true) {
            System.out.println("\nMaking Payment......\n\nSee details below:");
            System.out.println("User ID: " + this.userID);
            System.out.println("Amount: $" + this.totalCost);
            // Dummy, requires logic to create invoice to send for user.
            System.out
                    .println("Transaction was succesful. Please check your email inbox for confirmation and invoice.");
            return true;
        }
        System.out.println("Payment was not successful");
        return false;
    }

    public String getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
    }

    public String getTransactionDetails() {
        return transactionDetails;
    }

    public void setTransactionDetails(String transactionDetails) {
        this.transactionDetails = transactionDetails;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public double getTotalCost() {
        return totalCost;
    }

    // Method to change cost. Useful when cost has changed.
    public void setTotalCost(double cost) {
        this.totalCost = cost;
    }

    // Verify if payment was succesful. Dummy method.
    public boolean verifyPayment() {
        return true;
    }

    // Dummy method for processing refunds. No parameters, as they are based
    // internally. However can process a refund by creating a payment receipt class
    // and refunding.
    public void processRefund() {
        // Perform refund processing code here
        System.out.println("Processing refund for Payment ID: " + paymentID);
        // You can print a message to indicate the refund was successful
        System.out.println("Refund processed successfully.");
    }
}