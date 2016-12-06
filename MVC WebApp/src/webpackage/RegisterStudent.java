package webpackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Servlet implementation class RegisterStudent
 * The Servlet is part of the Controller and holds 
 * the business logic (applies form validation).
 * The RegisterStudent servlet also processes client's
 * requests,persists data in the Model Layer (using Hibernate API)
 *  and generate dynamic contents that is displayed in the View layer
 *  (JSP front-end).
 */
public class RegisterStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	//Validation object to validate user input.
	private FormValidation validator;
	//ResponseMessages object to get dynamic response messages.
	private ResponseMessages responseMsg;
	//Used to write messages on client's end.
	private PrintWriter msgWriter;
    /**
     * HttpServlet#HttpServlet()
     */
    public RegisterStudent() {
        super();
    }

    //Sends user data to the Model (data layer) of the application using Hibernate.
    public String registerNewStudent(String studentID, String firstname,String lastname,
			String username, String address, String phone, String email, String password){
    	
    	//Create a Student object
    	Student student = new Student();
    	//Set all the fields of the student object
    	student.setStudentID(Integer.parseInt(studentID));
    	student.setFirstName(firstname);
    	student.setLastName(lastname);
    	student.setUserName(username);
    	student.setAddress(address);
    	student.setPhone(phone);
    	student.setEmail(email);
    	student.setPassword(password);
    	
    	//Persist student object in the database (studentdb) using Hibernate
    	//Create a SessionFactory object
    	Configuration cfg = new Configuration().configure();
    	SessionFactory sessionFactory = cfg.buildSessionFactory();
    	Session session = sessionFactory.openSession();
    	session.beginTransaction();
    	session.save(student);
    	session.getTransaction().commit();
    	//Notify end client that the registration was successful
    	return responseMsg.getSuccessMsg();
    }
	/**
	 * The doGet method is invoked when the client uses the HTTP GET method
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request,response);
	}

	/**
	 * The doPost method is invoked when the client uses the HTTP POST method
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request,response);
	}
	
	public void service(HttpServletRequest request, HttpServletResponse response)throws IOException{
		//Create a FormValidation object to validate user data
		validator = new FormValidation();
		//Holds server messages
		responseMsg = new ResponseMessages();
		//Output stream for sending server responses to client
		msgWriter = response.getWriter();
		
		//Retrieve parameter values from HTTP request
		String studentID = request.getParameter("studentIDField");
		String firstname = request.getParameter("studentFirstNameField");
		String lastname =  request.getParameter("studentLastNameField");
		String username = request.getParameter("studentUserNameField");
		String address = request.getParameter("studentAddressField");
		String phone = request.getParameter("studentPhoneField");
		String email =  request.getParameter("studentEmailField");
		String password = request.getParameter("studentPasswordField");
		
		if (!validator.isFormComplete(studentID, firstname, lastname, username, address, phone, email, password)){
			String incompletMsg = responseMsg.getIncompleteFormMsg();
			msgWriter.print(incompletMsg);
		}
		else if (!validator.isIDValid(studentID))
			msgWriter.print(responseMsg.getInvalidUserIDMsg());
		
		else if (!validator.isNameValid(firstname))
			msgWriter.print(responseMsg.getInvalidFirstNameMsg());
		else if (!validator.isUsernameValid(username))
			msgWriter.print(responseMsg.getInvalidUserNameMsg());
		else if (!validator.isAddressValid(address))
			msgWriter.print(responseMsg.getInvalidAddressMsg());
		else if (!validator.isPhoneValid(phone))
			msgWriter.print(responseMsg.getInvalidPhoneMsg());
		else if (!validator.isEmailValid(email))
			msgWriter.print(responseMsg.getInvalidEmailMsg());
		else if (!validator.isPasswordValid(password))
			msgWriter.print(responseMsg.getInvalidPasswordMsg());
		
		/*If all the form data is valid, register user in database (studentdb) 
		 * and send success message.
		 */
		else{
			msgWriter.print(registerNewStudent(studentID, firstname, lastname, username, address, phone, email, password));
		}
			
			
	}

}
