/**
 * 
 */
package model;

/**
 * Administrator entity
 * @author aureliadelaune
 */

public class Administrator extends User {

	private int idAdmin;

	/**
	 * constructor by default for the Administrator entity
	 */
	public Administrator(){
		
	}
	
	/**
	 * full constructor for the Administrator entity, calling the User constructor, with:
	 * @param fname
	 * @param lname
	 * @param login
	 * @param password
	 * @param identifiantAdmin
	 */
	public Administrator(String fname, String lname, String login, String password, int idAdmin) {
		super(fname, lname, login, password);
		this.setIdAdmin(idAdmin);
	}

	/**
	 * @return the identifiantAdmin
	 */
	public int getIdAdmin() {
		return idAdmin;
	}

	/**
	 * @param identifiantAdmin the identifiantAdmin to set
	 */
	public void setIdAdmin(int idAdmin) {
		this.idAdmin = idAdmin;
	}
	
}
