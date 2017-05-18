package com.vincent.TPSpectacle.interceptor;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

// Spring (pour se passer de <aspect:config> et déclaration <bean.../>)
@Component
// AspectJ
@Aspect
public class Spectateurs2 {

	public Spectateurs2() {
	}
	
	// cette méthode, qu'on nomme comme on veut, est le placHolder de l'intercepteur (permet de factoriser l'appel des méthodes de l'intercepteur)
	@Pointcut("execution(* *.performe(. .))")
	public void placeHolderSpectateur2(){}

	
	@Before("placeHolderSpectateur2()")
	public void prendPlace() {
		System.out.println("tout le monde prend place sauf les absents");
	}
	@AfterReturning("placeHolderSpectateur2()")
	public void applaudit() {
		System.out.println("tout le monde applaudit sauf les absents");
	}
}
