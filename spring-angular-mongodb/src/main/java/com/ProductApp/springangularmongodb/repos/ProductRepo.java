package com.ProductApp.springangularmongodb.repos;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.ProductApp.springangularmongodb.model.Product;

public interface ProductRepo extends MongoRepository<Product, String> {
	
	@Query("{'Price': {$lt: ?0}}")
    public List<Product> findProductsWithPriceLessThan(double price);
	
	@Query("{'Price': {$gt: ?0}}")
    public List<Product> findProductsWithPriceGreaterThan(double price);
	
	@Query("{ 'Description' : { $text: { $search: ?0 } }}")
	public List<Product> findProductBywordInDescription(String word_in_description);
	
    @Override
    void delete(Product deleted);
    
}