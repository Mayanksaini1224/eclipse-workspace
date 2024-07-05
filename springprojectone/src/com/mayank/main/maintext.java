package com.mayank.main;
import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mayank.bean.employee;


public class maintext {

	public static void main(String args[]) {
		String configfilepath="/com/mayank/resource/applicationContext.xml";
		ApplicationContext acontext = new ClassPathXmlApplicationContext(configfilepath);
		employee emp= (employee)acontext.getBean("employee");
		emp.show();
		//employee emp1= (employee)acontext.getBean("employee1");
		//emp1.show();
	}
}
