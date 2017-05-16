package com.vincent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.vincent.dao.IDao;
import com.vincent.metier.User;

@Service
public class ServiceImpl implements IService {

	@Autowired
	@Qualifier("daoImplHibernate")
	private IDao dao;

	public void ajouterUser(User u) {
		// TODO Auto-generated method stub
		dao.ajouterUser(u);
	}

	public List<User> listerUser() {
		// TODO Auto-generated method stub
		return dao.listerUser();
	}

	public void supprimerUser(long id) {
		// TODO Auto-generated method stub
		dao.supprimerUser(id);
	}

	public User trouverUser(long id) {
		// TODO Auto-generated method stub
		return dao.trouverUser(id);
	}

	public List<User> listerParMC(String nom) {
		// TODO Auto-generated method stub
		return dao.listerParMC(nom);
	}

	public User listerParNom(String nom) {
		// TODO Auto-generated method stub
		return dao.listerParNom(nom);
	}

}
