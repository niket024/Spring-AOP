package com.nik;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Logging{

	@Before("execution(public * get*())")
	public void beforeAdvice() {
		System.out.println("Going to setup student profile.");
	}

	@After("execution(public * display*())")
	public void afterAdvice() {
		System.out.println("Student profile has been setup.");
	}

}