package webpackage;

/**
 * The ResponseMessages class holds server messages
 * that are dynamically generated upon processing of
 * client request.
 *
 */
public class ResponseMessages {

	//Declare all the fields of a ResponseMessages object
	private String incompleteFormMsg;
	private String invalidUserIDMsg;
	private String invalidFirstNameMsg;
	private String invalidLastNameMsg;
	private String invalidUserNameMsg;
	private String invalidAddressMsg;
	private String invalidPhoneMsg;
	private String invalidEmailMsg;
	private String invalidPasswordMsg;
	private String successMsg;
	
	//Initializes all the fields of the class with dynamic messages
	public ResponseMessages()
	{
		this.incompleteFormMsg = "<html><head><title>Incomplete Form</title></head><body><h4 style='font-weight:bold; color:red;'>Incoplete Form. One or several fields are empty</h4><br><a href='index.jsp'>Go Back to Registration</a></body></html>";
		this.invalidUserIDMsg = "<html><head><title>Validation Error</title></head><body><h4 style='font-weight:bold; color:red;'>Invalid Student ID</h4><br><a href='index.jsp'>Go Back to Registration</a></body></html>";
		this.invalidFirstNameMsg = "<html><head><title>Validation Error</title></head><body><h4 style='font-weight:bold; color:red;'>Invalid First Name</h4><br><a href='index.jsp'>Go Back to Registration</a></body></html>";	
		this.invalidLastNameMsg = "<html><head><title>Validation Error</title></head><body><h4 style='font-weight:bold; color:red;'>Invalid Last Name</h4><br><a href='index.jsp'>Go Back to Registration</a></body></html>";
		this.invalidUserNameMsg = "<html><head><title>Validation Error</title></head><body><h4 style='font-weight:bold; color:red;'>Invalid Username</h4><br><a href='index.jsp'>Go Back to Registration</a></body></html>";
		this.invalidAddressMsg = "<html><head><title>Validation Error</title></head><body><h4 style='font-weight:bold; color:red;'>Invalid Home Address</h4><br><a href='index.jsp'>Go Back to Registration</a></body></html>";
		this.invalidPhoneMsg = "<html><head><title>Validation Error</title></head><body><h4 style='font-weight:bold; color:red;'>Invalid Phone number</h4><br><a href='index.jsp'>Go Back to Registration</a></body></html>";
		this.invalidEmailMsg = "<html><head><title>Validation Error</title></head><body><h4 style='font-weight:bold; color:red;'>Invalid Email Address</h4><br><a href='index.jsp'>Go Back to Registration</a></body></html>";
		this.invalidPasswordMsg = "<html><head><title>Validation Error</title></head><body><h4 style='font-weight:bold; color:red;'>Invalid User Password</h4><br><a href='index.jsp'>Go Back to Registration</a></body></html>";
		this.successMsg = "<html><head><title>Registration Success</title></head><body><h4 style='font-weight:bold; color:green;'>Successfully registerd new Student !</h4><br><a href='index.jsp'>Go Back to Registration</a></body></html>";
	}
	//GETTER METHODS.
	//ALL THE FIELD VALUES ARE SET IN THE CONSTRUCTOR
	
	public String getIncompleteFormMsg() {
		return incompleteFormMsg;
	}
	
	public String getInvalidUserIDMsg() {
		return invalidUserIDMsg;
	}
	
	public String getInvalidFirstNameMsg() {
		return invalidFirstNameMsg;
	}
	
	public String getInvalidLastNameMsg() {
		return invalidLastNameMsg;
	}
	
	public String getInvalidUserNameMsg() {
		return invalidUserNameMsg;
	}
	
	public String getInvalidAddressMsg() {
		return invalidAddressMsg;
	}
	
	public String getInvalidPhoneMsg() {
		return invalidPhoneMsg;
	}
	
	public String getInvalidEmailMsg() {
		return invalidEmailMsg;
	}
	
	public String getInvalidPasswordMsg() {
		return invalidPasswordMsg;
	}
	
	public String getSuccessMsg() {
		return successMsg;
	}
	
	
	
}
