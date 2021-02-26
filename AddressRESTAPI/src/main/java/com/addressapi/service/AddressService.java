package com.addressapi.service;

import java.util.List;

import com.addressapi.entity.Address;

public interface AddressService {

	public List<Address> findAll();

	public Address findById(int theId);
	
	public void save(Address address);
	
    public void update(int id, Address address);

    void delete(int id);
	
	
	
}
