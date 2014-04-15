package com.AutotestSpotify;

//import com.AutotestSpotify.*;
import org.testng.Assert;
import org.testng.annotations.Test;
//import org.sikuli.script.Screen;
//import org.testng.annotations.Test;
//Testclass
//Test of upstream

public class TestSpotify {
	
	
	
	@Test
	 public void LoginValidUser() {

		LoginPage lp = new LoginPage();
		boolean vs = lp.ValidUser("diggity", "utter2002");

		Assert.assertEquals(vs, true);
}
	
	@Test
	 public void InValidUser() {
	  
		LoginPage lp = new LoginPage();
		boolean vs = lp.InvalidUser("mupp", "mupp");
	
		Assert.assertEquals(vs, true);
	 }
	
	@Test
	 public void SearchTrack() {
	 
	LoginPage lp = new LoginPage();
	MainPage mp = lp.LoginUser("diggity", "utter2002");
	boolean st = mp.SearchArtist();
	
	Assert.assertEquals(st, true);
	 }
}
