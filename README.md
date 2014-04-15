com.AutotestSpotify
===================

Autotest of the Spotify client with Sikuli

This project uses Sikuli/Java to test the Spotify client. Testcases are executet via TestNG. I've created two Java-classes:
* LoginPage
* MainPage

LoginPage handles log in of the Spotify client and returns a MainPage if needed.

MainPage handles search of song, artist and log out. To get the Spotify app running you must change the path. I tested with Startbutton i Windows 7 and searched for the client. But that aproach took way to long time. So instead I use App.Open(Path). 


