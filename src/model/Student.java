package model;

import java.util.ArrayList;
import java.util.List;

public class Student extends User{
	private int idStudent;
	private int idGroupe;
	private int idGrade;
	

	
	
	public Student(){ 
		
	}
	
	
	
	
	
	
	
	/**
	 * @param fname
	 * @param lname
	 * @param login
	 * @param password
	 * @param identifiantStudent
	 * @param idGroupe
	 * @param promo
	 */
	public Student(String fname, String lname, String login, String password, int identifiantStudent, int idGroupe,
			int promo) {
		super(fname, lname, login, password);
		this.identifiantStudent = identifiantStudent;
		this.idGroupe = idGroupe;
		this.promo = promo;
	}




	








	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student identifiantStudent=" + identifiantStudent + ", idGroupe=" + idGroupe + ", promo=" + promo + super.toString()+"";
				
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
	
	
	


