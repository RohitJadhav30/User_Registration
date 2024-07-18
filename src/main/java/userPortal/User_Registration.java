package userPortal;

import java.util.function.Predicate;

import UserException.InvalidInputException;

public class User_Registration {
	
	private static final String NAME_PATTERN = "^[A-Z][a-zA-Z]{2,}$";
	private static final String EMAIL_PATTERN = "^[a-zA-Z0-9.%+-]+\\.[a-zA-Z0-9.%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}(\\.[a-zA-Z]{2,6})?$";
	private static final String MOBILE_PATTERN = "^(91 )?\\d{10}$";
	private static final String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_+=\\-{}\\[\\]:;<>,./?])(?!.*[@.])(?=\\S+$).{8,}$";
	

	public static boolean validateFields(String input, String regex) {
		return input.matches(regex);
	}
	
	//firstName and LastName
    public static boolean validateName(String input) throws InvalidInputException{
    	Predicate<String> validateName = name -> validateFields(name, NAME_PATTERN);
        if(!validateName.test(input)){
        	throw new InvalidInputException("Invalid name format: " + input);
        }
        return true;
    }

    //email
    public static boolean validateEmail(String input) throws InvalidInputException{
    	Predicate<String> validateEmail = email -> validateFields(email, EMAIL_PATTERN);
    	if(!validateEmail.test(input)) {
        	throw new InvalidInputException("Invalid email format: " + input);
        }
        return true;
    }
    
    //mobile number
    public static boolean validateMobileNumber(String input) throws InvalidInputException{
    	Predicate<String> validateMobile = mobileNo -> validateFields(mobileNo, MOBILE_PATTERN);
        if(!validateMobile.test(input)) {
        	throw new InvalidInputException("Invalid mobile input: " + input);
        }
        return true;
    }
    
    //Password
    public static boolean validatePassword(String input) throws InvalidInputException {
    	Predicate<String> validatePassword = password -> validateFields(password, PASSWORD_PATTERN);
        if (!validatePassword.test(input)) {
            throw new InvalidInputException("Invalid password format: " + input);
        }
        return true;
    }


    public static void main(String[] args) {
        
    }
}
