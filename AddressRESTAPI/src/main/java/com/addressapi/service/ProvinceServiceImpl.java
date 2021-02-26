package com.addressapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.addressapi.dao.ProvinceRepository;
import com.addressapi.entity.Province;

@Service
public class ProvinceServiceImpl implements ProvinceService {

	@Autowired
	private ProvinceRepository provinceRepository;

	@Override
	public List<Province> findAllByCountry(Iterable<Integer> countryCode) {
		// TODO Auto-generated method stub
		
		 return provinceRepository.findAllById(countryCode);
	}

	@Override
	public Province findById(int theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Province address) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(int id, Province address) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}


	

}
