public class Manager extends User{

    public Manager(String userID, String firstName, String lastName, String email, String address, Date dateOfBirth, String phoneNumber, String emergencyContact, String password, String role, String department, double salary) {
        super(userID, firstName, lastName, email, address, dateOfBirth, phoneNumber, emergencyContact, password, role);    
    }

    public void searchEnquiry() {
        System.out.println("1: *\"The images and videos are loading very small\"*");
        System.out.println("2: *\"I can't access the course content \"*");
        System.out.println("3: *\"The website gives me an error message when I try to login\"*");
    }

    public void answerEnquiry(String answerEnquiry){
        System.out.println("Here is the solution to the eqnuiry...")

    }




}
