package com.cosmetic.dao;

import java.util.List;

import com.cosmetics.model.Product;

public interface ProductCosmetics {
	boolean addProduct(Product product);
	boolean updateProduct(Product product);
	boolean deleteProduct(String productId);
	List<Product> getProduct();
	Product getAllProductByProductName(String productId);
	Product getAllProductByProductCategory(String productCategory);
}
