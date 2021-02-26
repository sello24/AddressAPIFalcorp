package com.addressapi.service;

import java.util.List;

import com.addressapi.entity.Country;

public interface CountryService {

	public List<Country> findAll();

	public Country findById(int theId);
	
	public void save(Country address);
	
    public void update(int id, Country address);

    void delete(int id);
	
	
	
}
