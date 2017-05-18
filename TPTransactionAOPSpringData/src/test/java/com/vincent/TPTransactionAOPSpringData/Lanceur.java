package com.vincent.TPTransactionAOPSpringData;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import com.vincent.interceptors.exception.ArticleNotFoundException;
import com.vincent.interceptors.exception.NotEnoughArticleException;
import com.vincent.interceptors.exception.QtyNegativeException;
import com.vincent.metier.Stock;
import com.vincent.service.IService;

public final class Lanceur {

	public static void main(String[] args) throws ArticleNotFoundException, QtyNegativeException, NotEnoughArticleException {
		// TODO Auto-generated method stub
		// 1- Chargement du Container et création des beans
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		// 2- récupération d'un bean (attention à minuscule pour la première
		// lettre de la classe)
		IService service = (IService) appContext.getBean("serviceIpl");
		/*
		 * Stock s = (Stock)appContext.getBean("stock");
		s.setNom("ordinateurs");
		s.setQuantite(40);
		service.ajouter(s);
		Stock s2 = (Stock)appContext.getBean("stock");
		s2.setNom("claviers");
		s2.setQuantite(80);
		service.ajouter(s2);
		Stock s3 = (Stock)appContext.getBean("stock");
		s3.setNom("souris");
		s3.setQuantite(80);
		service.ajouter(s3);
		*/
		System.out.println(service.getQtyEnStock(1));
		
		service.sortArticledustock(1, 1);
		System.out.println(service.getQtyEnStock(1));
		
	
		appContext.close();
	}

}
