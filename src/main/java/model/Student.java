package main.java.model;
import main.java.model.Course;
public class Student extends User {
    Course course = new Course();

    public Student(String userID, String firstName, String lastName, String email, String password) {
        super(userID, firstName, lastName, email, password);
    }

    public void enrollCourse(String courseName) {
        if (courseName.equals(course.getTitle)){
            System.out.println(getFirstName() + " Enrolled in " + course.getTitle());
        }
    }

    public void accessCourseContent(String courseName){
        if (courseName.equals(course.getTitle)){
            System.out.println("Course Content accessed:\nBy "+ this.getFirstName());
        }
    }

}
