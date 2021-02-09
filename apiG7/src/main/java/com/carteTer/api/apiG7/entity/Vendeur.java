package com.carteTer.api.apiG7.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Vendeur")
public class Vendeur {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private int cp;
	private String nom;
	
	public Vendeur() { 
		
	}

	public Vendeur(int cp, String nom) {
		this.cp = cp;
		this.nom = nom;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
}
