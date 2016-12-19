package model;

import java.time.Year;

public class Promotion {
	private int idPromo;
	private String name;
	private Year year;
	
	
	public Promotion(){
		
	}


	/**
	 * @param idPromo
	 * @param name
	 * @param year
	 */
	public Promotion(int idPromo, String name, Year year) {
		super();
		this.idPromo = idPromo;
		this.name = name;
		this.year = year;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the year
	 */
	public Year getYear() {
		return year;
	}


	/**
	 * @param year the year to set
	 */
	public void setYear(Year year) {
		this.year = year;
	}
	
	
	

}
