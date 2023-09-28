package main.java.model;

import java.util.ArrayList;
import java.util.List;

public class Instructor extends Employee {
    private List<Course> teachingCourses; // List of course Instructor may teach.

    // The Manager class inherits the Employee class constructor

    public Instructor(String userID, String firstName, String lastName, String email, String address,
            String dateOfBirth,
            String phoneNumber, String emergencyContact, String password, String role) {
        super(userID, firstName, lastName, email, address, dateOfBirth, phoneNumber, emergencyContact, password, role);
        this.teachingCourses = new ArrayList<>();
    } // new instructor, new list.

    // Initialize additional fields specific to Manager, if any
    // Getter and Setter for teachingCourses
    public List<Course> getTeachingCourses() {
        return teachingCourses;
    }

    public void setTeachingCourses(List<Course> teachingCourses) {
        this.teachingCourses = teachingCourses;
    }

    // Dummy implementations for additional methods. For Lecture, MCQQuestion,
    // Lecture video, AssessmentDetails, Project Details, slides as strings for
    // simplicity.

    public void uploadLecture(Course course, String lectureVideo) {
        // Dummy code for lecture creation
        System.out.println("Uploading video lecture for course: " + course.getTitle());

    }

    public void uploadSlides(Course course, String slides) {
        // Dummy code for MCQ question creation
        System.out.println("Uploading slides for course: " + course.getTitle());

    }

    public void createMCQ(Course course, String question) {
        // Dummy code for MCQ question creation
        System.out.println("Creating MCQ question for course: " + course.getTitle());
    }

    public void createExam(Course course, String assessmentDetails) {
        // Dummy code for project creation
        System.out.println("Creating exam for course: " + course.getTitle());
    }

    public void createProject(Course course, String projectDetails) {
        // Dummy code for project creation
        System.out.println("Creating project for course: " + course.getTitle());
    }

    public void manageCourseContent(Course course) {
        // Dummy code for course content management
        System.out.println("Managing course content for course: " + course.getTitle());
    }

    public void communicateWithStudents(Course course, String message) {
        // Dummy code for communication with students
        System.out.println("Communicating with students in course: " + course.getTitle());
    }

    public Course registerCourse(String courseId, String title, String description, int duration, Instructor instructor,
            double cost) {
        System.out.println("Registering course: " + title);
        // Implement course registration logic here
        // Create a new Course object and return it
        Course newCourse = new Course(courseId, title, description, duration, instructor.getUserID(), cost);
        teachingCourses.add(newCourse);
        return newCourse;
    }
}