package model;

public class Student extends User{
	private int idStudent;
	private int idGroup;
	private int promo;
	
	public Student(){ 
		super();
	}
	
	public Student (String lname, String fname, String login, String email){
		super(lname, fname, login, email);	
	}
	
	
	/**
	 * full constructor for the Student entity, with :
	 * @param fname
	 * @param lname
	 * @param login
	 * @param password
	 * @param identifiantStudent
	 * @param idGroup
	 * @param promo
	 */
	public Student(String fname, String lname, String login, String password, String email, 
			int idStudent, int idGroup, int promo) {
		super(fname, lname, login, password, email);
		this.idStudent = idStudent;
		this.idGroup = idGroup;
		this.promo = promo;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student idStudent=" + idStudent + ", idGroup=" + idGroup + ", promo=" + promo + 
				super.toString()+"";
				
	}

}