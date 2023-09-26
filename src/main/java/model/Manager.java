package main.java.model;

public class Manager extends User {
    // The Manager class inherits the User class constructor
    public Manager(String userID, String firstName, String lastName, String email, String password) {
        super(userID, firstName, lastName, email, password);
    }

    public void viewEnquiries() {
        // Dummy method to view a list of enquiries to retrieve from database.

        System.out.println("1: \"The images and videos are loading very slow\"");
        System.out.println("2: \"I can't access the course content\"");
        System.out.println("3: \"The website gives me an error message when I try to login\"");

        System.out.println("\nManager has selected \"The images and videos are loading very slow\"\n");

    }

    public void answerEnquiry(Enquiry enquiry, String message, boolean resolveStatus) {

        //

        enquiry.setContent(message);
        // If the status is solved.
        if (resolveStatus == true) {
            enquiry.setResolved(true);
        }
        // If the status is unsolved.
        else {
            enquiry.setResolved(false);
        }

    }

}