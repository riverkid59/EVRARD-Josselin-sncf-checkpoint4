package com.carteTer.api.apiG7.mapper;

import org.springframework.stereotype.Component;


import com.carteTer.api.apiG7.dto.VendeurDto;
import com.carteTer.api.apiG7.entity.Vendeur;


@Component
public class VendeurMapper {
		
		public Vendeur mapVendeurDtoToEntity(VendeurDto dto) {
			Vendeur vendeur = new Vendeur();
			vendeur.setCp(dto.getCp());
			return vendeur;
		}
}
