package com.kodewala.ecommerce.repository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.kodewala.ecommerce.model.Product;

public class ProductRepository {
	List<Product> products = new ArrayList<>();

	public void addProduct(Product product) {
		products.add(product);

	}

	public List<Product> getAllProducts() {
		return products;
	}

	public Product findById(int productId) {

		for (Product product : products) {

			if (product.getProductId() == productId) {
				return product;
			}
		}

		return null;
	}

	public void deleteProduct(Product product) {
		products.remove(product);
	}
}
