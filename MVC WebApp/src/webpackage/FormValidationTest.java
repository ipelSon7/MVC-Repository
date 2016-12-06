package webpackage;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assume;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class FormValidationTest {

	//Define enumerated type for different inputs
	private enum InputType{ID, NAME, USERNAME, ADDRESS, PHONE, EMAIL, PASSWORD};
	
	private InputType type;
	private String sampleInput;
	private FormValidation validator;
	private String successMsg;
	//private String failureMsg; // Use with assertFalse statements
	//Inject test data via constructor.
	public FormValidationTest(InputType type,String sampleInput){
		this.type = type;
		this.sampleInput = sampleInput;
		
		//Create a new FormValidation object to test its validation methods
		validator = new FormValidation();
		successMsg = "Passed Test !";
		//failureMsg = "Failed Test ...";
	}
	
	//Defines test samples for different types of input
	@Parameters
	public static Collection<Object[]>testSamples(){
		return Arrays.asList(new Object[][]{

				//USE ASSERTFALSE FOR SECOND SAMPLE INPUT OF EACH TEST CASE
				
				//Test samples for student ID
				{InputType.ID, "127893"},
				//{InputType.ID, "128saet439"},
				
				//Test samples for student first and last name
				{InputType.NAME, "Jonathan"},
				//{InputType.NAME, "Apha03-rest"},
				
				//Test samples for student user name
				{InputType.USERNAME, "ipl8934"},
				//{InputType.USERNAME, "----alkalyn0#"},
				
				//Test samples for student address
				{InputType.ADDRESS, "205 Marilyn Ave."},
				//{InputType.ADDRESS, "@674--% =e."},
				
				//Test samples for student phone number
				{InputType.PHONE, "(874)-457-8998"},
				//{InputType.PHONE, "(45530)o89@-23849iaj"},
				
				//Test samples for student email address
				{InputType.EMAIL, "johnsmith@abcd.org"},
				//{InputType.EMAIL, "_E4ra%na@abdcers.com9"},
				
				//Test samples for student password
				{InputType.PASSWORD, "Matrix078"},
				//{InputType.PASSWORD, "abcde$$$6auikdoRandom Character Sequence88"}
				
		});
	}
	
	//DEFINE TEST CASES FOR EACH METHOD OF THE FORMVALIDATION CLASS.
	
	//Test case for student ID
	@Test
	public void testIsIDValid() {
		Assume.assumeTrue(type == InputType.ID);
		assertTrue(successMsg, validator.isIDValid(sampleInput));
	}
	//Test case for student first and last name
	@Test
	public void testIsNameValid() {
		Assume.assumeTrue(type == InputType.NAME);
		assertTrue(successMsg, validator.isNameValid(sampleInput));
	}
	//Test case for student user name
	@Test
	public void testIsUsernameValid() {
		Assume.assumeTrue(type == InputType.USERNAME);
		assertTrue(successMsg, validator.isUsernameValid(sampleInput));
	}
	
	//Test case for student address
	@Test
	public void testIsAddressValid() {
		Assume.assumeTrue(type == InputType.ADDRESS);
		assertTrue(successMsg,validator.isAddressValid(sampleInput));
	}
	
	//Test case for student phone number
	@Test
	public void testIsPhoneValid() {
		Assume.assumeTrue(type == InputType.PHONE);
		assertTrue(successMsg,validator.isPhoneValid(sampleInput));
	}
	
	//Test case for student email address
	@Test
	public void testIsEmailValid() {
		Assume.assumeTrue(type == InputType.EMAIL);
		assertTrue(successMsg,validator.isEmailValid(sampleInput));
	}
	
	//Test case for student password
	@Test
	public void testIsPasswordValid() {
		Assume.assumeTrue(type == InputType.PASSWORD);
		assertTrue(successMsg,validator.isPasswordValid(sampleInput));
	}
	
}
