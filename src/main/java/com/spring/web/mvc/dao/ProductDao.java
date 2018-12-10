package com.spring.web.mvc.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.web.mvc.dao.entity.ProductEntity;

@Repository("ProductDao")
public class ProductDao {
	
	@Autowired
	@Qualifier("pjdbcTemplate")
	private JdbcTemplate jdbcTemplate;

	public void save(ProductEntity product){
		System.out.println("Before saving\n");
		String sql="insert into product(name,color,type,price,description,photo,size) values(?,?,?,?,?,?,?)";
		Object data[] = new Object[]{product.getName(),product.getColor(),product.getType(),product.getPrice(),product.getDescription(),product.getPhoto(),product.getSize()};
		System.out.println(jdbcTemplate);
		jdbcTemplate.update(sql,data);	
		System.out.println("Completed saving");
	}
	
	public void update(ProductEntity product){
		System.out.println("Before updating\n");
		String sql="update product set name=?,color=?,type=?,price=?,description=?,photo=?,size=? where pid=?";
		Object data[] = new Object[]{product.getName(),product.getColor(),product.getType(),product.getPrice(),product.getDescription(),product.getPhoto(),product.getSize(),product.getPid()};
		System.out.println(jdbcTemplate);
		jdbcTemplate.update(sql,data);	
		System.out.println("Completed updating");
	}
	
	public ProductEntity findProductByPid(int pid){
		String sql="select pid,name,color,type,price,description,photo,size from product where pid=?";
		ProductEntity productEntity=(ProductEntity)jdbcTemplate.queryForObject(sql,new Object[]{pid},new BeanPropertyRowMapper(ProductEntity.class));	
		return productEntity;
	}
	
	public String deleteProductByPid(int pid){
		String sql="delete from  product where pid=?";
		int row=jdbcTemplate.update(sql, new Object[]{pid});	
		return "deleted";
	}
	
	public List<ProductEntity> getProducts(){
		List<ProductEntity> productList = new ArrayList<ProductEntity>();
		String sql="select pid,name,color,type,price,description,photo,size from product";
		productList=jdbcTemplate.query(sql, new BeanPropertyRowMapper(ProductEntity.class));	
		return productList;
	}
}
