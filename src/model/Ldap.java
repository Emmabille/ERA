package model;

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
	private String serverURL = "ldap://192.168.3.250:389/DC=IMIE,DC=lan";
	private String serverLogin = "ldap_read";
	private String serverPass = "Pr0jetJuJube";
	private SearchResult search;

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

	public List<User> getAll() {
		String filter = "OU=2016-2017-JEE, OU=POEC,OU=Eleves,OU=Utilisateurs,OU=Formation,OU=RENNES,OU=Sites";
		
		try {
			// Filtre du LDAP
			NamingEnumeration<SearchResult> userAnswer = myContext.search(filter, null);

			while (userAnswer.hasMoreElements()) {
				search = (SearchResult) userAnswer.next();	
			}				
			System.out.println("Récupération de la liste des utilisateurs");

		} catch (NamingException e) {
			e.printStackTrace();
		}
		return null;

	}

	public User extract() {
		Attributes attrs = search.getAttributes();
		if (attrs != null) {
			try {
				for (NamingEnumeration ae = attrs.getAll(); ae.hasMore();) {
					Attribute attr = (Attribute) ae.next();
					if (attr.getID().equals("givenName")) {
						System.out.print(attr.get(0).toString() + " ");
					}
					if (attr.getID().equals("sn")) {
						System.out.print(attr.get(0).toString() + " ");
					}
					if (attr.getID().equals("sAMAccountName")) {
						System.out.println(attr.get(0).toString());
					}
					if (attr.getID().equals("mail")) {
						System.out.print(attr.get(0).toString() + " ");
					}
				}
			} catch (NamingException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	/**
	 * @return the serverURL
	 */
	public String getServerURL() {
		return serverURL;
	}

	/**
	 * @param serverURL the serverURL to set
	 */
	public void setServerURL(String serverURL) {
		this.serverURL = serverURL;
	}

	/**
	 * @return the serverLogin
	 */
	public String getServerLogin() {
		return serverLogin;
	}

	/**
	 * @param serverLogin the serverLogin to set
	 */
	public void setServerLogin(String serverLogin) {
		this.serverLogin = serverLogin;
	}

	/**
	 * @return the serverPass
	 */
	public String getServerPass() {
		return serverPass;
	}

	/**
	 * @param serverPass the serverPass to set
	 */
	public void setServerPass(String serverPass) {
		this.serverPass = serverPass;
	}

	/**
	 * @return the myContext
	 */
	public LdapContext getMyContext() {
		return myContext;
	}

	/**
	 * @param myContext the myContext to set
	 */
	public void setMyContext(LdapContext myContext) {
		this.myContext = myContext;
	}
}


