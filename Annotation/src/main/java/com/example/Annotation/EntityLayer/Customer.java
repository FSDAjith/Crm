package com.example.Annotation.EntityLayer;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long Id;
	
	private String name;
	private String gender;
	private int age;
	private String mobile;
	private String email;
	
	@OneToMany(cascade = CascadeType.ALL)//mention here to i am not create the column
	@JoinColumn(name="cutomer_id_fk",referencedColumnName = "id")
	private List<Product> prodects;
	
	
	
	Customer(){
	}

	
	public Customer(Long id, String name, String gender, int age, String mobile, String email, List<Product> prodects) {
		super();
		Id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.mobile = mobile;
		this.email = email;
		this.prodects = prodects;
	}



	public Long getId() {
		return Id;
	}



	public void setId(Long id) {
		Id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getMobile() {
		return mobile;
	}



	public void setMobile(String mobile) {
		this.mobile = mobile;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}

	public List<Product> getProdect() {
		return prodects;
	}

	public void setProdect(List<Product> prodects) {
		this.prodects = prodects;
	}

}
