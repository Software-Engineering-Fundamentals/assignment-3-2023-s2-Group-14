package main.java.model;
import main.java.model.Course;
import main.java.model.PaymentGateway;
public class Student extends User {

    Course course = new Course();
    PaymentGateway payment = new PaymentGateway();

    public Student(){

    }
    public Student(String userID, String firstName, String lastName, String email, String password) {
        super(userID, firstName, lastName, email, password);
    }

    public void enrollCourse(String courseName) {
        //We check if the course is available then we enroll the student into that course
        if (courseName.equals(course.getTitle)){
            System.out.println(getFirstName() + " Enrolled in " + course.getTitle());
        }
    }

    public void accessCourseContent(String courseName){
        if (payment.makePayment(0)== true){
            course.displayCourseContent();
        } 
    }

}
