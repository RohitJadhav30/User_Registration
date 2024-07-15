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
        String emailRegex = "^[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]+)*(?:\\.[a-zA-Z]{2,})$";
        return email.matches(emailRegex);
    }
    
    //mobile number
    public static boolean validateMobileNumber(String mobileNumber) {
        String mobileRegex = "^(91 )?\\d{10}$";
        return mobileNumber.matches(mobileRegex);
    }
    
    //password
    public static boolean validatePassword(String password) {


    	if(password.length() < 8) {
    		return false;
    	}

    	if(!password.matches(".*[A-Z].*")) {
    		return false;
    	}

    	
    	if(password.length() < 8) {
    		return false;
    	}
    	
    	if(!password.matches(".*[A-Z].*")) {
    		return false;
    	}

    	if(!password.matches(".*\\d.*")){
    		return false;
    	}
    	
    	if(!(password.replaceAll("[A-Za-z0-9]", "").length() == 1)) {
    		return false;
    	}
    	return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first name: ");
        String firstName = sc.nextLine();
        firstName = removeSpecialCharacters(firstName);

        System.out.print("Enter the last name: ");
        String lastName = sc.nextLine();
        lastName = removeSpecialCharacters(lastName);

        System.out.print("Enter the email: ");
        String email = sc.nextLine();
        
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

        if (validateEmail(email)) {
            System.out.println(email + " is a valid email.");
        } else {
            System.out.println(email + " is not a valid email.");
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
