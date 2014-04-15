package com.AutotestSpotify;


import org.testng.Assert;
import org.testng.annotations.Test;



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
		boolean vs = lp.InvalidUser("testuser", "testpassword");
	
		Assert.assertEquals(vs, true);
	 }
	
	@Test
	 public void SearchTrack() {
	 
		LoginPage lp = new LoginPage();
		MainPage mp = lp.LoginUser("diggity", "utter2002");
		boolean st = mp.SearchSong();
	
		Assert.assertEquals(st, true);
	 }
	
	@Test
	 public void SearchArtist() {
	 
		LoginPage lp = new LoginPage();
		MainPage mp = lp.LoginUser("diggity", "utter2002");
		boolean sa = mp.SearchArtist();
	
		Assert.assertEquals(sa, true);
	 }
	
	
}
