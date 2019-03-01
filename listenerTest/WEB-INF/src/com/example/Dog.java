package com.example;

import javax.servlet.http.*;

public class Dog implements HttpSessionBindingListener {
	private String breed;

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
}