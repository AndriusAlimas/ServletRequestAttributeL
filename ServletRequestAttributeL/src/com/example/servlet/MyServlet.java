package com.example.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class MyServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, 
			HttpServletResponse response)throws ServletException, IOException{
		response.setContentType("text/html");
	    sleep();
	    // using request scope we added attribute, and ServletRequestAttributeListener
	    // event will execute attributeAdded():
	    request.setAttribute("CompanyName","Next");
	    this.sleep();
	    // using request scope we added attribute, and ServletRequestAttributeListener
	    // event will execute attributeReplaced() because we replace :
	    request.setAttribute("CompanyName", (Object)"Asda");
	    sleep();
	 // using request scope we remove attribute, and ServletRequestAttributeListener
     // event will execute attributeRemoved() ,there is another way to invoke remove
	 // like this request.setAttribute("CompanyName",null) make it null :
	    request.removeAttribute("CompanyName");
	}
	// method to put thread to sleep, we want to see action with pause:
	 private void sleep() {
	        try {
	            Thread.sleep(7000);
	        }
	        catch (InterruptedException ex) {
	            ex.printStackTrace();
	        }
	    }
}
