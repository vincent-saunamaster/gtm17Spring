package com.vincent.test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vincent.metier.User;
import com.vincent.service.IService;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1- Chargement du Container et création des beans
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		// 2- récupération d'un bean (attention à minuscule pour la première lettre de la classe)
		IService service = (IService) appContext.getBean("serviceImpl");
		User u = (User) appContext.getBean("user");
		u.setNom("toto");
		User u2 = (User) appContext.getBean("user");
		System.out.println("bean user=" + u.getNom());
		System.out.println("bean user2=" + u2.getNom());
		
		// 3- TTT
		service.ajouterUser(u);
		List<User> listU = service.listerUser();
		for (User user : listU) {
			System.out.println(user);
		}
		service.supprimerUser(8);
		service.listerParMC("toto");
		for (User user : listU) {
			System.out.println(user);
		}
		System.out.println(service.listerParNom("toto"));
		// 4- détruire contexte
		appContext.close();
	}

}
