package edu.mum.cs.waa;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculator
 */
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Calculator() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String add1 = request.getParameter("add1").trim() ;
		String add2 = request.getParameter("add2").trim();
		String mult1 = request.getParameter("mult1").trim();
		String mult2 = request.getParameter("mult2").trim();

		String sum = "";
		String product = "";
		
		// Check for valid inputs....
		try {
			Integer a1 = Integer.parseInt(add1);
			Integer a2 = Integer.parseInt(add2);
			sum = "" + (a1+a2);
		} catch(NumberFormatException e) {
			if (add1.isEmpty()) add1 = "''";
			if (add2.isEmpty()) add2 = "''";
			sum = "''";
		}
		
		/*
		 * Integer.parseInt(str) throws NumberFormatException 
		 * if the string cannot be converted to an integer.
		 */
		
		try {
			Integer m1 = Integer.parseInt(mult1);
			Integer m2 = Integer.parseInt(mult2);
			product = "" + (m1 * m2);
		} catch(NumberFormatException e) {
			if (mult1.isEmpty()) mult1 = "''";
			if (mult2.isEmpty()) mult2 = "''";
			product = "''";
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/JSPs/result.jsp");		
		request.setAttribute("sum", sum);
		request.setAttribute("product", product);
		rd.forward(request, response);
	}

}
