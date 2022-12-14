package com.nik;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspectAround {

	@Around("execution(* com.nik.CustomerBo.addCustomerAround(..))")
	public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {

		System.out.println("logAround() is running!");
		System.out.println("hijacked method : "
				+ joinPoint.getSignature().getName());
		System.out.println("hijacked arguments : "
				+ Arrays.toString(joinPoint.getArgs()));

		System.out.println("Around before is running!");
		if(joinPoint.getArgs()[0].equals("kumar")){// If conditions matched the proceed otherwise interrupt execution
			joinPoint.proceed(); // continue on the intercepted method
		}
		System.out.println("Around after is running!");

		System.out.println("******");

	}

}