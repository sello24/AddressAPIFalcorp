package com.addressapi.service;

import java.util.List;

import com.addressapi.entity.Address;
import com.addressapi.entity.Province;

public interface ProvinceService {

	public Province findById(int theId);
	
	public void save(Province address);
	
    public void update(int id, Province address);

    void delete(int id);

	List<Province> findAllByCountry(Iterable<Integer> countryCode);
	
	
	
}
