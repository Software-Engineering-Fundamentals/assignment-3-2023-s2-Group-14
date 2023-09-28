package main.java.model;

import java.util.Scanner;

//Main class will run the two subscenarios. 
public class Main {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println(
                                "We will be running two test sub scenarios in this test, please press any key to continue.");
                // Prompt the user to continue.
                scanner.nextLine();

                // Subscenario 1.
                System.out.println(
                                "***Initialise Scenarerio 1****\nInstructor registers a course on the learning portal/website\n\n**Creating new instructor...");
                // Creating a Instructor to register Course
                Instructor instructor = new Instructor("Instructor_ID", "Guy", "Lamar", "mrInstructor@gmail.com",
                                "instructorAddress",
                                "instructorDOB", "04123456789", "E: 04123456789", "instructo_password", "Instructor");

                // User Login Successful, LOGIN = TRUE
                System.out.println("ALT 1: Login = " + instructor.login("mrInstructor@gmail.com", "instructo_password"));
                // Space for readability
                System.out.println();
                // User Login Unsuccessful, LOGIN = FALSE
                System.out.println("ALT 2: Login = " + instructor.login("mrInstructor@gmail.com", "wrong_password"));

                System.out.printf("%nThe ID of the instructor is: %s%n", instructor.getUserID());
                System.out.println("To create a course please fill in the details:\n");
                // We will now have the instructor create a course with prefilled data.
                // FIRST ALT OPTION courseExists = False: Course doesnt exist.
                System.out.println("ALT OPTION 1: Course can be created");
                instructor.registerCourse("exampleCourseID", "Computer science", "Here is a sample description", 3,
                                instructor, 4999.00);
                System.out.println("Press any key to continue with the other option. When the course already exists.");
                scanner.nextLine();

                // Second ALT OPTION courseExists = True: Course already exists.
                System.out.println("ALT OPTION 2: Course already exists.");
                instructor.registerCourse("exampleCourseID", "Computer science", "This course already exist!!!", 3,
                                instructor, 4999.00);
                System.out.println(
                                "***End of first sub scenario.***\n\nPress any key to continue with the second scenario.");
                scanner.nextLine();
                // Subscenario 2.
                System.out.println(
                                "***Initialise Scenarerio 2****\nLodge a general enquiry about the portal which is successfully addressed by the Manager\n\n**Creating new Student...\n");

                // Creating a student to lodge an enquiry.
                Student student = new Student("user_ID", "Phillip", "Braum", "iHaveAnEnquiry@gmail.com",
                                "studentAddress",
                                "StudentDOB", "04123456789", "E: 04123456789", "student_password", "Student");

                // student Login Successful, LOGIN = TRUE
                System.out.println("ALT 1: login = " + student.login("iHaveAnEnquiry@gmail.com", "student_password"));
                // Space for readability
                System.out.println();
                // student Login Unsuccessful, LOGIN = FALSE
                System.out.println("ALT 2: login = " + student.login("iHaveAnEnquiry@gmail.com", "wrong_password"));

                System.out.printf("%nThe ID of the user is: %s%n", student.getUserID());
                System.out.println("To lodge an enquiry please enter your problem below:");

                // Sample Enquiry
                String sampleEnquiry = "The images and videos are loading very slow";

                // Create a new Enquiry
                Enquiry enquiry1 = User.createEnquiry("ID#12345", student, sampleEnquiry, false);
                System.out.print("**Creating new manager...");

                // Create a manager to reply and handle enquiry
                Manager manager = new Manager("manager_ID", "John", "Smith", "mrmanagerman@gmail.com", "ManagerAddress",
                                "ManagerDOB",
                                "04123456789", "E: 04123456789",
                                "managerPassword", "Manager");

                System.out.printf("%nThe ID of the manager is: %s%n", manager.getUserID());
                System.out.println();

                // User Login Successful, LOGIN = TRUE
                System.out.println("ALT 1: Login = " + manager.login("mrmanagerman@gmail.com", "managerPassword"));
                // Space for readability
                System.out.println();
                // User Login Unsuccessful, LOGIN = FALSE
                System.out.println("ALT 2: Login = " + manager.login("mrmanagerman@gmail.com", "wrong_password"));

                // Manager Views Enquiries, and retrives one.
                System.out.println("\nRetrieving Enquiries...");
                manager.viewEnquiries();

                // FIRST ALT OPTION isResolved = true: Manager replies successfully
                System.out.println("******ALT OPTION 1******");
                manager.answerEnquiry(enquiry1, "#########       Here is the solution to the enquiry     #########",
                                true);
                // Tostring method to successful enquiry

                System.out.println(enquiry1.toString());

                // SECOND ALT OPTION isResolved = false: Manager replies require more info

                System.out.println(
                                "\nWe will now run the alternative path, where an enquiry requires more information. Please press any key");
                scanner.nextLine();
                System.out.print("******ALT OPTION 2******");
                Enquiry enquiry2 = new Enquiry("ID#12345", student.getUserID(), sampleEnquiry, false);

                // Manager requires more information,
                manager.answerEnquiry(enquiry2,
                                "#########       We require more information for this enquiry     #########",
                                false);

                // toString method to print enquiry need more info
                System.out.println(enquiry2.toString());
                scanner.close();

        }

}
