package com.example.demoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoes.entity.ProductEntity;
import java.util.List;


@Repository
public interface ProductRepository extends JpaRepository<ProductEntity,Integer>{
	
	List<ProductEntity> findByName(String name);
	
	List<ProductEntity> findBySalary(Long salary);
	
	List<ProductEntity> findByNameAndSalary(String name,Long salary );
	
	List<ProductEntity> findBysalaryGreaterThan(long salary);
	
//	List<ProductEntity> findByNameIn(List<String> name);
	
	List<ProductEntity> findByNameIgnoreCase(String name);
	
	

//	List<ProductEntity> findByNameContainingIgnoreCaseAndSalaryGreaterThan(String name, long salary);

	List<ProductEntity> findByNameContainingIgnoreCaseAndSalaryGreaterThan(String name, long salary);

}
