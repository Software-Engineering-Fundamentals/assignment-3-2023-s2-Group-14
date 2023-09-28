package main.java.model;

import main.java.model.Course;

public class Student extends User {

    public Object System;

    public Student(String userID, String firstName, String lastName, String email, String address, String dateOfBirth,
            String phoneNumber, String emergencyContact, String password, String role) {
        super(userID, firstName, lastName, email, address, dateOfBirth, phoneNumber, emergencyContact, password, role);
        // Initialize additional fields specific to Student, if any
    }

    // Dummy method to enroll in a course
    public void enrollCourse(Course course) {
        // Add code to enroll the student in the specified course
        // If student is swapping courses, no fee, else a fee is required.
    }

    // Dummy method to access course content
    public void accessCourseContent(Course course) {
        // Add code to allow the student to access the content of the specified course
    }

    // Dummy method to post a question
    public String postQuestion(String question) {
        // Add code to post a question and return a confirmation message
        return "Question posted: " + question;
    }

    // Dummy method to participate in a discussion
    public String participateDiscussion(Course course, String message) {
        // Add code to allow the student to participate in the discussion of the
        // specified course
        return "Message posted in discussion: " + message;
    }

    // Dummy method to request course withdrawal
    public void requestCourseWithdrawal(Course course) {
        // Add code to allow the student to request withdrawal from the specified course
        // If Refund==True for course, can also receive a refund.
    }

}
