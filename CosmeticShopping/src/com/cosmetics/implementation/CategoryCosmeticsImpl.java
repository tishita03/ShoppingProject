package com.cosmetics.implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.cosmetic.dao.CategoryCosmetics;
import com.cosmetics.database.ConnectionProvider;
import com.cosmetics.model.Category;

public class CategoryCosmeticsImpl implements CategoryCosmetics {
	Connection con=null;
	   String id;
	   String name;
	   String description;

	@Override
	public boolean addCategory(Category category) {
		try
		{
			con=ConnectionProvider.getConnection();
			PreparedStatement pstmt=con.prepareStatement("insert into categorytablect values(?,?)");
			pstmt.setString(1,name);
			pstmt.setString(2,description);
			int result=pstmt.executeUpdate();
			if(result>0)
			    return true;
			else
				return false;
		}catch(Exception e)
		{
			return false;	
		}
	}

	@Override
	public boolean updateCategory(Category category) {
		try
		{
		con=ConnectionProvider.getConnection();
PreparedStatement pstmt=con.prepareStatement("update categorytablect set categoryName=? , categoryDescription=? where CategoryId=?");
		pstmt.setString(1,id);
		int result=pstmt.executeUpdate();
		if(result>0)
			return true;
		else
			return false;
		}catch(Exception ex)
		
		{
			return false;	
		}
	}

	@Override
	public boolean deleteCategory(String categoryName) {
		try
		{
			con=ConnectionProvider.getConnection();
			PreparedStatement pstmt=con.prepareStatement("delete from categorytablect where categoryId=?");
			pstmt.setString(1,id);
			int result=pstmt.executeUpdate();
			if(result>0)
				return true;
			else
				return false;
		}catch(Exception ex)
		
		{
			return false;		
		}
	}

	@Override
	public List<CategoryCosmetics> getAllCategory() {
		try
		{
			con=ConnectionProvider.getConnection();
			PreparedStatement pstmt=con.prepareStatement("select * from categorytablect");
		}catch(Exception eee)
		{
				eee.printStackTrace();
		}
		return null;
	}

	

}
