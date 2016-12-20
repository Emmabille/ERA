package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
* Main point to start app.
* @author Emmanuelle Billard <e.billard@gmail.com>, 
* @author Rahma Barhoumi <rahma.barhoumi@yahoo.fr>, 
* @author Aurelia Delauné <aurelia.delaune@gmail.com>
* @version 1.1.0
*/

public class Application {

	public static void main(String[] args) throws ParseException {

        User user1 = new User ("Albert", "Camus", "aCamus", "acamus21");
		User user2 = new User ("Emile", "Zola", "eZola", "ezola32");
		User user3 = new User ("Victor", "Hugo", "vHugo", "vhugo49");

		System.out.println(user1.toString());
		System.out.println(user2.toString());
		System.out.println(user3.toString());
		
		Teacher teacher1 = new Teacher(1, "Honoré", "de Balzac", "hdeBalzac", "hdebalzac64");
		Teacher teacher2 = new Teacher(2, "Guillaume", "Appolinaire", "gAppolinaire", "gappolinaire39");
		Teacher teacher3 = new Teacher(3, "Gérard", "de Nerval", "gdeNerval", "gdenerval92");

		//on veut teacher ou user pour le syst.out.print ? ce qui suit donne user. 
		//pour teacher, faut faire son propre toString, mais compliqué...
		System.out.println(teacher1.toString());
		System.out.println(teacher2.toString());
		System.out.println(teacher3.toString());
		
		Administrator admin1 = new Administrator("Jean-Jacques", "Rousseau", "jjRousseau", "jjrousseau87", 999);
		
		System.out.println(admin1.toString());
		
	   
	    Student student1 = new Student ("Adelie", "Dupas", "aDupas", "aDupas12", 2,23, 2016);
	    Student student2 = new Student ("Alice", "Derrien", "aDerrien", "aDerrien15", 34, 5, 2016);
	    Student student3= new Student ("Maxime" , "Dujardin", "mDujardin", "mDujardin21", 6, 3, 2016);
	    
	    System.out.println(student1.toString());
	    System.out.println(student2.toString());
	    System.out.println(student3.toString());
	   
	    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
	    Subject subject1 = new Subject (2, "Sujet Java" ,sdf.parse("31/12/2016"),2, "Realisation du cahier des charges" , 3, "informatique");
	    Subject subject2 = new Subject (3, "Sujet BDD", sdf.parse("02/01/2017") ,2, "Creation de 4 tables",1, "informatique"); 
	    Subject subject3 = new Subject (4, "Sujet HTML",sdf.parse("01/02/2017") ,2, "Creation des interfaces", 2, "informatique");
	    //System.out.println("idSubject="+" "+ subject1.getIdSubject()+", "+"Title="+" "+ subject1.getTitle()+", "+ "GroupeSize"+" "+ subject1.getGroupSize()+", "+"Description ="+" "+ subject1.getDescription()+" "+ "Promo" +subject1.getIdPromo()+" "+"specialty="+" " +subject1.getSpecialty());
	    System.out.println(subject1.toString());
	    System.out.println(subject2.toString());
	    System.out.println(subject3.toString());
	    
	   
	    
	    Task task1 = new Task ( 1, "Devoir Java", "nous souhaitons realiser une plateforme pour deposer les devoirs");
	    Task task2 = new Task (2, "Devoir BDD", "realisation de table Student, Professeur, Subject, Task");
	    
	    //System.out.println("TaskId="+" "+ task1.getIdTask()+ ", "+ "title="+" "+task1.getTitle()+" ,"+ "Document:"+" "+task1.getDocument());
	    System.out.println(task1.toString());
	    System.out.println(task2.toString());

}}
