package com.vincent.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.vincent.metier.Stock;
@Transactional //spring 
public interface StockRepository extends JpaRepository<Stock, Integer>{
	
	@Modifying // pour modifier la BDD
	@Query("UPDATE Stock s SET s.quantite=s.quantite-?2 WHERE s.id=?1")
	public void sortArticleduStock(int id, int qte);

}
