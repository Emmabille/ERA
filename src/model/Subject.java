package model;

import java.util.Date;

public class Subject {
	private int idSubject;
	private String title;
	private Date createAt;
	private Date deadline;
	private int  groupSize; 
	private String description;
	private int idPromo;
	private String specialty;
	
	
	
	public Subject(){
		
	}


	/**
	 * @param idSubject
	 * @param title
	 * @param createAt
	 * @param deadline
	 * @param idgroupe
	 * @param description
	 * @param idPromo
	 */
	public Subject(int idSubject, String title, int groupSize, String description,
			int idPromo, String specialty) {
		super();
		this.idSubject = idSubject;
		this.title = title;
		this.createAt = new Date();
		//this.deadline = deadline;
		this.groupSize = groupSize;
		this.description = description;
		this.idPromo = idPromo;
		this.specialty= specialty;
	}


	/**
	 * @return the idSubject
	 */
	public int getIdSubject() {
		return idSubject;
	}


	/**
	 * @param idSubject the idSubject to set
	 */
	public void setIdSubject(int idSubject) {
		this.idSubject = idSubject;
	}


	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}


	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}


	/**
	 * @return the createAt
	 */
	public Date getCreateAt() {
		return createAt;
	}


	/**
	 * @param createAt the createAt to set
	 */
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}


	/**
	 * @return the deadline
	 */
	public Date getDeadline() {
		return deadline;
	}


	/**
	 * @param deadline the deadline to set
	 */
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}


	/**
	 * @return the groupSize
	 */
	public int getGroupSize() {
		return groupSize;
	}


	/**
	 * @param groupSize the groupSize to set
	 */
	public void setGroupSize(int groupSize) {
		this.groupSize = groupSize;
	}


	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}


	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}


	/**
	 * @return the idPromo
	 */
	public int getIdPromo() {
		return idPromo;
	}


	/**
	 * @param idPromo the idPromo to set
	 */
	public void setIdPromo(int idPromo) {
		this.idPromo = idPromo;
	}


	/**
	 * @return the specialty
	 */
	public String getSpecialty() {
		return specialty;
	}


	/**
	 * @param specialty the specialty to set
	 */
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}


	
	
	
	
	
	
	
	
	

}
