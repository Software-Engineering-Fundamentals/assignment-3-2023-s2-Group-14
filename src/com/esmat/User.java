package com.esmat;

import java.security.cert.TrustAnchor;
import java.util.Date;

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




    //This is the user registration function
    public Boolean registerAccount(String firstName, String lastName, String email, String address, Date doB, String phoneNumber,
                             String emergencyContact, String password){

        /*
        If firstName, lastName, email, and password fields are not empty then we can create an account for the user
         */
        if (!firstName.isEmpty() && !lastName.isEmpty() && !email.isEmpty() && !password.isEmpty()){
            System.out.println("Account was successfully created");
            return true;
        }

        /*
        If firstName, lastName, email, and password fields are empty, cannot create an account for the user and
        returns false
         */
        System.out.println("Account was not successfully created\nPleas fill all the fields");
        return false;
    }

    //This is the login function
    public Boolean login(String email, String password){
        if (email.equals(this.email) && password.equals(this.password)){
            System.out.println("Logged in successfully");
            return true;
        }
        System.out.println("Username OR password incorrect");
        return false;
    }

    //This is the reset user's password function
    public boolean resetPassword(String oldPassword, String newPassword){
        return true;
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
}
