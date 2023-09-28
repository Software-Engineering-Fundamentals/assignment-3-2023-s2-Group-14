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

    //This is an empty constructor
    public PaymentGateway(){

    }
    public PaymentGateway(String paymentID, String transactionDetails, String userID, double totalCost) {
        this.paymentID = paymentID;
        this.transactionDetails = transactionDetails;
        this.userID = student.getUserID();
        this.totalCost = totalCost;
    }

    public Boolean makePayment(double amount) {
        if (amount >= course.getCost()){
            System.out.println("Making Payment");
            System.out.println("User:\n" + student.getFirstName() + " " + student.getLastName() + "");
            System.out.println("Amount $" + this.totalCost);
            return true;
        }
        System.out.println("Payement was not successfull");
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

}
