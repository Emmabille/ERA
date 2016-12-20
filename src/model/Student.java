package model;

import java.util.ArrayList;
import java.util.List;

public class Student extends User{
	private int identifiantStudent;
	private int idGroupe;
	private int promo;
	

	
	
	public Student(){ 
		
	}
	
	
	
	
	/**
	 * @param identifiantStudent
	 * @param idGroupe
	 * @param promo
	 * @param subjects
	 * @param tasks
	 */
	public Student(int identifiantStudent, int idGroupe, int promo) {
		super();
		this.identifiantStudent = identifiantStudent;
		this.idGroupe = idGroupe;
		this.promo = promo;
	
	}








	/**
	 * @return the identifiantStudent
	 */
	public int getIdentifiantStudent() {
		return identifiantStudent;
	}




	/**
	 * @param identifiantStudent the identifiantStudent to set
	 */
	public void setIdentifiantStudent(int identifiantStudent) {
		this.identifiantStudent = identifiantStudent;
	}




	/**
	 * @return the idGroupe
	 */
	public int getIdGroupe() {
		return idGroupe;
	}




	/**
	 * @param idGroupe the idGroupe to set
	 */
	public void setIdGroupe(int idGroupe) {
		this.idGroupe = idGroupe;
	}




	/**
	 * @return the promo
	 */
	public int getPromo() {
		return promo;
	}




	/**
	 * @param promo the promo to set
	 */
	public void setPromo(int promo) {
		this.promo = promo;
	}




}
	
	
	

}
