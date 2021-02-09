package com.carteTer.api.apiG7.mapper;

import org.springframework.stereotype.Component;

import com.carteTer.api.apiG7.dto.CarteDto;
import com.carteTer.api.apiG7.entity.Carte;



@Component
public class CarteMapper {
	
	public Carte mapCarteDtoToEntity(CarteDto dto) {
		Carte carte = new Carte();
		carte.setNom(dto.getNom());
		carte.setPrenom(dto.getPrenom());
		carte.setBirthday(dto.getBirthday());
		carte.setMail(dto.getMail());
		carte.setTelephone(dto.getTelephone());
		carte.setDebutValidite(dto.getDebutValidite());
		carte.setFinValidite(dto.getFinValidite());
		return carte;
	}

}
