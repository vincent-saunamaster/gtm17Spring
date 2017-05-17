package com.vincent.dao.springdata;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vincent.metier.User;

public interface UserRepository extends JpaRepository<User, Long>{

	public User findFirstByNom(String nom);
	
	@Query("SELECT u FROM User u where u.nom LIKE %?1%")
	public List<User> findByMC(String MC);
}
