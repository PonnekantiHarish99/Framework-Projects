package com.pack1;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;


@WebServlet("/hi")
public class Helloservlet implements Servlet {

    
    public Helloservlet() {
    }

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("hello init!");
	}

	
	public void destroy() {
	}


	public ServletConfig getServletConfig() {
		return null;
	}

	
	public String getServletInfo() {
		return null; 
	}

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		 System.out.println("hello service!!");
	}

}
