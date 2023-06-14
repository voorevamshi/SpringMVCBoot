package com.vmc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.vmc.entity.Country;
import com.vmc.repository.CountryRepository;

@Service
public class CountryService {

	@Value("${testproperty}")
	private String testProperty;
	
	@Autowired
	CountryRepository countryRepository;

	public void m1(String checkValue) {
		String s1 = "123";
		Country country=countryRepository.findOne(1);
		s1=m2(checkValue,null)+"ab";
		
		s1=s1+checkValue;
	}

	public String m2(String s1,String s2) {
		if (s1.equals(testProperty)) {
			return "good";
		} else {
			return "bad";
		}

	}

}
