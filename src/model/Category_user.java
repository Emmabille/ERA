/**
 * 
 */
package model;

/**
 * @author aureliadelaune
 *
 */
public class Category_user {
	private int id;
	private String categoryUser;
	
	/**
	 * Default constructor for Category_use entity.
	 */
	public Category_user() {

	}

	/**
	 * Full constructor for the Category_user entity, with:
	 * @param id
	 * @param categoryUser
	 */
	public Category_user(int id, String categoryUser) {
		this.id = id;
		this.categoryUser = categoryUser;
		
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the categoryUser
	 */
	public String getCategoryUser() {
		return categoryUser;
	}

	/**
	 * @param categoryUser the categoryUser to set
	 */
	public void setCategoryUser(String categoryUser) {
		this.categoryUser = categoryUser;
	}
	
	
}
