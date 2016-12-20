/**
 * 
 */
package model;

import java.util.Date;

/**
 * Archive entity
 * @author aureliadelaune
 *
 */
public class Archive {
	private int identifiantArchive;
	private String title;
	private String grade;
	private String specialty;
	private String nameTeacher;
	private Date createAt;
	
	/**
	 * Default constructor for the Archive entity.
	 */
	public Archive(){
		
	}

	/**
	 * Constructor for the Archive entity, with:
	 * @param identifiantArchive
	 * @param title
	 * @param grade
	 * @param specialty
	 * @param nameTeacher
	 * @param createAt
	 */
	public Archive(int identifiantArchive) {
		this.identifiantArchive = identifiantArchive;
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	/**
	 * toString method for the Archive entity.
	 */
	@Override
	public String toString() {
		return "Archive [identifiant = " + identifiantArchive + ", title = " + title + ", grade = " + grade
				+ ", specialty = " + specialty + ", teacher's name = " + nameTeacher + ", createAt =" + createAt + "]";
	}
	
	
}
