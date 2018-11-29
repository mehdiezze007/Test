package com.example.demo.entities;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class produit {
private Integer id;
private String designation;
private Integer prix;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public Integer getPrix() {
	return prix;
}
public void setPrix(Integer prix) {
	this.prix = prix;
}
public produit(String designation, Integer prix) {
	super();
	this.designation = designation;
	this.prix = prix;
}
public produit() {
	super();
	// TODO Auto-generated constructor stub
}


}
