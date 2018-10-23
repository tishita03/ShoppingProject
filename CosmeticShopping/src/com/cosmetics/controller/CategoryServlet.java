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

import com.cosmetic.dao.CategoryCosmetics;
import com.cosmetics.database.ConnectionProvider;
import com.cosmetics.implementation.CategoryCosmeticsImpl;
import com.cosmetics.model.Category;

/**
 * Servlet implementation class CategoryServlet
 */
@WebServlet("/CategoryServlet")
public class CategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	   private Connection con=null;
       RequestDispatcher rd;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CategoryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		con=ConnectionProvider.getConnection();
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		String description=request.getParameter("description");
		Category category=new Category();
		category.setCategoryName(name);
		category.setCategoryDescription(description);
		CategoryCosmetics cosmetic=new CategoryCosmeticsImpl();
		if (cosmetic.addCategory(category))
		{
			rd=request.getRequestDispatcher("/admin.jsp");
			rd.forward(request, response);
		}
		
		else
		{
			rd=request.getRequestDispatcher("/managecategory.jsp");
			rd.include(request, response);
		}
	}

}
