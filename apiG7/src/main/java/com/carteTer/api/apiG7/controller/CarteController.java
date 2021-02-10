package com.carteTer.api.apiG7.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.carteTer.api.apiG7.dto.CarteDto;
import com.carteTer.api.apiG7.entity.Carte;
import com.carteTer.api.apiG7.repository.CarteRepository;
import com.carteTer.api.apiG7.services.CarteService;



@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("cartes")
public class CarteController {

	@Autowired
	CarteService carteService;
	
	@Autowired
	CarteRepository carteRepository;
	
	@GetMapping
	public List<Carte> findAll(){
		return carteService.getAllCarte();
	}
	
	@GetMapping("/{id}")
	public Carte findById(@PathVariable("id") Long id ){
		return carteService.getCarteById(id);
	}
		
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Carte create(@RequestBody Carte carte) {
		return carteService.createCarte(carte);
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public ResponseEntity<Carte> update(@PathVariable("id") long id, @RequestBody CarteDto dto) {
			Carte carteToUpdate = carteService.updateCarte(id, dto);
			return ResponseEntity.ok().body(carteToUpdate);	
	}
	
	
	@DeleteMapping("/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public void deleteById(@PathVariable("id") Long id ){
		carteService.deleteByID(id);
	}
}
