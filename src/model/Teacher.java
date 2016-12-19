/**
 * 
 */
package model;

/**Teacher class
 * @author aureliadelaune
 *
 */
public class Teacher extends User{
	private int identifiantTeacher;

	/**
	 * @param fname
	 * @param lname
	 * @param login
	 * @param password
	 * @param identifiantTeacher
	 */
	public Teacher(int identifiantTeacher, String fname, String lname, String login, String password) {
		super(fname, lname, login, password);
		this.setIdentifiantTeacher(identifiantTeacher);
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

	
	

}