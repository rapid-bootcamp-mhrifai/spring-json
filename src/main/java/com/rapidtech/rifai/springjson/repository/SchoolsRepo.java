package com.rapidtech.rifai.springjson.repository;

import com.rapidtech.rifai.springjson.entity.SchoolEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolsRepo extends JpaRepository<SchoolEntity, Long> {
}
