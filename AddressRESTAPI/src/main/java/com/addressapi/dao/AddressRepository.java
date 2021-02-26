package com.addressapi.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.addressapi.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
}
