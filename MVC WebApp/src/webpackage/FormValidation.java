package webpackage;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * The FormValidation class defines several methods for
 * validating user-entered data. This class defines the business
 * logic of the application and is instantiated in the RegisterStudent
 * HTTP servlet for input validation. Each validation method is unit-tested
 * by the test class ValidationTest.
 */
public class FormValidation {
	
	//DEFINE PROPERTIES OF THE FORMVALIDATION CLASS
	
	//REGULAR EXPRESSION FIELDS-------------------
	
	private String IDRegex;
	private String nameRegex;
	private String userNameRegex;
	private String emailRegex;
	private String addressRegex;
	private String phoneRegex;
	private String passwordRegex;
	
	//DEFINE PATTERN FIELDS-----------------------
	
	private Pattern IDPattern;
	private Pattern namePattern;
	private Pattern userNamePattern;
	private Pattern emailPattern;
	private Pattern addressPattern;
	private Pattern phonePattern;
	private Pattern passwordPattern ;
	
	/*Define constructor to initialize the internal
	 * state of a FormaValidation object.
	 */
	public FormValidation(){
		
		//DEFINE INPUT REGULAR EXPRESSIONS (REGEX)
		
		//The student ID must be 6-digit long
		IDRegex = "^[0-9]{6}$";
		/*First and last names must only contain letters
		 * and must be 4-10 character long. 
		 */
		nameRegex = "^[a-zA-Z]{4,10}$";
		//Username Regex.
		userNameRegex = "^[a-zA-Z0-9_.\\s]{4,10}";
		//Email Regex
		emailRegex =  "^[a-zA-Z0-9._]+@[a-zA-Z._]+\\.[a-zA-Z]{2,6}$";
		//Regex for the student address
		addressRegex = "^[a-zA-Z0-9._,\\s]{10,100}$";
		/*Phone number Regex.
		 * Phone numbers can be of the following forms:
		 * 2344567890
		 * 234.456.7890
		 * 234-456-7890
		 * (234).456.7890
		 * (234)-456-7890
		 */
		phoneRegex = "^\\(?[0-9]{3}\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
		//Password Regex. Must be 6-16 character long.
		passwordRegex = "^[a-zA-Z0-9_.\\s]{6,16}$";
		
		//DEFINE PATTERNS FOR REGEX.
		//A Pattern object is obtained by compiling a given regex string.
		
		IDPattern = Pattern.compile(IDRegex);
		namePattern = Pattern.compile(nameRegex);
		userNamePattern = Pattern.compile(userNameRegex);
		emailPattern = Pattern.compile(emailRegex);
		addressPattern = Pattern.compile(addressRegex);
		phonePattern = Pattern.compile(phoneRegex);
		passwordPattern = Pattern.compile(passwordRegex);
	}
	
	
	
	//DEFINE VALIDATION METHODS
	
	 //Checks whether user has filled all the fields of the form
	public boolean isFormComplete(String studentID, String firstname,String lastname,
			String username, String address, String phone, String email, String password){
		
		if(studentID.isEmpty() || firstname.isEmpty()||lastname.isEmpty() || username.isEmpty()||
				address.isEmpty() || phone.isEmpty() || email.isEmpty() || password.isEmpty())
			return false;
		return true;
	}
	
	//Validates user ID
	public boolean isIDValid(String userID){
		Matcher IDMatcher = IDPattern.matcher(userID);
		return IDMatcher.matches();
	}
	//Validate student's name
	public boolean isNameValid(String name){
		Matcher nameMatcher = namePattern.matcher(name);
		return nameMatcher.matches();
	}
	//Validates student's user name
	public boolean isUsernameValid(String username){
		Matcher usernameMatcher = userNamePattern.matcher(username);
		return usernameMatcher.matches();
	}
	//Validates student's email
	public boolean isEmailValid(String email){
		Matcher emailMatcher = emailPattern.matcher(email);
		return emailMatcher.matches();
	}
	//Validate student's address
	public boolean isAddressValid(String address){
		Matcher addressMatcher = addressPattern.matcher(address);
		return addressMatcher.matches();
	}
	//Validates student's phone number
	public boolean isPhoneValid(String phone){
		Matcher phoneMatcher = phonePattern.matcher(phone);
		return phoneMatcher.matches();
	}
	//Validates student's password
	public boolean isPasswordValid(String password){
		Matcher passwordMatcher = passwordPattern.matcher(password);
		return passwordMatcher.matches();
	}
}
