package com.yash;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UpdateDemoUser {
	public static void main(String[] args) {
		

	ApplicationContext objAC = new ClassPathXmlApplicationContext("applicationContext.xml");
	UserDAO udao = (UserDAO) objAC.getBean("userdao");
	
	User objU = new User();

	objU.setFirstname("sanjiv");
	objU.setLastname("kale");
	objU.setAdd1("mk colony");
	objU.setAdd2("dhule");
	objU.setDob("29-06-1998");
	objU.setEmail("mayur83@gmail.com");
	objU.setPassword("mayur@123");
	objU.setCity("purandar");
	objU.setMobile("9973455748");
	
	
	objU.setUserid(5);
	udao.update(objU);
	
}
}
