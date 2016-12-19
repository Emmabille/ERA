/**
 * 
 */
package model;

/**
 * @author aureliadelaune
 *
 */
public class Administrator extends User{
	private int identifiantAdmin;

	/**
	 * @param fname
	 * @param lname
	 * @param login
	 * @param password
	 * @param identifiantAdmin
	 */
	public Administrator(String fname, String lname, String login, String password, int identifiantAdmin) {
		super(fname, lname, login, password);
		this.setIdentifiantAdmin(identifiantAdmin);
	}

	/**
	 * @return the identifiantAdmin
	 */
	public int getIdentifiantAdmin() {
		return identifiantAdmin;
	}

	/**
	 * @param identifiantAdmin the identifiantAdmin to set
	 */
	public void setIdentifiantAdmin(int identifiantAdmin) {
		this.identifiantAdmin = identifiantAdmin;
	}

	

	
}
