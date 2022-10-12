package com.nik;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspectAfterThrowing {

	// for any exception of the package level uncomment bellow line
	//@AfterThrowing(pointcut = "execution(* com.nik..*(..))", throwing ="error")
	@AfterThrowing(pointcut = "execution(* com.nik.CustomerBo.addCustomerThrowException(..))", throwing = "error")
	public void logAfterThrowing(JoinPoint joinPoint, Exception error) {

		System.out.println("logAfterThrowing() is running!");
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("Exception : " + error.toString());
		System.out.println(joinPoint.toLongString());
		System.out.println("******");

	}
}