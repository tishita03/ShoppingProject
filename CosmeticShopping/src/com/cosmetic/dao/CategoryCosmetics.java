package com.cosmetic.dao;

import java.util.List;

import com.cosmetics.model.Category;

public interface CategoryCosmetics {
	boolean addCategory(Category category);
	boolean updateCategory(Category category);
	boolean deleteCategory(String categoryName);
	List<CategoryCosmetics> getAllCategory();

	

}
