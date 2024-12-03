package com.example.Annotation.ServiceLayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Annotation.EntityLayer.Product;
import com.example.Annotation.RepositoryLayer.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepo;

	public List<Product> getProducts(Long customerId) {
		return productRepo.findProductUsingCustomerId(customerId);
	}

	
}
