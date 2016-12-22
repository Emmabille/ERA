package model;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import javax.naming.Context;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.SearchResult;
import javax.naming.ldap.InitialLdapContext;
import javax.naming.ldap.LdapContext;

public class Ldap {
	String serverURL = "ldap://192.168.3.250:389/DC=IMIE,DC=lan";
	String serverLogin = "ldap_read";
	String serverPass = "Pr0jetJuJube";

	static String firstName;
	static String lastName;
	static String login;
	static String email;
	static SearchResult search;
	static int index = 0;

	private LdapContext myContext;

	public LdapContext connect() {

		Hashtable<String, String> env = new Hashtable<String, String>();
		env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
		env.put(Context.SECURITY_AUTHENTICATION, "simple");
		env.put("com.sun.jndi.ldap.connect.timeout", "300000");
		env.put(Context.PROVIDER_URL, serverURL);
		env.put(Context.SECURITY_PRINCIPAL, serverLogin);
		env.put(Context.SECURITY_CREDENTIALS, serverPass);

		try {
			myContext = new InitialLdapContext(env, null);
			System.out.println("Connecté au LDAP");

		} catch (NamingException e) {
			e.printStackTrace();
		}
		return myContext;

	}

	public int getAll() {
		String filter = "OU=2016-2017-JEE, OU=POEC,OU=Eleves,OU=Utilisateurs,OU=Formation,OU=RENNES,OU=Sites";
		List<User> listYMB = new ArrayList<User>();
		try {
			// Filtre du LDAP
			NamingEnumeration<SearchResult> listUser = myContext.search(filter, null);

			while (listUser.hasMoreElements()) {
				search = (SearchResult) listUser.next();
				index++;
				
				//Attributes attrs = search.getAttributes();
				Ldap.extract();
				

				/*if (attrs != null) {
					try {
						for (NamingEnumeration ae = attrs.getAll(); ae.hasMore();) {
							Attribute attr = (Attribute) ae.next();
							if (attr.getID().equals("givenName")) {
								System.out.print(attr.get(0).toString() + " ");
								firstName = attr.get().toString();
							}
							if (attr.getID().equals("sn")) {
								System.out.print(attr.get(0).toString() + " ");
								lastName = attr.get().toString();
							}
							if (attr.getID().equals("sAMAccountName")) {
								System.out.println(attr.get(0).toString());
								login = attr.get().toString();
							}
							if (attr.getID().equals("mail")) {
								System.out.print(attr.get(0).toString() + " ");
								email = attr.get().toString();
							}
							listYMB.add(new User(firstName, lastName, login, login));
						}
					} catch (NamingException e) {
						e.printStackTrace();
					}

				}*/
			}
			System.out.print("Récupération de la liste des utilisateurs: ");
			System.out.println(index + " utilisateurs récupérés");

		} catch (NamingException e) {
			e.printStackTrace();
		}
		return index;

	}
	
	
	public static User extract() {
		Attributes attrs = search.getAttributes();
		List<User> listYMB = new ArrayList<User>();

		if (attrs != null) {
			try {
				for (NamingEnumeration ae = attrs.getAll(); ae.hasMore();) {
					Attribute attr = (Attribute) ae.next();
					if (attr.getID().equals("givenName")) {
						System.out.print(attr.get(0).toString() + " ");
						firstName = attr.get().toString();
					}
					if (attr.getID().equals("sn")) {
						System.out.print(attr.get(0).toString() + " ");
						lastName = attr.get().toString();
					}
					if (attr.getID().equals("sAMAccountName")) {
						System.out.println(attr.get(0).toString());
						login = attr.get().toString();
					}
					if (attr.getID().equals("mail")) {
						System.out.print(attr.get(0).toString() + " ");
						email = attr.get().toString();
					}
					listYMB.add(new User(firstName, lastName, login, login));
				}
			} catch (NamingException e) {
				e.printStackTrace();
			}

		}
		return null;
	}


}
