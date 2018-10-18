package com.cosmetics.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cosmetic.dao.CustomerCosmetics;
import com.cosmetics.database.ConnectionProvider;
import com.cosmetics.implementation.CustomerCosmeticsImpl;
import com.cosmetics.model.Customer;

/**
 * Servlet implementation class Signup
 */
@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	RequestDispatcher rd;
       
    public SignupServlet() {
        super();
       
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection con=null;
		con=ConnectionProvider.getConnection();
		PrintWriter out=response.getWriter();
		String name=request.getParameter("uname");
		String password=request.getParameter("upass");
		long contact=Long.parseLong(request.getParameter("contact"));
		String email=request.getParameter("uemail");
        String gender=request.getParameter("rb");
        Customer customer=new Customer();
        customer.setCustomerName(name);
        customer.setCustomerPassword(password);
        customer.setCustomerEmail(email);
        customer.setCustomerContact(contact);
        customer.setCustomerGender(gender);
        CustomerCosmetics dao=new CustomerCosmeticsImpl();
        if(dao.addCustomer(customer))
        {
        	rd=request.getRequestDispatcher("/login.jsp");
        	rd.forward(request,response);
        }
        else
        {
        	out.println("Something went wrong please try again");
        	rd=request.getRequestDispatcher("/registration.jsp");
        	rd.include(request,response);
        }
       
	}
}
