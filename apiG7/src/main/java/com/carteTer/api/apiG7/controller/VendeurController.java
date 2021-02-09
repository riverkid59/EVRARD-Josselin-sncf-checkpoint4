package com.carteTer.api.apiG7.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

import com.carteTer.api.apiG7.entity.Vendeur;
import com.carteTer.api.apiG7.services.VendeurService;

@RestController
public class VendeurController {

	@Autowired
	VendeurService vendeurService;
	
	@GetMapping("/vendeurs")
	public List<Vendeur> findAll(){
		return vendeurService.getAllvendeur();
	}
	
	@GetMapping("/vendeurs/{id}")
	public Vendeur findById(@PathVariable("id") Long id ){
		return vendeurService.getVendeurById(id);
	}

}
