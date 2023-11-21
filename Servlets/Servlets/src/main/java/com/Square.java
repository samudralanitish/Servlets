package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/sq")
public class Square extends HttpServlet {
    
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		RequestDispatcher
		int i =(int) req.getAttribute("k");
		int j=i*i;
		System.out.println(j);
		res.getWriter().print(j);
		
		
		//SendRedirect
//		int i=Integer.parseInt(req.getParameter("k"));
//		int j=i*i;
//		res.getWriter().print(j);

		
		
		//HTTP Session
		
//		HttpSession session=req.getSession();
//		int i =(int) session.getAttribute("k");
//		res.getWriter().print(i*i);
		
		
		//Cookie
//		int s=0;
//		Cookie[] cookie=req.getCookies();
//		for(Cookie cookies:cookie) {
//			if(cookies.getName().equals("k")) {
//				s =Integer.parseInt(cookies.getValue());
//			}
//		}
//		res.getWriter().print(s*s);
	}

}
