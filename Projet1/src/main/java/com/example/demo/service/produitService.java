package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import com.example.demo.dao.iproduitrep;
import com.example.demo.entities.produit;

@RestController
public class produitService {
@Autowired
private iproduitrep ipdao;




@RequestMapping("/all")
public List<produit> getall(){
	return ipdao.findAll();
}


@RequestMapping("/save")
public produit saveProduit(produit p) {
	ipdao.save(p);
	return p;	
}

@RequestMapping ("/produits")

public Page<produit> getProduits(int page) {
	//return prodRepo.findAll(pageable);
	  return ipdao.findAll(PageRequest.of(page, 5, Sort.by("id")));	

}
















}
