package com.addressapi.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.addressapi.entity.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {
}
