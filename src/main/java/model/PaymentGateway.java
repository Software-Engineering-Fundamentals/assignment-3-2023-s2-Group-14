package main.java.model;

public class PaymentGateway {
    private String paymentID;
    private String transactionDetails;
    private String userID;
    private double totalCost;

    // This is an empty constructor
    public PaymentGateway() {

    }

    public PaymentGateway(String paymentID, String transactionDetails, String userID, double totalCost) {
        this.paymentID = paymentID;
        this.transactionDetails = transactionDetails;
        this.userID = userID;
        this.totalCost = totalCost;
    }

    public Boolean makePayment(double amount) {
        if (amount >= this.totalCost) {
            System.out.println("Making Payment");
            System.out.println("User ID: " + this.userID);
            System.out.println("Amount: $" + this.totalCost);
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

    public void addTotalCost(double courseCost) {
        this.totalCost += courseCost;
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