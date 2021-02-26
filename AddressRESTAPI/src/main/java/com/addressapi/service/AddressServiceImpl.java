package com.addressapi.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.addressapi.dao.AddressRepository;
import com.addressapi.entity.Address;


@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	private AddressRepository addressRepository;


	@Override
	@Transactional
	public List<Address> findAll() {

		return addressRepository.findAll();
	}

	@Override
	@Transactional
	public Address findById(int theId) {
		return addressRepository.findById(theId).orElse(new Address());
	}

	@Override
	@Transactional
	public void save(Address address) {
		addressRepository.save(address);
		
	}


	@Override
	public void update(int id, Address address) {
		// TODO Auto-generated method stub
		addressRepository.findById(id).orElse(new Address());
		//address.setId(id);
        addressRepository.save(address);
		
	}

	@Override
	public void delete(int id) {
		addressRepository.findById(id).ifPresent(address -> addressRepository.delete(address));
		
	}

}
