package com.nik;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Manager {
	private static ApplicationContext context;

	public static void main(String[] args) throws Exception {
		context = new ClassPathXmlApplicationContext("Beans.xml");

		CustomerBo customer = context.getBean("customerBo", CustomerBo.class);
		//customer.addCustomer();
		//customer.addCustomerReturnValue();
		//customer.addCustomerAround("kumar");

		//customer.addCustomerThrowException();
		context.getBean("a1", A.class).test();
	}
}
