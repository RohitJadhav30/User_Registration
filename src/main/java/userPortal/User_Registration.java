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
	}
    	return true;

    }

    public static void main(String[] args) {
        
    }
}
