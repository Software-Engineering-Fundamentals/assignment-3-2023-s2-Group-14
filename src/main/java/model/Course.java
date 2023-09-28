package main.java.model;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseId;
    private String title;
    private String description;
    private int duration;
    private String instructor;
    private List<Student> enrolledStudents;
    private boolean isPublished;
    private boolean refundOffered;
    private double cost;

    public Course() {

    }

    public Course(String courseId, String title, String description, int duration, String instructor,
            double cost) {
        this.courseId = courseId;
        this.title = title;
        this.description = description;
        this.duration = duration;
        this.instructor = instructor;
        this.enrolledStudents = new ArrayList<>(); // Roll of students enrolled
        this.isPublished = false; // Initially, course is not published. Instructor can set.
        this.refundOffered = false; // Initially, no refund is offered. Instructor can set.
        this.cost = cost;
    }

    public double getCourseCost(String courseName) {
        if (courseName.equals(this.title)) {
            return this.cost;
        }
        return 0.0;
    }

    public void displayCourseContent() {
        System.out.println("Displaying course content...");
        System.out.println("Video lecture of Week02");
        System.out.println("Lecture powerpoint slides.");
        System.out.println("Lecture Quize.");

    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    // Enroll a student in the course
    public void enrollStudent(Student student) {
        // add student into list
        enrolledStudents.add(student);
    }

    // Unenroll a student from the course
    public void unenrollStudent(Student student) {
        // remove student from list
        enrolledStudents.remove(student);
    }

    // Dummy method check if the course is published for instructors
    public boolean isPublished() {
        return isPublished;
    }

    // Publish the course
    public void publish() {
        // Code that will publish course on website.
        isPublished = true;
    }

    // Unpublish the course
    public void unpublish() {
        // Code that will unpublish course from website.
        isPublished = false;
    }

    // Getter and Setter methods for refundOffered
    public boolean isRefundOffered() {
        return refundOffered;
    }

    public void setRefundOffered(boolean refundOffered) {
        this.refundOffered = refundOffered;
    }
}
