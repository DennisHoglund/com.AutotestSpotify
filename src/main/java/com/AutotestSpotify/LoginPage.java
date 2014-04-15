package com.AutotestSpotify;




import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Screen;



public class LoginPage {

	//test
	
	




private Screen _s;

	public LoginPage()
	{
		Screen s = new Screen();
		this._s = s;
	}

//	public static void main(String[] args) {
//		Screen s = new Screen();
//		
//		
//		try
//			{
//					
//		        s.click("imgs/start.png", 0);
//		        s.wait("imgs/finder2.png", 0);
//		        s.type("Spotify");
//				s.wait("imgs/StartSpotify.png", 3);
//				s.click("imgs/StartSpotify.png", 0);
//				s.wait("imgs/UserSpotify.png", 10);
//				s.type("diggity");
//				s.click("imgs/PasswordSpotify.png", 0);
//				s.type("utter2002");
//				s.click("imgs/LoginSpotify.png", 0);
//				s.wait("imgs/ValiduserSpotify.png", 10); 
//				s.click("imgs/FileSpotifyClient.png"); 
//				s.wait("imgs/LogoutUserSpotify.png", 10);
//				s.click("imgs/LogoutUserSpotify.png"); 
//				
//				
//			}
//				catch(FindFailed e)
//			{
//			e.printStackTrace();
//			}
//
//	}
	
	
	public Boolean ValidUser(String user, String password)
	{
		
		
		try
			{
					
			 	_s.click("imgs/start.png", 0);
		        _s.wait("imgs/finder2.png", 0);
		        _s.type("Spotify");
				_s.wait("imgs/StartSpotify.png", 3);
				_s.click("imgs/StartSpotify.png", 0);
				_s.wait("imgs/UserSpotify.png", 10);
				_s.type(user);
				_s.click("imgs/PasswordSpotify.png", 0);
				_s.type(password);
				_s.click("imgs/LoginSpotify.png", 0);
				_s.wait("imgs/ValiduserSpotify.png", 10); 
				_s.click("imgs/FileSpotifyClient.png"); 
				_s.wait("imgs/LogoutUserSpotify.png", 5);
				_s.click("imgs/LogoutUserSpotify.png"); 
				return true;
				
				
			}
				catch(FindFailed e)
				
			{
			e.printStackTrace();
			}
		return false;
	}

	public Boolean InvalidUser(String user, String password)
	{
		
		
		try
			{
					
			 	_s.click("imgs/start.png", 0);
		        _s.wait("imgs/finder2.png", 0);
		        _s.type("Spotify");
				_s.wait("imgs/StartSpotify.png", 3);
				_s.click("imgs/StartSpotify.png", 0);
				_s.wait("imgs/UserSpotify.png", 10);
				_s.type(user);
				_s.click("imgs/PasswordSpotify.png", 0);
				_s.type(password);
				_s.click("imgs/LoginSpotify.png", 0);
				_s.wait("imgs/InvalidUserSpotify.png", 10); 
				_s.click("imgs/UserSpotify.png");
				_s.type("a", Key.CTRL);
				_s.type(Key.BACKSPACE);
				_s.click("imgs/ExitLogin.png");
				return true;
				
			}
				catch(FindFailed e)
				
			{
			e.printStackTrace();
			}
		return false;
		
	}
	
	public MainPage LoginUser(String user, String password)
	{
		try
		{
			MainPage mp = new MainPage();
			_s.click("imgs/start.png", 0);
	        _s.wait("imgs/finder2.png", 0);
	        _s.type("Spotify");
			_s.wait("imgs/StartSpotify.png", 3);
			_s.click("imgs/StartSpotify.png", 0);
			_s.wait("imgs/UserSpotify.png", 10);
			_s.type(user);
			_s.click("imgs/PasswordSpotify.png", 0);
			_s.type(password);
			_s.click("imgs/LoginSpotify.png", 0);
		
			return mp;
		}
		catch(FindFailed e)
		
	{
	e.printStackTrace();
	}
		return null;
	}
	
}
