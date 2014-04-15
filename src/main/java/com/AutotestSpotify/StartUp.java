package com.AutotestSpotify;

import org.sikuli.script.FindFailed;

import org.sikuli.script.Screen;

public class StartUp {

	
	private Screen _s;
	
	public StartUp()
	{
		Screen s = new Screen();
		this._s = s;
	}
	
	public void Search()
	{
		try
		{
		_s.click("imgs/start.png", 0);
        _s.wait("imgs/finder2.png", 0);
        _s.type("Spotify");
		_s.wait("imgs/StartSpotify.png", 3);
		_s.click("imgs/StartSpotify.png", 0);
		}
		catch(FindFailed e)
		
	{
	e.printStackTrace();
	}
		
	}
}
