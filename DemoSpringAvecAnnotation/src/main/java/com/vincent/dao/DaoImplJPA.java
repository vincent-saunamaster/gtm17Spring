package com.vincent.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.vincent.metier.User;

@Repository // Spring
@Transactional // Spring
public class DaoImplJPA implements IDao {

	@Autowired //Spring
	@PersistenceContext(name="testPU") //JPA
	private EntityManager em;
	
	
	public void ajouterUser(User u) {
		// TODO Auto-generated method stub
		em.persist(u);
	}

	public List<User> listerUser() {
		// TODO Auto-generated method stub
		Query q = (Query) em.createQuery("SELECT u from User u");
		return q.list();
	}

	public void supprimerUser(long id) {
		// TODO Auto-generated method stub
		em.remove(trouverUser(id));
	}

	public User trouverUser(long id) {
		// TODO Auto-generated method stub
		return em.find(User.class, id);
	}

	public List<User> listerParMC(String nom) {
		// TODO Auto-generated method stub
		Query q = (Query) em.createQuery("SELECT u from User u WHERE u.nom LIKE :nom");
		q.setParameter("nom", "%" + nom + "%");
		return q.list();
	}

	public User listerParNom(String nom) {
		// TODO Auto-generated method stub
		Query q = (Query) em.createQuery("SELECT u from User u WHERE u.nom LIKE :nom");
		q.setParameter("nom", nom);
		q.setMaxResults(1);
		return (User) q.uniqueResult();
	}

}
