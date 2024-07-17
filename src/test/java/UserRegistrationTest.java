

import userPortal.User_Registration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import UserException.InvalidInputException;

public class UserRegistrationTest {

	@Test
	public void validFNameTest() {
        try {
            Assertions.assertTrue(User_Registration.validateName("Rohit"));
        } catch (InvalidInputException e) {
            Assertions.fail("Exception should not be thrown");
        }
    }
	
	@Test
	public void inValidFNameTest() {
		try {
			User_Registration.validateName("rohit");
			Assertions.fail("Expected custom exception");
		} catch (InvalidInputException e) {
			Assertions.assertEquals("Invalid name format: rohit", e.getMessage());
		}
		
	}
	
	@Test
	public void validLNameTest() {
		try {
            Assertions.assertTrue(User_Registration.validateName("Jadhav"));
        } catch (InvalidInputException e) {
        	Assertions.fail("Exception should not be thrown");
        }
	}
	
	@Test
	public void inValidLNameTest() {
		try {
			User_Registration.validateName("jadhav");
			Assertions.fail("Expected custom exception");
		} catch (InvalidInputException e) {
			Assertions.assertEquals("Invalid name format: jadhav", e.getMessage());
		}
		
	}
	
	@Test
	public void validEmailTest() {
		try {
			Assertions.assertTrue(User_Registration.validateEmail("jadhav.rohit3004@gmail.com"));
		} catch (InvalidInputException e) {
			Assertions.fail("Exception should not be thrown");
		}
	}
	
	
	@Test
	public void inValidEmailTest() {
		try {
			User_Registration.validateEmail("Jadhav#gmail.com");
			Assertions.fail("Expected custom exception");
		} catch (InvalidInputException e) {
			Assertions.assertEquals("Invalid email format: Jadhav#gmail.com", e.getMessage());
		}
	}
	
	@Test
	public void validMobileTest() {
		try {
			Assertions.assertTrue(User_Registration.validateMobileNumber("7875678797"));
		} catch (InvalidInputException e) {
			Assertions.fail("Exception should not be thrown");
		}
	}
	
	@Test
	public void inValidMobileTest() {
		try {
			User_Registration.validateMobileNumber("787567798");
			Assertions.fail("Expected custom exception");
		} catch (InvalidInputException e) {
			Assertions.assertEquals("Invalid mobile input: 787567798", e.getMessage());
		}
	}
	
	@Test
	public void validPsswordTest() {
		try {
			Assertions.assertTrue(User_Registration.validatePassword("Jadhav#30"));
		} catch (InvalidInputException e) {
			Assertions.fail("Exception should not be thrown");
		}
	}
	
	@Test
	public void inValidPasswordTest() {
		try {
			User_Registration.validatePassword("jadhav");
			Assertions.fail("Expected custom exception");
		} catch (InvalidInputException e) {
			Assertions.assertEquals("Invalid password format: jadhav", e.getMessage());
		}
	}

}
