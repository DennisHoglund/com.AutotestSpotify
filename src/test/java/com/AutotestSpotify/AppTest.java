package com.AutotestSpotify;
//import com.AutotestSpotify.*;
import org.testng.Assert;
import org.testng.annotations.Test;
//import org.sikuli.script.Screen;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
	
	@Test
	 public void sum() {
	  Assert.assertEquals(8, 4 + 4);
	 }
	
	@Test
	 public void TestLoginValidUser() {
	  //Assert.assertEquals(0, 4 - 4);
	LoginPage lp = new LoginPage();
	boolean vs = lp.ValidUser("diggity", "utter2002");
	
	Assert.assertEquals(vs, true);
	 }
	
	@Test
	 public void TestInValidUser() {
	  //Assert.assertEquals(0, 4 - 4);
	LoginPage lp = new LoginPage();
	boolean vs = lp.InvalidUser("mupp", "mupp");
	
	Assert.assertEquals(vs, true);
	 }
	
	@Test
	 public void TestSearchTrack() {
	  //Assert.assertEquals(0, 4 - 4);
	LoginPage lp = new LoginPage();
	MainPage mp = lp.LoginUser("diggity", "utter2002");
	boolean st = mp.SearchArtist();
	
	Assert.assertEquals(st, true);
	 }
	
//    public AppTest( String testName )
//    {
//        super( testName );
//    }
//
//    /**
//     * @return the suite of tests being tested
//     */
//    public static Test suite()
//    {
//        return new TestSuite( AppTest.class );
//    }
//
//    /**
//     * Rigourous Test :-)
//     */
//    public void testApp()
//    {
//        assertTrue( true );
//    }
	
	
}
