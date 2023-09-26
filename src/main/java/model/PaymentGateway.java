package main.java.model;

public class PaymentGateway {
    private String paymentID;
    private String transactionDetails;
    private String userID;
    private double totalCost;

    public PaymentGateway(String paymentID, String transactionDetails, String userID, double totalCost) {
        this.paymentID = paymentID;
        this.transactionDetails = transactionDetails;
        this.userID = userID;
        this.totalCost = totalCost;
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