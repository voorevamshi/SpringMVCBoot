package com.vmc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vmc.entity.Country;
import com.vmc.repository.CountryRepository;
import com.vmc.service.CountryService;

@Controller
@RequestMapping("/admin")
public class CountryController {
	
	@Autowired
	CountryRepository countryRepository;
	
	@Autowired
	CountryService countryService;
	@GetMapping("/manageCountries")
	public String gotoCountryPage(Model model){
		countryService.m1("testValue");
		System.out.println("----------Entered into manageCountries------------");
		commonCode(model);
		 return "manageCountries";
	}
	
	@PostMapping("/addCountry")
	public String addCountry(@ModelAttribute("country") Country country,Model model){
		System.out.println("----------Entered into addCountry------------"+country);
		country=countryRepository.save(country);
		model.addAttribute("countryData", country);
		commonCode(model);
		return "manageCountries";
	}
	@GetMapping("/getCountry")
	public String getCountry(@RequestParam("countryNo") String countryNo,Model model){
		System.out.println("----------Entered into getCountry------------");
		Country Country=countryRepository.findOne(Integer.parseInt(countryNo));
		model.addAttribute("getCountryData", Country);
		commonCode(model);
		return "manageCountries";
	}
	@GetMapping("/getAllCountrys")
	public @ResponseBody List<Country> getAllCountrys(Model model){
		System.out.println("----------Entered into getAllCountrys------------");
		return (List<Country>) countryRepository.findAll();
	}
	@GetMapping("/deleteCountry")
	public String deleteCountry(@RequestParam("CountryId") String CountryId,Model model){
		System.out.println("----------Entered into deleteCountry------------");
		countryRepository.delete(Integer.parseInt(CountryId));
		commonCode(model);
		return "manageCountries";
	}
	@GetMapping("/updateCountry")
	public String updateCountry(@RequestParam("CountryId") String CountryId,Model model){
		System.out.println("----------Entered into updateCountry------------");
		Country Country=countryRepository.findOne(Integer.parseInt(CountryId));
		model.addAttribute("country",Country);
		model.addAttribute("countryList", countryRepository.findAll());
		return "manageCountries";
	}
	public void commonCode(Model model){
		//bind Empty CountryObject
		model.addAttribute("country", new Country());
		//show all Countrys
		model.addAttribute("countryList", countryRepository.findAll());
	}
	
	/*@GetMapping("/searchCountrysByName")
	public @ResponseBody List<Country> searchCountrysByName(@RequestParam("CountryName") String CountryName,Model model){
		List<Country> CountryList=CountryRepository.searchCountrysByName(CountryName);
		return CountryList;
	}*/
}
