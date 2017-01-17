package com.example.listener;

import javax.servlet.*;

public class MyServletRequestAttributeListener implements ServletRequestAttributeListener {
	// Everything is same for all attribute listener, main example was made with all 
	// explanation in ServletContextAttributeListener, everything is same, just different
	// is attribute scope and trigerring different with scopes:
	public void attributeAdded(ServletRequestAttributeEvent event) {
		System.out.println("\n###################################\n");
		System.out.println("attributeAdded method has been called in " + getClass().getName());
		System.out.println("Newly added attribute name = " + event.getName() + 
			", value = " + event.getValue());
	System.out.println("\n###################################\n");
	}

	public void attributeReplaced(ServletRequestAttributeEvent event) {
		System.out.println("\n###################################\n");
	    System.out.println("attributeReplaced method has been called in " + this.getClass().getName());
	    System.out.println("Replaced attribute name = " + event.getName() + 
	    		", value = " + event.getValue());
	    System.out.println("\n###################################\n");
	}

	public void attributeRemoved(ServletRequestAttributeEvent event) {
		 System.out.println("\n###################################\n");
	     System.out.println("attributeRemoved method has been called in " + this.getClass().getName());
	     System.out.println("Removed attribute name = " + event.getName() + 
	    		 ", value = " + event.getValue());
	     System.out.println("\n###################################\n");
	}
}
