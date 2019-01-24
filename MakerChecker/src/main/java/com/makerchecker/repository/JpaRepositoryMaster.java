package com.makerchecker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.makerchecker.domain.Master;
import com.makerchecker.domain.Temperary;

public interface JpaRepositoryMaster extends JpaRepository<Master, Integer>
{
	Master findByCustomerCode(String customerCode);
}
