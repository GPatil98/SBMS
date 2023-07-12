package in.ganesh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ganesh.binding.Product;

@Controller
public class ProductController {

	
	@GetMapping("/product")
	public String loadForm(Model model) {
		Product productobj =new Product();
		model.addAttribute("product", productobj);
		return "index";
	}
	
	@PostMapping("/saveProduct")
	public String saveProduct(Product product, Model model) {
		System.out.println(product);
		model.addAttribute("product", product);
		return "data";
	}
}
