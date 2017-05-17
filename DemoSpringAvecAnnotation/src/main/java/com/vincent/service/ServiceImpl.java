package com.vincent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vincent.dao.springdata.UserRepository;
import com.vincent.metier.User;

@Service
public class ServiceImpl implements IService {

	@Autowired
	// @Qualifier("daoImplHibernate")
	// @Qualifier("daoImplJPA")
	// private IDao dao;
	UserRepository userRepository;

	public void ajouterUser(User u) {
		// TODO Auto-generated method stub
		// dao.ajouterUser(u);
		userRepository.save(u);
	}

	public List<User> listerUser() {
		// TODO Auto-generated method stub
		//return dao.listerUser();
		return userRepository.findAll();
	}

	public void supprimerUser(long id) {
		// TODO Auto-generated method stub
		// dao.supprimerUser(id);
		userRepository.delete(id);
	}

	public User trouverUser(long id) {
		// TODO Auto-generated method stub
		// return dao.trouverUser(id);
		return userRepository.findOne(id);
	}

	public List<User> listerParMC(String nom) {
		// TODO Auto-generated method stub
		//return dao.listerParMC(nom);
		return userRepository.findByMC(nom);
	}

	public User listerParNom(String nom) {
		// TODO Auto-generated method stub
		//return dao.listerParNom(nom);
		return userRepository.findFirstByNom(nom);
	}

}
