/**
 * 
 */
package model;

/**
 * Teacher entity
 * @author aureliadelaune
 *
 */
public class Teacher extends User{
	private int identifiantTeacher;

	/**
	 * constructor by default for the Teacher entity
	 */
	public Teacher(){
		
	}
	
	/**
	 * full constructor for the Teacher entity, calling for the User constructor, with:
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
 * downloadHomework method
 */
	public void downloadHomework(){
		
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