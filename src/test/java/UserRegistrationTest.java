

import userPortal.User_Registration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class UserRegistrationTest {

	@Test
	public void validFNameTest() {
		Boolean result = User_Registration.validateName("Rohit");
		Assertions.assertTrue(result);
	}
	
	@Test
	public void inValidFNameTest() {
		Boolean result = User_Registration.validateName("rohit");
		Assertions.assertFalse(result);
	}
	
	@Test
	public void validLNameTest() {
		Boolean result = User_Registration.validateName("Jadhav");
		Assertions.assertTrue(result);
	}
	
	@Test
	public void inValidLNameTest() {
		Boolean result = User_Registration.validateName("jadhav");
		Assertions.assertFalse(result);
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"jadhav.rohit3004@gmail.com", "jadhav.254@gmail.com", "gp.dhande12@gmail.com"})
	public void validEmailTest(String mail) {
		Boolean result = User_Registration.validateEmail(mail);
		Assertions.assertTrue(result);
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"Jadhav#gmail.com", 
			"@gmail.com", "205rohit@gmail.com"})
	public void inValidEmailTest(String mail) {
		Boolean result = User_Registration.validateEmail(mail);
		Assertions.assertFalse(result);
	}
	
	@Test
	public void validMobileTest() {
		Boolean result = User_Registration.validateMobileNumber("7875678797");
		Assertions.assertTrue(result);
	}
	
	@Test
	public void inValidMobileTest() {
		Boolean result = User_Registration.validateMobileNumber("787567879");
		Assertions.assertFalse(result);
	}

}
