package com.vmc.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vmc.entity.Country;
import com.vmc.entity.Employee;
import com.vmc.repository.CountryRepository;
import com.vmc.service.CountryService;

@Controller
@RequestMapping("/empService")
public class EmployeeController {
	
	@Autowired
	CountryRepository countryRepository;
	
	
	@GetMapping("/getAllEmployees")
	public @ResponseBody List<Employee> getAllEmployees(){
		System.out.println("----------Entered into getAllEmployees------------");
		List<Country> countryList=(List<Country>) countryRepository.findAll();
		System.out.println("----------Entered into getAllCountries------------"+countryList);
		List<Employee> empList= countryList.stream().map(country -> {
			Employee emp=new Employee(country.getCountryNo().toString(),country.getCountryName(),"desig","dept","fromDate","toDate","salary");
			return emp;
		}).collect(Collectors.toList());
		 return empList;
	}

}
