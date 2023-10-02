package main.java.model;

import java.sql.Date;

public class User {
    private String userID;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String dateOfBirth; // For simplicity sake we will declare dateOfBirth as a string instead of date
    private String phoneNumber;
    private String emergencyContact;
    private String password;
    private String role;

    // Constructor
    public User(String userID, String firstName, String lastName, String email, String address,
            String dateOfBirth,
            String phoneNumber, String emergencyContact, String password, String role) {
        this.userID = userID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.emergencyContact = emergencyContact;
        this.password = password;
        this.role = role;
    }

    // This is the user registration function
    public Boolean registerAccount(String firstName, String lastName, String email, String address, Date doB,
            String phoneNumber,
            String emergencyContact, String password) {
        /*
         * If firstName, lastName, email, and password fields are not empty then we can
         * create an account for the user
         */
        if (!firstName.isEmpty() && !lastName.isEmpty() && !email.isEmpty() && !password.isEmpty()) {
            System.out.println("Account was successfully created");
            return true;
        }

        /*
         * If firstName, lastName, email, and password fields are empty, cannot create
         * an account for the user and
         * returns false
         */
        System.out.println("Account was not successfully created\nPlease fill all the fields");
        return false;
    }

    // This is the login function, we will use email, as a login parameter, rather
    // than username or userID for simplicity, as the system is required to create a
    // username for user to login with.
    public Boolean login(String email, String password) {
        if (email.equals(this.email) && password.equals(this.password)) {
            System.out.println("Logged in successfully");
            return true;
        }
        System.out.println("Username OR password incorrect");
        return false;
    }

    // This is the reset user's password function
    public boolean resetPassword(String oldPassword, String newPassword) {
        // Dummy code, add logic to implement password reset
        if (oldPassword.equals(this.password)) {
            this.password = newPassword;
            return true;
        }
        return false;
    }

    public String getUserID() {
        return userID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public String getDOB() {
        return dateOfBirth;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Creates a new Enquiry object with the provided details. Actual logic will
    // create an Enquiry ticket and store in the database.
    public static Enquiry createEnquiry(String enquiryID, User user, String content, boolean resolved) {
        System.out.println("**Created Enquiry.**");
        return new Enquiry(enquiryID, user.getUserID(), content, resolved);
    }

}
