package com.example;
import javax.servlet.http.*;

public class BeerSessionCounter implements HttpSessionListener {
	static private int activeSessions;

	public static int getActiveSessions(){
		return activeSessions;
	}
	public void sessionCreated(HttpSessionListener event){
		activeSessions++;
	}
	public void sessionDestroyed(HttpSessionListener event){
		activeSessions--;
	}
}