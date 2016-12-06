package webpackage;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Mark the class as an entity so it can be persisted 
 * in a database using Hibernate. The Student class
 * contains information about a student.
 */
@Entity
public class Student {

	//DECLARE THE PROPERTIES OF THE STUDENT CLASS
	
	//The student's ID number used as the primary key.
	@Id
	private long studentID;
	
	private String firstName;
	private String lastName;
	private String userName;
	private String address;
	private String phone;
	private String email;
	private String password;
	
	//GETTERS AND SETTERS FOR THE FIELDS OF THE STUDENT CLASS
	public long getStudentID() {
		return studentID;
	}
	public void setStudentID(long studentID) {
		this.studentID = studentID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}//End of Student class
