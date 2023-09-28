package main.java.model;

/**
 * Employee For manager, instructors, IT manager, financial manager and staff
 * only
 */
public class Employee extends User {
    // The Employee class inherits the User class constructor
    public Employee(String userID, String firstName, String lastName, String email, String address, String dateOfBirth,
            String phoneNumber, String emergencyContact, String password, String role) {
        super(userID, firstName, lastName, email, address, dateOfBirth, phoneNumber, emergencyContact, password, role);
        // Initialize additional fields specific to Student, if any
    }

    // Dummy method: Send automated emails to students
    public void sendAutomatedEmailsToStudents(Course course, String message) {
        // In a real system, this method would send automated emails to students
        System.out.println("Automated email sent to students of course " + course.getTitle() + ": " + message);
    }

    // Dummy method: Access student details for a course
    public void accessStudentDetails(Student student) {
        // In a real system, this method would provide access to student details for
        // String the details to be more easy to read.
    }

    // Dummy method: Access course details
    public void accessCourseDetails(Course course) {
        // In a real system, this method would provide access to course details
        System.out.println("Accessing details for course " + course.getTitle());
    }

    // Dummy method: Lock a course
    public void lockCourse(Course course) {
        // In a real system, this method would lock the course to prevent access.
        System.out.println("Course " + course.getTitle() + " locked.");
    }

    // Dummy method: Publish a course
    public void publishCourse(Course course) {
        // In a real system, this method would make the course available to students.
        System.out.println("Course " + course.getTitle() + " published.");
    }

    // Dummy method: Unpublish a course
    public void unpublishCourse(Course course) {
        // In a real system, this method would hide the course from students.
        System.out.println("Course " + course.getTitle() + " unpublished.");
    }
}
