package userPortal;

import UserException.InvalidInputException;

public class User_Registration {

	//firstName and LastName
    public static boolean validateName(String name) throws InvalidInputException{
        if(!name.matches("^[A-Z][a-zA-Z]{2,}$")){
        	throw new InvalidInputException("Invalid name format: " + name);
        }
        return true;
    }

    //email
    public static boolean validateEmail(String email) throws InvalidInputException{
        String emailRegex = "^[a-zA-Z0-9.%+-]+\\.[a-zA-Z0-9.%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}(\\.[a-zA-Z]{2,6})?$";
        if(!email.matches(emailRegex)) {
        	throw new InvalidInputException("Invalid email format: " + email);
        }
        return true;
    }
    
    //mobile number
    public static boolean validateMobileNumber(String mobileNumber) throws InvalidInputException{
        String mobileRegex = "^(91 )?\\d{10}$";
        if(!mobileNumber.matches(mobileRegex)) {
        	throw new InvalidInputException("Invalid mobile input: " + mobileNumber);
        }
        return true;
    }
    

    public static boolean validatePassword(String password) throws InvalidInputException {
        String passRegex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_+=\\-{}\\[\\]:;<>,./?])(?!.*[@.])(?=\\S+$).{8,}$";
        if (!password.matches(passRegex)) {
            throw new InvalidInputException("Invalid password format: " + password);

    public static boolean validatePassword(String password) {


    	String PassRegex = "^(?=.*[A-Z])(?=.*[0-9])(?=.{0,9}[!@#$%^&*()_+=-{};:'<>,./?][^!@#$%^&*()_+=-{};:'<>,./?]{0,7})(?!.*[@.]).{8,}$";
    	return password.matches(PassRegex);


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
        return true;
    }


    public static void main(String[] args) {
        
    }
}
