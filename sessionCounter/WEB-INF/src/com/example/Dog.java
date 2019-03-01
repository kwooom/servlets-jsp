package com.example;
import javax.servlet.http.*;
import java.io.*;

public class Dog implements HttpSessionBindingListener, HttpSessionActivationListener, Serializable {
	private String breed;
	//
	//

	//

	public Dog(String breed){
		this.breed = breed;
	}
	public String getBreed(){
		return breed;
	}
	public void valueBound(HttpSessionBindingEvent event){

	}
	public void valueUnbound(HttpSessionBindingEvent event){
		
	}
	public void sessionWillPassivate(HttpSessionBindingEvent event){

	}
	public void sessionDidActivate(HttpSessionBindingEvent event){
		
	}
}