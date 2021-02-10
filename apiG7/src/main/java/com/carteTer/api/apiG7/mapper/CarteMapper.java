package com.carteTer.api.apiG7.mapper;

import org.springframework.stereotype.Component;

import com.carteTer.api.apiG7.dto.CarteDto;
import com.carteTer.api.apiG7.entity.Carte;


@Component
public class CarteMapper {
	
	public Carte updateCarteFromDto(Carte carte, CarteDto dto) {
		
		carte.setNom(dto.getNom());
		carte.setPrenom(dto.getPrenom());
		carte.setBirthday(dto.getBirthday());
		carte.setMail(dto.getMail());
		carte.setTelephone(dto.getTelephone());
		carte.setAdresse(dto.getAdresse());
		carte.setDebutValidite(dto.getDebutValidite());
		carte.setFinValidite(dto.getFinValidite());
		return carte;
	}

}
