package model;

import java.util.Hashtable;
import java.util.jar.Attributes;

import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;

public class Connexion {
	
	public static void main(String[] args) {
		 
		//Adresse du serveur sur lequel se trouve l'annuaire LDAP
		String serverIP = "192.168.3.250";
		//Pourt du serveur sur lequel se trouve l'annuaire LDAP
		String serverPort = "389";
		//Login de connexion à l'annuaire LDAP : Le login doit être sous forme de "distinguished name"
		//ce qui signifie qu'il doit être affiché sous la forme de son arborescence LDAP
		String serverLogin = "ldap_read";
		String dn = "DC=imie, DC=lan";
		//Mot de passe de connexion à l'annuaire LDAP
		String serverPass = "Pr0jetJuJube";
 
		//On remplit un tableau avec les parametres d'environement et de connexion au LDAP
		Hashtable environnement = new Hashtable();
		environnement.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
		environnement.put(Context.PROVIDER_URL, "ldap://"+serverIP+":"+serverPort+"/"+dn);
		environnement.put(Context.SECURITY_AUTHENTICATION, "simple");
		environnement.put(Context.SECURITY_PRINCIPAL, serverLogin);
		environnement.put(Context.SECURITY_CREDENTIALS, serverPass);
	
		try {
			//On appelle le contexte à partir de l'environnement
			DirContext contexte = new InitialDirContext(environnement);
			//Si ça ne plante pas c'est que la connexion est faite
			System.out.println("Connexion au serveur : SUCCES");
			
		} catch (NamingException e) {
			System.out.println("Connexion au serveur : ECHEC");
			e.printStackTrace();
		}
	}
	
	

}
