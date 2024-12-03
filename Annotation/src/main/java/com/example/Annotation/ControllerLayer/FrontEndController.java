package com.example.Annotation.ControllerLayer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class FrontEndController {
	
	@GetMapping("/index")
	public String indexView(Model model) {
		return "index";
	}
	@GetMapping("/template/form")
	public String customerTemplate() {
		return "customer-form";
	}
	
}
