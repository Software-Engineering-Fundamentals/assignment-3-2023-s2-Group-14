package main.java.model;

import java.util.Date;
import java.util.Scanner;

public class User {
    private String userID;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private Date dateOfBirth;
    private String phoneNumber;
    private String emergencyContact;
    private String password;
    private String role;

    public User(){
        
    }

    public User(String userID, String firstName, String lastName, String email, String address, Date dateOfBirth, String phoneNumber, String emergencyContact, String password, String role) {
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

    // Constructor
    //this constructor needs to be removed and above one should be used.
    public User(String userID, String firstName, String lastName, String email, String password) {
        this.userID = userID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
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
        System.out.println("Account was not successfully created\nPleas fill all the fields");
        return false;
    }

    // This is the login function
    public Boolean login(String email, String password) {
        if (email.equals(this.email) && password.equals(this.password)) {
            System.out.println("Logged in successfully");
            return true;
        }
        System.out.println("Username OR password incorrect");
        return false;
    }

    // This is the reset user's password function
    // public boolean resetPassword(String oldPassword, String newPassword){
    // if (oldPassword.equals(this.password)){
    // this.password = newPassword;
    // return true;
    // }
    // return false;
    // }
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

    /**
     * Creates a new Enquiry object with the provided details.
     *
     * @param enquiryID The unique identifier for the enquiry.
     * @param user      The user who submitted the enquiry.
     * @param content   The content or description of the enquiry.
     * @param resolved  A boolean indicating whether the enquiry is resolved (true)
     *                  or not (false).
     * @return A new Enquiry object with the specified details to Enquiry class.
     */
    public static Enquiry createEnquiry(String enquiryID, User user, String content, boolean resolved) {
        System.out.println("**Created Enquiry.**");
        return new Enquiry(enquiryID, user.getUserID(), content, resolved);
    }

}
