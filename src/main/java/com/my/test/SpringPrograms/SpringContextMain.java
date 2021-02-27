package com.my.test.SpringPrograms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringContextMain {

	public static void main(String[] args) {
	@SuppressWarnings("resource")
	ApplicationContext applicationContext = new AnnotationConfigApplicationContext(App.class);
	MyService bean = (MyService)applicationContext.getBean("myBean");
    System.out.println(bean.getMyName());
	}

}
