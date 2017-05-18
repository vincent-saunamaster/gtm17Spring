package com.vincent.interceptors.exception;

//@Aspect
//@Component
public class NotEnoughArticleException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
/*
	public NotEnoughArticleException() {}
	
	
	@Pointcut("execution(* *.sortArticleDuStock(. .))")
	public void placeHolderNEAE() {
	}
	
	@Around("placeHolderNEAE()")
	public Object yApas(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("y'a pas assez !!");
		return pjp.proceed();
	}
	*/
}
