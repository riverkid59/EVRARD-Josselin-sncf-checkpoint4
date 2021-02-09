package com.carteTer.api.apiG7.entity;

import java.util.Date;

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
	private Date birthday;
	private String mail;
	private int telephone;
	private Date debutValidite;
	private Date finValidite;
	
	public Carte() {
		
	}

	public Carte(String nom, String prenom, Date birthday, String mail, int telephone, Date debutValidite, Date finValidite) {
		this.nom = nom;
		this.prenom = prenom;
		this.birthday = birthday;
		this.mail = mail;
		this.telephone = telephone;
		this.debutValidite = debutValidite;
		this.finValidite = finValidite;
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
