package com.vincent.TPSpectacle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Concert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1- Chargement du Container et création des beans
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("spectacle.xml");
		
		// 2- récupération d'un bean
		Performeur olivier =  (Performeur) appContext.getBean("Olivier");
		Performeur caroline =  (Performeur) appContext.getBean("Caroline");
		Performeur jeanMarc =  (Performeur) appContext.getBean("Jean-Marc");
		Performeur julien =  (Performeur) appContext.getBean("Julien");
		Performeur alain =  (Performeur) appContext.getBean("Alain");
		Performeur louis =  (Performeur) appContext.getBean("Louis");
		Performeur michel =  (Performeur) appContext.getBean("Michel");
		Performeur maurice =  (Performeur) appContext.getBean("Maurice");
		Performeur martin =  (Performeur) appContext.getBean("Martin");
		Performeur monMusicien = (Performeur) appContext.getBean("monMusicien");
		
		// 3- TTT 
		olivier.performe();
		caroline.performe();
		jeanMarc.performe();
		System.out.println("julien");
		julien.performe();
		System.out.println("alain");
		alain.performe();
		System.out.println("louis");
		louis.performe();
		System.out.println("michel");
		michel.performe();
		System.out.println("maurice");
		maurice.performe();
		System.out.println("martin");
		martin.performe();
		System.out.println("monMusicien");
		monMusicien.performe();
		// 4- détruire contexte
		appContext.close();
	}

}
