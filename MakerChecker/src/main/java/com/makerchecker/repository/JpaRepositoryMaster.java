package com.makerchecker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.makerchecker.domain.Master;

public interface JpaRepositoryMaster extends JpaRepository<Master, Integer>
{

}
