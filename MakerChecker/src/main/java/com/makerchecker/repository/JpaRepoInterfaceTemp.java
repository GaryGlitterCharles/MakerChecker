package com.makerchecker.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.makerchecker.domain.Temperary;
@Repository
public interface JpaRepoInterfaceTemp extends JpaRepository<Temperary, Integer>
{
	@Query("select t from Temperary t")
	public List<Temperary> findAll();
	
	Temperary findByCustomerCode(String customerCode);

	
	
		
	
	
}
