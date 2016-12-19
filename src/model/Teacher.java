/**
 * 
 */
package model;

/**Teacher class
 * @author aureliadelaune
 *
 */
public class Teacher {
	private int identifiantTeacher;
	private String userName;
	private String password;
	
	public Teacher(){		
	}
	
	public Teacher(String userName, String password){
		this.userName = userName;
		this.password = password;
	}

	/**
	 * @return the identifiantTeacher
	 */
	public int getIdentifiantTeacher() {
		return identifiantTeacher;
	}

	/**
	 * @param identifiantTeacher the identifiantTeacher to set
	 */
	public void setIdentifiantTeacher(int identifiantTeacher) {
		this.identifiantTeacher = identifiantTeacher;
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
		this.password = password;
	}
	
}