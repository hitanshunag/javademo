package com.nagarro;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.util.List;

@WebServlet("/add")
public class AddServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		List<Student> students = Arrays.asList(new Student(1,"Hitanshu"),new Student(2,"Kavya"));
		//Student std = new Student(1,"Hitanshu");
		req.setAttribute("students", students);
		RequestDispatcher rd = req.getRequestDispatcher("display.jsp");
		rd.forward(req, res);
		
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		System.out.println(num1+num2);
		int k = num1+num2;
		PrintWriter out = res.getWriter();
	    out.println(k);
	    
	    ServletContext ctx = req.getServletContext();
	    String name = ctx.getInitParameter("name");
	    out.println("Name is:-"+name);
	    
	    ServletConfig cg = getServletConfig();
	    name = cg.getInitParameter("name");
	    out.println("Servlet config Name is:-"+name);
	    
//	    req.setAttribute("k", k);
//	    RequestDispatcher rd = req.getRequestDispatcher("sq");
//	    rd.forward(req, res);
	    
	    //session management
	    //HttpSession session = req.getSession();
	    //session.setAttribute("k", k);
	    
	    //by cookie
//	    Cookie cookie = new Cookie("k",k+"");
//	    res.addCookie(cookie);
//	    res.sendRedirect("sq");
		
	}
}
