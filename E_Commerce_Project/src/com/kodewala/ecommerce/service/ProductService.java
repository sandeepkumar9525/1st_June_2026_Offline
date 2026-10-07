
package com.kodewala.ecommerce.service;

import java.util.List;
import java.util.stream.Collectors;

import com.kodewala.ecommerce.exception.InvalidQuantityException;
import com.kodewala.ecommerce.exception.ProductNotFoundException;
import com.kodewala.ecommerce.model.Product;
import com.kodewala.ecommerce.repository.ProductRepository;

public class ProductService {
	ProductRepository productRepository;

	public ProductService(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	 // Add Product
	public void addProduct(Product product) throws InvalidQuantityException {
		if (product.getQuantity() < 0) {
			throw new InvalidQuantityException("Product quantity cannot be negative");
		}
		productRepository.addProduct(product);
		System.out.println("Product added successful");
	}

	 // View All Products
	public List<Product> getAllProducts() {
		return productRepository.getAllProducts();
	}

	 // Search Product By ID
	public Product getProductById(int productId) throws ProductNotFoundException {
		Product product = productRepository.findById(productId);

		if (product == null) {
			throw new ProductNotFoundException("Product whit ID " + productId + "Does not exit");
		}

		return product;
	}

	public List<Product> searchByName(String name) {

	    return productRepository.getAllProducts().stream()
	            .filter(p -> p.getProductName()
	                    .toLowerCase()
	                    .contains(name.toLowerCase()))
	            .collect(Collectors.toList());
	}
	 // Search By Category
	public List<Product> searchByCategory(String category) {
		return productRepository.getAllProducts().stream().filter(p -> p.getCategory().equalsIgnoreCase(category))
				.collect(Collectors.toList());
	}

	  // Search By Brand
	public List<Product> searchByBrand(String brand) {
		return productRepository.getAllProducts().stream().filter(p -> p.getBrand().equalsIgnoreCase(brand))
				.collect(Collectors.toList());

	}

	 // Search By Price Range
	public List<Product> searchByPriceRange(double min, double mix) {
		return productRepository.getAllProducts().stream().filter(p -> p.getPrice() >= min && p.getPrice() <= mix)
				.collect(Collectors.toList());
	}

	
	
//	public List<Product> updatePrice(boolean ascending) {
//		return productRepository.findAll().stream()
//				.sorted((p1, p2) -> ascending ? Double.compare(p1.getPrice(), p2.getPrice())
//						: Double.compare(p2.getPrice(), p1.getPrice()))
//				.collect(Collectors.toList());
//	}

	// Update Price
	public void updatePrice(int productId, double newPrice)  {
		if(newPrice <0) {
			throw new IllegalArgumentException("Proce cancont be negative");
		}
		
		
		Product product  = getProductById(productId);
		product.setPrice(newPrice);
		System.out.println("Product price update successfull");
	}

	 // Update Quantity
	public void updateQuantity(int productId, int newQuantity) throws InvalidQuantityException  {
		
		if(newQuantity <0) {
			throw new InvalidQuantityException("Quantity cancot be negative");
		}
		
		Product product =getProductById(productId);
		product.setQuantity(newQuantity);
		System.out.println("product quantity updated successfull");
	}

	 // Delete Product
	public void deleteProduct(int productId)  {
		Product product = getProductById(productId);
		productRepository.deleteProduct(product);
		System.out.println("Product deleted successfull");
		
	}
	
	 // Sort By Price
	public List<Product> sortByPrice(){
		return productRepository.getAllProducts().stream()
				.sorted((p1,p2)-> Double.compare(p1.getPrice(), p2.getPrice()))
				.collect(Collectors.toList());
	}

}
