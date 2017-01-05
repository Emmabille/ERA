package model;

public class LDAPConnexion {

	public static void main(String[] args) {
		Ldap ldap = new Ldap();
		
		ldap.connect();
		ldap.getAll();
		ldap.extract();
	}

}
