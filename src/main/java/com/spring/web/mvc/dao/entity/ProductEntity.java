package com.spring.web.mvc.dao.entity;

public class ProductEntity {
	int pid;
	String name;
	String color;
	String type;
	String price;
	String description;
	String photo;
	String size;
	
	public ProductEntity() {
		
	}
	
	public ProductEntity(String name, String color, String type, String price, String description, String photo,
			String size) {
		super();
		this.name = name;
		this.color = color;
		this.type = type;
		this.price = price;
		this.description = description;
		this.photo = photo;
		this.size = size;
	}
	
	public ProductEntity(int pid, String name, String color, String type, String price, String description, String photo,
			String size) {
		super();
		this.pid = pid;
		this.name = name;
		this.color = color;
		this.type = type;
		this.price = price;
		this.description = description;
		this.photo = photo;
		this.size = size;
	}
	
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "ProductEntity [name=" + name + ", color=" + color + ", type=" + type + ", price=" + price
				+ ", description=" + description + ", photo=" + photo + ", size=" + size + "]";
	}
}
