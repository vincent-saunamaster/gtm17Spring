package com.vincent.TPSpectacle.interceptor;

import org.aspectj.lang.ProceedingJoinPoint;

public class Musiciens {

	public Musiciens() {
	}

	// (ProceedingJoinPoint (spring) = InvocationContext (CDI)
	public Object jeJoue(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("je joue!!!");
		return pjp.proceed();
	}
}
