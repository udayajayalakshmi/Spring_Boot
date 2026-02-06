package com.example.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.project.entity.CustomerEntity;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity,Integer>{
	
@Query("SELECT c From CustomerEntity c where c.firstname=:firstname")
List<CustomerEntity> getByName(@Param("firstname") String firstname);

@Query("SELECT c From CustomerEntity c WHERE c.salary>:salary")

List<CustomerEntity> getSalaryGreaterThan(@Param("salary") double salary);

@Query("SELECT c From CustomerEntity c WHERE c.email>:email")

List<CustomerEntity> getByEmail(@Param("email") String email);
}
