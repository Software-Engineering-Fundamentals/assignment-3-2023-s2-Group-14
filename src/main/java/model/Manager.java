package main.java.model;

import main.java.model.Enquiry;

public class Manager extends User {
    // The Manager class inherits the User class constructor
    public Manager(String userID, String firstName, String lastName, String email, String password) {
        super(userID, firstName, lastName, email, password);
        // Additional Manager-specific initialization logic here
    }

    public void viewEnquiries() {
        // Please keep in mind, this is just an option to view a list of enquiries, it
        // does not append or remove addressed enquiries.
        System.out.println("1: *\"The images and videos are loading very small\"*");
        System.out.println("2: *\"I can't access the course content \"*");
        System.out.println("3: *\"The website gives me an error message when I try to login\"*");
    }

    public void answerEnquiry(Enquiry enquiry, String Message) {
        enquiry.setContent(Message);
        enquiry.setResolved(true);

    }

}