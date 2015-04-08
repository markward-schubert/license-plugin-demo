package de.javamagazin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import de.javamagazin.library.Greeter;

@WebServlet(urlPatterns = "/")
public class GreetServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		Greeter g = new Greeter();
		resp.getWriter().println(g.getGreetingPhrase());
	}

}
