package com.example.Annotation.ControllerLayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Annotation.EntityLayer.Product;
import com.example.Annotation.ServiceLayer.ProductService;

//@RestController
@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
private ProductService productService;
	

	@GetMapping("/{customerId}/products")
	public String getProducts(@PathVariable("customerId") Long customerId,Model model) {
		model.addAttribute("products",productService.getProducts(customerId));
		
		return "product-list";
		
		//return new ResponseEntity<>
	
	}
}
