package model;

import java.util.Scanner;
import model.Manager;
import model.Enquiry;

//Main class will run the two subscenarios. 
public class Main {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println(
                                "We will be running two test sub scenarios in this test, please press any key to continue.");
                String userInput = scanner.nextLine();

                // Subscenario 1.
                System.out.println(
                                "***Initialise Scenarerio 2****\nLodge a general enquiry about the portal which is successfully addressed by the Manager\n Creating new user..");
                User user = new User("user_ID", "Phillip", "Braum", "iHaveAnEnquiry@gmail.com",
                                "user_password");
                System.out.println("To lodge an enquiry please enter your problem below:");
                userInput = scanner.nextLine();
                System.out.println("You entered: " + userInput
                                + "System is lodging.....\nSuccessfully lodged..!. Please be patient while we handle your enquiry");
                Enquiry enquiry = new Enquiry("Enquiry ID#12345", user.getUserID, userInput, false);
                Manager manager = new Manager("manager_ID", "John", "Smith", "mrmanagerman@gmail.com",
                                "managerPassword");
                System.out.printf("Manager Created%nThe ID of the manager is: %s%n", manager.getUserID());
        }

}
