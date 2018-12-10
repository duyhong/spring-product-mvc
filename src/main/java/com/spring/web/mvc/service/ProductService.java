package com.spring.web.mvc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.spring.web.mvc.dao.ProductDao;
import com.spring.web.mvc.dao.entity.ProductEntity;
import com.spring.web.mvc.model.Product;

@Service("ProductService")
public class ProductService {

	@Autowired
	@Qualifier("ProductDao")
	private ProductDao productDao;

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	public void save(Product product) {
		ProductEntity entity=new ProductEntity();
		BeanUtils.copyProperties(product, entity);
		productDao.save(entity);
	}
	
	public void update(Product product) {
		ProductEntity entity=new ProductEntity();
		BeanUtils.copyProperties(product, entity);
		productDao.update(entity);
	}
	
	public String deleteProductByPid(int pid){
		return productDao.deleteProductByPid(pid);
	}
	
	public Product findProductByPid(int pid){
		ProductEntity productEntity=productDao.findProductByPid(pid);
		Product product=new Product();
		BeanUtils.copyProperties(productEntity, product);
		return product;
		
	}

	public List<Product> getProducts() {
		List<Product> productsList=new ArrayList<Product>();
		List<ProductEntity> list=productDao.getProducts();
		for(ProductEntity entity:list){
			Product product=new Product();
			BeanUtils.copyProperties(entity, product);
			productsList.add(product);
		}
		return productsList;
	}

}
