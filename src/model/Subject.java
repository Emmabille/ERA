package model;

import java.util.Date;

public class Subject {
	private int idSubject;
	private String title;
	private Date creatAt;
	private Date deadline;
	private int  idgroupe; 
	private String description;
	private int idPromo;
	
	
	public Subject(){
		
	}


	/**
	 * @param idSubject
	 * @param title
	 * @param creatAt
	 * @param deadline
	 * @param idgroupe
	 * @param description
	 * @param idPromo
	 */
	public Subject(int idSubject, String title, Date creatAt, Date deadline, int idgroupe, String description,
			int idPromo) {
		super();
		this.idSubject = idSubject;
		this.title = title;
		this.creatAt = creatAt;
		this.deadline = deadline;
		this.idgroupe = idgroupe;
		this.description = description;
		this.idPromo = idPromo;
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
	 * @return the creatAt
	 */
	public Date getCreatAt() {
		return creatAt;
	}


	/**
	 * @param creatAt the creatAt to set
	 */
	public void setCreatAt(Date creatAt) {
		this.creatAt = creatAt;
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
	 * @return the idgroupe
	 */
	public int getIdgroupe() {
		return idgroupe;
	}


	/**
	 * @param idgroupe the idgroupe to set
	 */
	public void setIdgroupe(int idgroupe) {
		this.idgroupe = idgroupe;
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
	
	
	
	
	
	
	
	
	
	
	

}
