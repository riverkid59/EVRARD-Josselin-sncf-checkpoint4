package com.carteTer.api.apiG7.dto;

import java.util.Date;

public class CarteDto {
	
	private String nom;
	private String prenom;
	private Date birthday;
	private String mail;
	private int telephone;
	private Date debutValidite;
	private Date finValidite;
	

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
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
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
	public Date getDebutValidite() {
		return debutValidite;
	}
	public void setDebutValidite(Date debutValidite) {
		this.debutValidite = debutValidite;
	}
	public Date getFinValidite() {
		return finValidite;
	}
	public void setFinValidite(Date finValidite) {
		this.finValidite = finValidite;
	}
	

}
