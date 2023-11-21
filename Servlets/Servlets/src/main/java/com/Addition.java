package com;

import java.io.IOException;

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
@WebServlet("/add")
public class Addition extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i =Integer.parseInt(req.getParameter("num1"));
		int j =Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		System.out.println(k);
//		res.getWriter().print(k);		
		req.setAttribute("k",k);
		RequestDispatcher rd=req.getRequestDispatcher("sq");
		rd.forward(req, res);
		
		
//		res.sendRedirect("sq?k="+k);
		
		
//		HttpSession session=req.getSession();
//		session.setAttribute("k", k);
//		res.sendRedirect("sq");
		
		//Cookie
		
//		Cookie cookie=new Cookie("k", k+"");
//		res.addCookie(cookie);
//		res.sendRedirect("sq");
		
		
//		ServletContext cxt=req.getServletContext();
//		String string = cxt.getInitParameter("name");
//		System.out.println(string);
//		res.getWriter().print(string);
		
//		ServletConfig cfg=getServletConfig();
//		String string = cfg.getInitParameter("name");
//		res.getWriter().print(string);
	}
}
