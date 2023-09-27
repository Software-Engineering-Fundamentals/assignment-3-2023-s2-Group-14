package main.java.model;

import java.util.Scanner;
import main.java.model.Manager;
import main.java.model.Enquiry;

//Main class will run the two subscenarios. 
public class Main {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println(
                                "We will be running two test sub scenarios in this test, please press any key to continue.");
                // Prompt the user to continue.
                String userInput = scanner.nextLine();

                // Subscenario 1.
                System.out.println(
                                "***Initialise Scenarerio 1****\nInstructor registers a course on the learning portal/website\n\n**Creating new user...\n");

                // Subscenario 2.
                System.out.println(
                                "***Initialise Scenarerio 2****\nLodge a general enquiry about the portal which is successfully addressed by the Manager\n\n**Creating new user...\n");
                // Creating a user to lodge an enquiry.
                User user = new User("user_ID", "Phillip", "Braum", "iHaveAnEnquiry@gmail.com",
                                "user_password");

                // User Login Successful, LOGIN = TRUE
                System.out.println("ALT 1: login = " + user.login("iHaveAnEnquiry@gmail.com", "user_password"));
                // Space for readability
                System.out.println();
                // User Login Unsuccessful, LOGIN = FALSE
                System.out.println("ALT 2: login = " + user.login("iHaveAnEnquiry@gmail.com", "wrong_password"));

                System.out.printf("%nThe ID of the user is: %s%n", user.getUserID());
                System.out.println("To lodge an enquiry please enter your problem below:");

                // Sample Enquiry
                String sampleEnquiry = "The images and videos are loading very slow";

                // Create a new Enquiry
                Enquiry enquiry1 = User.createEnquiry("ID#12345", user, sampleEnquiry, false);
                System.out.print("**Creating new manager...");

                // Create a manager to reply and handle enquiry
                Manager manager = new Manager("manager_ID", "John", "Smith", "mrmanagerman@gmail.com",
                                "managerPassword");
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
                // Print out the successsful answer enquiry.
                System.out.println(enquiry1.toString());

                // SECOND ALT OPTION isResolved = false: Manager replies require more info

                System.out.println(
                                "We will now run the alternative path, where an enquiry requires more information. Please press any key");
                scanner.nextLine();
                System.out.print("******ALT OPTION 2******");
                Enquiry enquiry2 = new Enquiry("ID#12345", user.getUserID(), sampleEnquiry, false);

                // Manager requires more information,
                manager.answerEnquiry(enquiry2, "#########       Here is the solution to the enquiry     #########",
                                false);
                System.out.println(enquiry2.toString());

        }

}
