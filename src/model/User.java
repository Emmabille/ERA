/**
 * 
 */
package model;


/**
 * User entity
 * @author aureliadelaune
 *
 */
public class User {
	private int idUser;
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	
/**
 * default constructor for the User entity, no parameter
 */
	public User(){
	}
/**
 * full constructor for the User entity, with:
 * @param fname
 * @param lname
 * @param login
 * @param password
 */
	public User(String fname, String lname, String login, String password){
		this.firstName = fname;
		this.lastName = lname;
		this.userName = login;
		this.password = password;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
/**
 * toString method for the User entity
 */
	@Override
	public String toString() {
		return "First Name = " + firstName + ", Last Name = " + lastName + ", User Name = " + userName + ", Password = "
				+ password;
	}
/**
 * connect method
 */
	public void connect(){

	}
	
/**
 * disconnect method
 */
	public void disconnect(){
		
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return idUser;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.idUser = id;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
//		PasswordEncoder crypto = new Md5PasswordEncoder();
//		this.password = crypto.encodePassword(password, null);
		this.password = password;
	}

}