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
                String userInput = scanner.nextLine();

                // Subscenario 1.
                System.out.println(
                                "***Initialise Scenarerio 2****\nLodge a general enquiry about the portal which is successfully addressed by the Manager\n**Creating new user...\n");
                User user = new User("user_ID", "Phillip", "Braum", "iHaveAnEnquiry@gmail.com",
                                "user_password");
                System.out.println("To lodge an enquiry please enter your problem below:");
                userInput = scanner.nextLine();
                Enquiry enquiry = new Enquiry("ID#12345", user.getUserID(), userInput, false);

                System.out.print("**Creating new manager...");
                Manager manager = new Manager("manager_ID", "John", "Smith", "mrmanagerman@gmail.com",
                                "managerPassword");
                System.out.printf("%nThe ID of the manager is: %s%n", manager.getUserID());
                manager.answerEnquiry(enquiry, "#########       Here is the solution to the enquiry     #########");
                System.out.println(enquiry.toString());

        }

}
