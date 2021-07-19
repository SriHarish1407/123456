package com.TestNG_Programs;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;
public class Parameter_Testng {
	
	
	
	
	@Test
	private void username(@Optional("sharish") String un) {

		System.out.println("Username " +un);
		
	}
	
	@Test
	private void password(@Optional("12345") String pass) {
		
		System.out.println("Password " +pass);

	}
	

}
