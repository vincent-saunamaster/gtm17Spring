package com.vincent.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.vincent.metier.User;

@Repository
public class DaoImplJPA implements IDao {

	public void ajouterUser(User u) {
		// TODO Auto-generated method stub
		System.out.println("ajouter depuis JPA");
	}

	public List<User> listerUser() {
		// TODO Auto-generated method stub
		return null;
	}

	public void supprimerUser(long id) {
		// TODO Auto-generated method stub

	}

	public User trouverUser(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> listerParMC(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

	public User listerParNom(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

}
