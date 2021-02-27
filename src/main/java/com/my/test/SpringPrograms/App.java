package com.my.test.SpringPrograms;

import java.util.concurrent.atomic.AtomicInteger;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Hello world!
 *
 */
@Configuration
public class App{
   
	@Bean("myBean")
	public MyService callMethod() {
		return new MyService();
	}
	

}
