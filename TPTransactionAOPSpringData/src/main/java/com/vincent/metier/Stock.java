package com.vincent.metier;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //Spring
@Scope("prototype") //Spring
@Entity//JPA
public class Stock implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	@Id//JPA
	@GeneratedValue(strategy=GenerationType.AUTO)//JPA
	private int id;
	private String nom;
	private int quantite;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	@Override
	public String toString() {
		return "Stock [id=" + id + ", nom=" + nom + ", quantite=" + quantite + "]";
	}

}
