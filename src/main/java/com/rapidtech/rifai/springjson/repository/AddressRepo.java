package com.rapidtech.rifai.springjson.repository;

import com.rapidtech.rifai.springjson.entity.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<AddressEntity, Long> {
}
