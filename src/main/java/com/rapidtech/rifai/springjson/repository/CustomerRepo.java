package com.rapidtech.rifai.springjson.repository;

import com.rapidtech.rifai.springjson.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<CustomerEntity, Long> {
}
