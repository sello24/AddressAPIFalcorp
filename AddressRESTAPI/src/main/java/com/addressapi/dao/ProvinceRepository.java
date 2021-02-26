package com.addressapi.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.addressapi.entity.Province;

@Repository
public interface ProvinceRepository extends JpaRepository<Province, Integer> {
}
