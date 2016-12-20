package model;

/**
* Main point to start app.
* @author Emmanuelle Billard <e.billard@gmail.com>, 
* @author Rahma Barhoumi <rahma.barhoumi@yahoo.fr>, 
* @author Aurelia Delauné <aurelia.delaune@gmail.com>
* @version 1.1.0
*/

public class Application {

	public static void main(String[] args) {

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
	}	

}
