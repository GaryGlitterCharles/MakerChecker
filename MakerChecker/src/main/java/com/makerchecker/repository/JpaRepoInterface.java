package com.makerchecker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.makerchecker.domain.Temperary;

public interface JpaRepoInterface extends JpaRepository<Temperary, Integer>
{

}
