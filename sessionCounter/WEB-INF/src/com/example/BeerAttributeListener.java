package com.example;

import javax.servlet.http.*;

public class BeerAttributeListener implements HttpSessionAttributeListener {

	public void attributeAdded(HttpSessionBindingEvent event){
		String name = event.getName();
		Object value = event.getValue();
		System.out.println("Attribute added: " + name + ": " + value);
	}

	public void attributeRemoved(HttpSessionBindingEvent event) {
		String name = event.getName();
		Object value = event.getValue();
		System.out.println("Attribute removed: " + name + ": " + value);
	}

	public void attributeReplaced(HttpSessionBindingEvent event) {
		String name = event.getName();
		Object value = event.getValue();
		System.out.println("Attribute replaced: " + name + ": " + value);
	}
	
}

// MyServletContextListener.java
/*

package com.example;

import javax.servlet.*;

public class MyServletContextListener implements ServletContextListener{
	public void contextInitialized(ServletContextEvent event){
		ServletContext sc = event.getServletContext();
		String dogBreed = sc.getInitParameter("breed");
		Dog d = new Dog(dogBreed);
		sc.setAttribute("dog",d);
	}

	public void contextDestroyed(ServletContextEvent event){
		
	}
}

*/
