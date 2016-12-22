package model.test;


import java.util.ArrayList;
import java.util.List;

import javax.naming.ldap.LdapContext;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.Ldap;
import model.User;

public class TestLDAP {
	Ldap ldap;
	static String url = "ldap://192.168.3.250:389/DC=IMIE,DC=lan";
	static String login = "ldap_read";
	static String pass = "Pr0jetJuJube";

	@BeforeClass
	public static void setUpBeforeClass(){
		url = null;
		login = null;
		pass = null;
	}
	
	@Before
	public void setUp() throws Exception {
		this.ldap = new Ldap();
	}

	@After
	public void tearDown() throws Exception {
		this.ldap = null;
	}

	@Test
	public void testConnect() {
		LdapContext connexion = this.ldap.connect();
		Object resultAttendu = null;
	}
	
	@Test
	public void testGetAll(){
		Ldap listUser = new Ldap();

		List<User>result = new ArrayList<User>();
		result = listUser.getAll();
	
	}
	
	public void testExtract(){
		
	}
}
