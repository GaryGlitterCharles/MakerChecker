package com.makerchecker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.makerchecker.domain.Temperary;
@Repository
public interface JpaRepoInterfaceTemp extends JpaRepository<Temperary, Integer>
{
	
}
