package com.nagarro;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;

@WebServlet("/sq")
public class SquareServlet extends HttpServlet {

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		//int k = Integer.parseInt(req.getParameter("k"));
		//HttpSession session = req.getSession();
	    //int k = (int) session.getAttribute("k");
		int k =0;
		Cookie cookies[] = req.getCookies();
		for(Cookie c: cookies) {
			if(c.getName().equals("k")) {
				k = Integer.parseInt(c.getValue());
			}
		}
		PrintWriter out = res.getWriter();
		out.println("Square is:"+k*k);
	}
}
