package com.example.demoes;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ConfigurableApplicationContext;

import com.example.demoes.Application;
import com.example.demoes.entity.ProductEntity;
import com.example.demoes.repository.ProductRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		
		
		ProductRepository productrepository=context.getBean(ProductRepository.class);
		
		ProductEntity productentity=new ProductEntity();
		
		productentity.setId(101);
		
		productentity.setName("Lakshmi");
		
		productentity.setEmail("lakshmi@gmail.com");
		
		productentity.setSalary(35000);
		
//		to insert the records
		
		productrepository.save(productentity);
		
		
		ProductEntity productentity1=new ProductEntity();
		
		productentity1.setId(102);
		
		productentity1.setName("Ram");
		
		productentity1.setEmail("ram@gmail.com");
		
		productentity1.setSalary(50000);
		
		productrepository.save(productentity1);
		
		ProductEntity productentity2=new ProductEntity();
		
		productentity2.setId(103);
		
		productentity2.setName("Sita");
		
		productentity2.setEmail("sita@gmail.com");
		
		productentity2.setSalary(80000);
		
		productrepository.save(productentity);
		
//		findById because optional means to avoid null pointer exception
		
		Optional<ProductEntity> product=productrepository.findById(101);
		
//		findall fetch all records
		
		List<ProductEntity> pe1=productrepository.findAll();
		
//		deletebyid
		
//		productrepository.deleteById(101);
		
//		count()
		
		long total=productrepository.count();
		
//		existbyid
		
		boolean exists=productrepository.existsById(101);
		
		
		List<ProductEntity> findByName=productrepository.findByName("Lakshmi");
		
		List<ProductEntity> findBySalary=productrepository.findBySalary(35000l);
		
		List<ProductEntity> findByNameAndSalary=productrepository.findByNameAndSalary("Ram", 50000l);
		
		List<ProductEntity> findBysalaryGreaterThan=productrepository.findBysalaryGreaterThan(20000l);
		
//		List<ProductEntity> findByNameIn=productrepository.findByNameIn("sita","Ram");
		
		List<ProductEntity> findByNameIgnoreCase=productrepository.findByNameIgnoreCase("Lakshmi");
		
		List<ProductEntity> findByNameContainingIgnoreCaseAndSalaryGreaterThan=productrepository.findByNameContainingIgnoreCaseAndSalaryGreaterThan("Lakshmi",35000l);
		
		
		
		
	}

}
