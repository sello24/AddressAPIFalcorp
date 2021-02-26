package com.addressapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.addressapi.dao.CountryRepository;
import com.addressapi.entity.Country;

@Service
public class CountryServiceImpl implements CountryService {

	@Autowired
	private CountryRepository countryRepository;


	
	@Override
    public List<Country> findAll() {
        return countryRepository.findAll((org.springframework.data.domain.Sort) sortByIdAsc());
    }

    private Sort sortByIdAsc() {
        return new Sort(Sort.Direction.ASC, "id");
    }

	@Override
	public Country findById(int theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Country address) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(int id, Country address) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	
}
