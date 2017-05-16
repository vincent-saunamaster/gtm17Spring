package com.vincent.service;

import java.util.List;

import com.vincent.metier.User;

public interface IService {
	public void ajouterUser(User u);

	public List<User> listerUser();

	public void supprimerUser(long id);

	public User trouverUser(long id);

	public List<User> listerParMC(String nom);

	public User listerParNom(String nom);
}
