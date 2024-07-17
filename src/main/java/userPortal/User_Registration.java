package userPortal;

import java.util.Scanner;

public class User_Registration {

	//firstName and LastName
    public static boolean validateName(String name) {
        return name.matches("^[A-Z][a-zA-Z]{2,}$");
    }

    //special characters
    public static String removeSpecialCharacters(String input) {
        return input.replaceAll("[^a-zA-Z0-9 ]", "");
    }

    //email
    public static boolean validateEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9.%+-]+\\.[a-zA-Z0-9.%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}(\\.[a-zA-Z]{2,6})?$";
        return email.matches(emailRegex);
    }
    
    //mobile number
    public static boolean validateMobileNumber(String mobileNumber) {
        String mobileRegex = "^(91 )?\\d{10}$";
        return mobileNumber.matches(mobileRegex);
    }
    
    //password
    public static boolean validatePassword(String password) {

    	String PassRegex = "^(?=.*[A-Z])(?=.*[0-9])(?=.{0,9}[!@#$%^&*()_+=-{};:'<>,./?][^!@#$%^&*()_+=-{};:'<>,./?]{0,7})(?!.*[@.]).{8,}$";
    	return password.matches(PassRegex);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first name: ");
        String firstName = sc.nextLine();
        firstName = removeSpecialCharacters(firstName);

        System.out.print("Enter the last name: ");
        String lastName = sc.nextLine();
        lastName = removeSpecialCharacters(lastName);

        System.out.print("Enter the emails (separated by commas): ");
        String emailsInput = sc.nextLine();

        String[] emails = emailsInput.split(",");
        boolean allEmailsValid = true;
        for (String email : emails) {
            email = email.trim();
            if (validateEmail(email)) {
                System.out.println(email + " is a valid email.");
            } else {
                System.out.println(email + " is not a valid email.");
                allEmailsValid = false;
            }
        }
        
        System.out.print("Enter the mobile number: ");
        String mobileNo = sc.nextLine();
        
        System.out.print("Enter the password: ");
        String password = sc.next();

        sc.close();

        if (validateName(firstName) && validateName(lastName)) {
            System.out.println(firstName + " " + lastName + " is a valid name.");
        } else {
            System.out.println(firstName + " " + lastName + " is not a valid name.");
        }
        
        if (validateMobileNumber(mobileNo)) {
            System.out.println(mobileNo + " is a valid mobile number.");
        } else {
            System.out.println(mobileNo + " is not a valid mobile number.");
        }
        
        if (validatePassword(password)) {
            System.out.println(password + " is a valid password.");
        } else {
            System.out.println(password + " is not a valid password.");
        }
    }
}
