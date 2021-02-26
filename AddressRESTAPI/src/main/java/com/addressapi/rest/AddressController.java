package com.addressapi.rest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.addressapi.dao.AddressRepository;
import com.addressapi.entity.Address;
import com.addressapi.service.AddressService;

@RestController
@RequestMapping("/addressApi")
public class AddressController {

	@Autowired
	private AddressService addressService;
	
	@Autowired
	private AddressRepository addressRepository;

	@Autowired
	public AddressController(AddressService addressService) {
		this.addressService = addressService;
	}

	@GetMapping("/addresses")
	public List<Address> findAll() {
		return addressService.findAll();
	}
	
	@GetMapping("/address/{addressId}")
	public Address findById(@PathVariable int addressId) {
		Address theAddress = addressService.findById(addressId);
		if(theAddress == null) {
			throw new ObjectNotFoundException("Address ID not found - " + addressId, "Address");
		}
		return theAddress;
	}
	
	@PostMapping("/addAddress")
	public Address addAddress(@RequestBody Address theAddress) {
		theAddress.setAddressId(0);
		addressService.save(theAddress);
		return theAddress;
	}
	
	
	
	@PutMapping("/address/{id}")
	public ResponseEntity<Address> updateAddress(@PathVariable(value = "id") int addressId,
	  @Valid @RequestBody Address addressDetails) {
		
	 Address address = addressRepository.findById(addressId).orElse(new Address());
	 address.setAddressId(addressDetails.getAddressId());
	 address.setCity(addressDetails.getCity());
	 address.setCountry(addressDetails.getCountry());
	 address.setLine1(addressDetails.getLine1());
	 address.setLine2(addressDetails.getLine2());
	 address.setPostcode(addressDetails.getPostcode());
	 address.setProvince(addressDetails.getProvince());
	 address.setSurburb(addressDetails.getSurburb());
	 
	 final Address updatedAddress = addressRepository.save(address);
	 return ResponseEntity.ok(updatedAddress);
	 
	}
	
	@DeleteMapping("/address/{id}")
	public Map<String, Boolean> deleteAddress(@PathVariable(value = "id") int addressId)
	   {
	 Address address = addressRepository.findById(addressId).orElse(new Address());
	  
	 addressRepository.delete(address);
	 Map<String, Boolean> response = new HashMap<>();
	 response.put("deleted", Boolean.TRUE);
	 return response;
	}
	
	
	
	
	
	
	
	
	
}
