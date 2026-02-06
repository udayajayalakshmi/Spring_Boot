package com.example.project;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.project.entity.CustomerEntity;
import com.example.project.repository.CustomerRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		
			CustomerRepository customerrepository=context.getBean(CustomerRepository.class);
			
			CustomerEntity customerentity=new CustomerEntity();
			
			customerentity.setId(101);
			
			customerentity.setfirstname("Lakshmi");
			
			customerentity.setlastname("punugula");
			
			customerentity.setEmail("lakshmi@gmail.com");
			
			customerentity.setSalary(30000.00);
			
			customerrepository.save(customerentity);
			
			
			CustomerEntity customerentity1=new CustomerEntity();
			
			customerentity1.setId(102);
			
			customerentity1.setfirstname("Ram");
			
			customerentity1.setlastname("hanuman");
			
			customerentity1.setEmail("Ram@gmail.com");
			
			customerentity1.setSalary(40000.00);
			
			customerrepository.save(customerentity1);
			
			CustomerEntity customerentity2=new CustomerEntity();
			
			customerentity2.setId(103);
			
			customerentity2.setfirstname("sita");
			
			customerentity2.setlastname("Ram");
			
			customerentity2.setEmail("sita@gmail.com");
			
			customerentity2.setSalary(800000.00);
			
			customerrepository.save(customerentity2);
			
			List<CustomerEntity> getByName=customerrepository.getByName("Lakshmi");
			
			List<CustomerEntity> getSalaryGreaterThan=customerrepository.getSalaryGreaterThan(20000.00);
			
			List<CustomerEntity> getEmail=customerrepository.getByEmail("lakshmi@gmail.com");
			
			
			
			
	}

}
