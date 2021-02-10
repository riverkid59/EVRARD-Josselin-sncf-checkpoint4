package com.carteTer.api.apiG7.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import com.carteTer.api.apiG7.entity.Carte;
import com.carteTer.api.apiG7.mapper.CarteMapper;
import com.carteTer.api.apiG7.repository.CarteRepository;



@Service
public class CarteService {
	
	@Autowired
	CarteRepository carteRepository;
	
	@Autowired
	CarteMapper carteMapper;
	
	
	public List<Carte> getAllCarte() {
		return carteRepository.findAll();
	}
	
	public Carte getCarteById(Long id) {
        return carteRepository.findById(id).get();
    }

	public Carte createCarte(Carte carte) {
		return carteRepository.save(carte);
	}
	
	public Optional<Carte> getCarteById(long id) {
		return carteRepository.findById(id);
	}
	
	public boolean checkExistedCarte(long id) {
		if(carteRepository.existsById((long) id)) {
			return true;
		}
		return false;
	}	
	
	public Carte updateCarte(Carte carte) {
		return carteRepository.save(carte);		
	}
	
	public void deleteByID(Long id) {
		carteRepository.deleteById(id);
	}
		
}

  