package main.java.model;

public class Manager extends Employee {
    // The Manager class inherits the Employee class constructor
    public Manager(String userID, String firstName, String lastName, String email, String address, String dateOfBirth,
            String phoneNumber, String emergencyContact, String password, String role) {
        super(userID, firstName, lastName, email, address, dateOfBirth, phoneNumber, emergencyContact, password, role);
        // Initialize additional fields specific to Manager, if any
    }

    public void viewEnquiries() {
        // Dummy method to view a list of enquiries to retrieve from database.

        System.out.println("1: \"The images and videos are loading very slow\"");
        System.out.println("2: \"I can't access the course content\"");
        System.out.println("3: \"The website gives me an error message when I try to login\"");

        System.out.println("\nManager has selected \"The images and videos are loading very slow\"\n");

    }

    public void answerEnquiry(Enquiry enquiry, String message, boolean resolveStatus) {

        System.out.println("Now sending message for enquiry...");

        enquiry.setContent(message);
        // If the status is solved.
        if (resolveStatus == true) {
            enquiry.statusEnquiry(true);
        }
        // If the status is unsolved.
        else {
            enquiry.statusEnquiry(false);
        }

    }

}