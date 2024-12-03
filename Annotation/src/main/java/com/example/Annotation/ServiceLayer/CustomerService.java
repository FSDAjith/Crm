package com.example.Annotation.ServiceLayer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Annotation.EntityLayer.Customer;
import com.example.Annotation.EntityLayer.Product;
import com.example.Annotation.RepositoryLayer.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository customerRepo;
	public Customer addNewCustomer(Customer customer) {
		return customerRepo.save(customer);
	
	}
	public Customer findById(Long id) {
return customerRepo.findById(id).get();
	}
	public List<Customer> getAllCustomer() {
		return customerRepo.findAll();
	}

}
