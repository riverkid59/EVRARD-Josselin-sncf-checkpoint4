package com.carteTer.api.apiG7.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Carte")
public class Carte {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nom;
	private String prenom;
	private LocalDate birthday;
	private String mail;
	private int telephone;
	private String adresse;
	private LocalDate debutValidite;
	private LocalDate finValidite;
	
	public Carte() {
		
	}

	public Carte(String nom, String prenom, LocalDate birthday, String mail, int telephone, String adresse, LocalDate debutValidite, LocalDate finValidite) {
		this.nom = nom;
		this.prenom = prenom;
		this.birthday = birthday;
		this.mail = mail;
		this.telephone = telephone;
		this.adresse = adresse;
		this.debutValidite = debutValidite;
		this.finValidite = finValidite;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	public LocalDate getDebutValidite() {
		return debutValidite;
	}

	public void setDebutValidite(LocalDate debutValidite) {
		this.debutValidite = debutValidite;
	}

	public LocalDate getFinValidite() {
		return finValidite;
	}

	public void setFinValidite(LocalDate finValidite) {
		this.finValidite = finValidite;
	}

}
