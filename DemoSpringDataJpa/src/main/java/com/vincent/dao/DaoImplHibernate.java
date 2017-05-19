package com.vincent.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query; // Attention -> celui-là est le bon 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.vincent.metier.User;

@Repository // Spring
@Transactional // Spring
public class DaoImplHibernate implements IDao {

	@Autowired // Spring
	private SessionFactory sessionFactory; // Hibernate

	// hibernate propre == entityManager(JPA)
	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void ajouterUser(User u) {
		// TODO Auto-generated method stub
		getSession().save(u); // hibernate
	}

	public List<User> listerUser() {
		// TODO Auto-generated method stub
		Query q = getSession().createQuery("from User");
		return q.list();
	}

	public void supprimerUser(long id) {
		// TODO Auto-generated method stub
		getSession().delete(trouverUser(id));
	}

	public User trouverUser(long id) {
		// TODO Auto-generated method stub
		return getSession().get(User.class, id);
	}

	public List<User> listerParMC(String nom) {
		// TODO Auto-generated method stub
		String req = "from User as u where u.nom like :nom";
		Query q = getSession().createQuery(req);
		q.setParameter("nom", "%" + nom + "%");
		return q.list();
	}

	public User listerParNom(String nom) {
		// TODO Auto-generated method stub
		String req = "from User as u where u.nom like :nom";
		Query q = getSession().createQuery(req);
		q.setParameter("nom", nom);
		q.setMaxResults(1);
		return (User) q.uniqueResult();
		//return (User) trouverUser(q.getFirstResult());
	}

}
