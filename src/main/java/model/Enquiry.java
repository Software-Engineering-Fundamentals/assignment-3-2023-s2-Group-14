package main.java.model;

public class Enquiry {
    private String enquiryID;
    private String userID;
    private String content;
    private boolean resolved;

    // Constructor
    public Enquiry(String enquiryID, String userID, String content, boolean resolved) {
        this.enquiryID = enquiryID; // Will use the same enquiryID for simplicity.
        this.userID = userID;
        this.content = content;
        this.resolved = resolved;
        System.out.println("\nYou entered: " + content
                + "\nSystem is lodging.....\nSuccessfully lodged..! Please be patient while we handle your enquiry\n");
    }

    // Getter method for userID
    public String enquiryID() {
        return enquiryID;
    }

    // Getter method for userID
    public String getUserID() {
        return userID;
    }

    // Getter method for content
    public String getContent() {
        return content;
    }

    // Setter method for content
    public void setContent(String addContents) {
        this.content += "\n------------------------------ \n" + addContents;

    }

    // Getter method for resolved
    public boolean isResolved() {
        return resolved;
    }

    // Setter method for resolved
    public void setResolved(boolean resolved) {
        if (resolved == true) {
            this.resolved = resolved;
            System.out.println("The enquiry " + enquiryID
                    + " is unresolved and requires more information. Please see details below.\n");

        } else {
            System.out.println("The enquiry " + enquiryID
                    + " is unresolved and requires more information. Please see details below.\n");

        }
    }

    @Override
    public String toString() {
        return "Enquiry ID: " + enquiryID +
                "\nUser ID: " + userID +
                "\nEnquiry Query:\n\n" + content +
                "\n\nResolved: " + (resolved ? "Yes\nEnquiry is closed." : "No");
    }
}