package model;

import java.util.Date;

public class Task {
	private int idTask;
	private String title;
	private Date deposedAt;
	private String document;
	
	public Task(){
		
	}
	
	public Task(int idTask, String title, String document) {
		super();
		this.idTask = idTask;
		this.title = title;
		//this.deposedAt = deposedAt;
		this.document = document;
	}
	
	
	public void addDocument(){
		
		
	}
	public void deleteDocument(){
		
	}
	public void consult(){
		
	}

	/**
	 * @return the idTask
	 */
	public int getIdTask() {
		return idTask;
	}

	/**
	 * @param idTask the idTask to set
	 */
	public void setIdTask(int idTask) {
		this.idTask = idTask;
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
	 * @return the deposedAt
	 */
	public Date getDeposedAt() {
		return deposedAt;
	}

	/**
	 * @param deposedAt the deposedAt to set
	 */
	public void setDeposedAt(Date deposedAt) {
		this.deposedAt = deposedAt;
	}

	/**
	 * @return the documents
	 */
	public String getDocument() {
		return document;
	}

	/**
	 * @param documents the documents to set
	 */
	public void setDocument(String documents) {
		this.document = documents;
	}
	
	
	
	
	
	

}
