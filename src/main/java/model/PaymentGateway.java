package main.java.model;
import main.java.model.Course;
import main.java.model.User;
import main.java.model.Student;


public class PaymentGateway {
    Course course = new Course();
    Student student = new Student();
    private String paymentID;
    private String transactionDetails;
    private String userID;
    private double totalCost;

    public PaymentGateway(String paymentID, String transactionDetails, String userID, double totalCost) {
        this.paymentID = paymentID;
        this.transactionDetails = transactionDetails;
        this.userID = user.getUserID();
        this.totalCost = totalCost;
    }

    public void processPayment() {
        if (course.getCost() > 0){
            this.totalCost = course.getCost();
            System.out.println("Processing Payment");
            System.out.println("User:\n" + user.getFirstName() + " " + user.getLastName());

        }
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

}
