package com.carteTer.api.apiG7.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carteTer.api.apiG7.entity.Vendeur;
import com.carteTer.api.apiG7.mapper.VendeurMapper;
import com.carteTer.api.apiG7.repository.VendeurRepository;



@Service
public class VendeurService {
	
	@Autowired
	VendeurRepository vendeurRepository;
	
	@Autowired
	VendeurMapper vendeurMapper;
	
	
	public List<Vendeur> getAllvendeur() {
		return vendeurRepository.findAll();
	}
	public Vendeur getVendeurById(Long id) {
        return vendeurRepository.findById(id).get();
    }


}
