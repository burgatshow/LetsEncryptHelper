package hu.thom.letsencrypt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Validator
 */
@WebServlet(name = "Validator", urlPatterns = { "/.well-known/acme-challenge/<lets encrypt validation string>" })
public class Validator extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Validator() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain");
		
		PrintWriter pw = response.getWriter();
		pw.write("<lets encrypt validation string>");
		
		pw.flush();
		pw.close();
	}

}
