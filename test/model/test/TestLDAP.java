package model.test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.Ldap;
import model.User;

public class TestLDAP {
	Ldap ldap = new Ldap();
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

	/*@Test
	public void testConnect() {
		Object connexion = this.ldap.connect();
		Object resultAttendu = null;

		assertNotNull(connexion);
		assertEquals(resultAttendu, connexion);
	}*/
	
	@Test
	public void testGetAll(){
		Ldap listYMB = new Ldap();
		int i = ldap.getAll();
		
		List<User>result = new ArrayList<User>();
		
				
		assertNotNull(listYMB);
		assertEquals(24, i);
		//assert contains
		
	}
	
	public void testExtract(){
		
	}
}
