package com.addressapi.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.addressapi.entity.Country;
import com.addressapi.service.CountryService;

@RestController
@RequestMapping("/addressapi/country")
public class CountryController {

	@Autowired
	private CountryService countryService;
	

	@GetMapping("/countries")
	public List<Country> findAll() {
		return countryService.findAll();
	}
	
		
	
	
	
	
}
