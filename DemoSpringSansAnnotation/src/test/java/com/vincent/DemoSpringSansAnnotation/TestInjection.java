package com.vincent.DemoSpringSansAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInjection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1- Chargement du Container et création des beans
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// 2- récupération d'un bean
		SocieteDevLogiciel societe = (SocieteDevLogiciel) appContext.getBean("societe");
		// 3- TTT 
		System.out.println(societe);
		// 4- détruire contexte
		appContext.close();
	}

}
