package com.example.Annotation.ControllerLayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Annotation.EntityLayer.Customer;
import com.example.Annotation.ServiceLayer.CustomerService;

//@RestController
@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/addNewCustomer")
	public Customer newCustomer(@RequestBody Customer customer) {
		return customerService.addNewCustomer(customer);
				
	}
	@GetMapping("/getCustomer/{id}")
	public Customer getCustomer(@PathVariable Long id) {
		return customerService.findById(id);
	}
	
	@GetMapping("/list")
	public String getCustomer(Model model) {
		model.addAttribute("customers",customerService.getAllCustomer());
		return "customer-list";
	
	}
	@PostMapping("/saveUserInfo")
	public String saveUserInfo(@ModelAttribute Customer customer,Model model) {
		customerService.addNewCustomer(customer);
		return "redirect:/customer/list";
	}

	
}
