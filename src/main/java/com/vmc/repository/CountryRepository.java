package com.vmc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.vmc.entity.Country;
import com.vmc.entity.User;

public interface CountryRepository extends CrudRepository<Country,Integer>{

	
}
