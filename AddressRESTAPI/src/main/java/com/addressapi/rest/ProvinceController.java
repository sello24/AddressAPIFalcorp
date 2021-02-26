package com.addressapi.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.addressapi.entity.Province;
import com.addressapi.service.ProvinceService;

@RestController
@RequestMapping("/addressapi/province")
public class ProvinceController {

	@Autowired
	private ProvinceService provinceService;
	

	@GetMapping("/provinces/{countryCode}")
	public List<Province> findAll(@PathVariable Iterable<Integer> countryCode) {
		return provinceService.findAllByCountry(countryCode);
	}
}
