import org.junit.Assert;

import userPortal.User_Registration;

import org.junit.Test;

public class UserRegistrationTest {

	@Test
	public void validFNameTest() {
		Boolean result = User_Registration.validateName("Rohit");
		Assert.assertTrue(result);
	}
	
	@Test
	public void inValidFNameTest() {
		Boolean result = User_Registration.validateName("rohit");
		Assert.assertFalse(result);
	}
	
	@Test
	public void validLNameTest() {
		Boolean result = User_Registration.validateName("Jadhav");
		Assert.assertTrue(result);
	}
	
	@Test
	public void inValidLNameTest() {
		Boolean result = User_Registration.validateName("jadhav");
		Assert.assertFalse(result);
	}
	
	@Test
	public void validEmailTest() {
		Boolean result = User_Registration.validateEmail("jadhavrohit@gmail.com");
		Assert.assertTrue(result);
	}
	
	@Test
	public void inValidEmailTest() {
		Boolean result = User_Registration.validateEmail("Jadhavrohit@gmail.com");
		Assert.assertFalse(result);
	}
	
	@Test
	public void validMobileTest() {
		Boolean result = User_Registration.validateMobileNumber("7875678797");
		Assert.assertTrue(result);
	}
	
	@Test
	public void inValidMobileTest() {
		Boolean result = User_Registration.validateMobileNumber("787567879");
		Assert.assertFalse(result);
	}

}
