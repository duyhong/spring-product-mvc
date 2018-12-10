package com.spring.web.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.web.mvc.model.Product;
import com.spring.web.mvc.service.ProductService;
import com.spring.web.mvc.service.ISizeService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private ISizeService sizeService;
	
	
	@GetMapping("/editProduct")
	public String editProduct(@RequestParam("pid") int pid,Model model){
		//int pid=request.getParameter("pid");
		Product product=productService.findProductByPid(pid);
		//Here we are mapping product object with productForm
		model.addAttribute("productForm", product);
		return "editProduct"; //editProduct.jsp
	}
	
	@PostMapping("/update-product")
	public String updateProduct(@ModelAttribute Product product,Model model){
		//String name=request.getParameter("name");
		//String email=request.getParameter("email");
		//String gender=request.getParameter("gender");
		///String mobile=request.getParameter("mobile");
		//String city=request.getParameter("city");
		//String photo=request.getParameter("photo");
		//Product product=new Product(name, email, gender, city, mobile,photo);
		//Product product = new Product(name, email, gender, city, mobile,photo);
		///Here we have to write code to save data into database
		productService.update(product);
		//request.setAttribute("product",product);
		List<Product> products=productService.getProducts();
		model.addAttribute("products",products);
		return "showProducts"; //showProducts.jsp
	}
	
	@GetMapping("/deleteProduct")
	public String deleteProduct(@RequestParam("pid") int pid, Model model){
		//String email=request.getParameter("email");
		productService.deleteProductByPid(pid);
		//Show remaining data now
		///List<Product> products=productService.getProducts();
		//model.addAttribute("products",products);
		return "redirect:/show-data"; 
	}
	
	@GetMapping({"/show-data","/"})//alias
	public String showData(Model model){
		List<Product> products=productService.getProducts();
		model.addAttribute("products",products);
		return "showProducts"; //	/WEB-INF/jsps/showProducts.jsp
	}
	
	@GetMapping("/add-product")
	public String showProductPage(){
		return "addProduct"; // /WEB-INF/jsps/addProduct.jsp
	}
	
	@PostMapping("/add-product")
	public String addProduct(@ModelAttribute Product product,Model model){
		/*String name=request.getParameter("name");
		String email=request.getParameter("email");
		String gender=request.getParameter("gender");
		String mobile=request.getParameter("mobile");
		String city=request.getParameter("city");
		String photo=request.getParameter("photo");*/
		//Product product=new Product(name, email, gender, city, mobile,photo);
		model.addAttribute("product",product);
		return "reviewProduct"; //	/WEB-INF/jsps/reviewProduct.jsp
	}
	
	
	@PostMapping("/save-review-product")
	public String saveReviewProduct(@ModelAttribute Product product,Model model){
		//String name=request.getParameter("name");
		//String email=request.getParameter("email");
		//String gender=request.getParameter("gender");
		///String mobile=request.getParameter("mobile");
		//String city=request.getParameter("city");
		//String photo=request.getParameter("photo");
		//Product product=new Product(name, email, gender, city, mobile,photo);
		//Product product = new Product(name, email, gender, city, mobile,photo);
		///Here we have to write code to save data into database
		productService.save(product);
		//request.setAttribute("product",product);
		List<Product> products=productService.getProducts();
		model.addAttribute("products",products);
		return "showProducts"; //showProducts.jsp
	}
	
	@ModelAttribute("sizes") // all the return sizes are added inside request scope with this key = "sizes"
	public List<String> loadSizes(){
		List<String> psizes=sizeService.findSizes();
		return psizes;
	}
}
