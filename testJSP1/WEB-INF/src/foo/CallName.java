package foo;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class CallName extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		foo.Person p = new foo.Person();
		String name = request.getParameter("userName");		
		p.setName(name);
		request.setAttribute("person",p);

		String[] favoriteMusic = {"bravo my life", "goodbye my friend", "BT", "Frou Frou"};
		request.setAttribute("musicList",favoriteMusic);

		RequestDispatcher view = request.getRequestDispatcher("/result.jsp");
		view.forward(request,response);
	}
}