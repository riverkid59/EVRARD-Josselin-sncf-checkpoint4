package com.carteTer.api.apiG7.dto;

import java.time.LocalDate;

public class CarteDto {
	
	private String nom;
	private String prenom;
	private LocalDate birthday;
	private String mail;
	private int telephone;
	private String adresse;
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	private LocalDate debutValidite;
	private LocalDate finValidite;
	

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
