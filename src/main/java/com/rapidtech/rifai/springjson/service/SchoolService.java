package com.rapidtech.rifai.springjson.service;

import com.rapidtech.rifai.springjson.model.SchoolModel;

import java.util.List;
import java.util.Optional;

public interface SchoolService {
    List<SchoolModel> getAll();
    Optional<SchoolModel> getById(Long id);
    Optional<SchoolModel> save(SchoolModel model);
    Optional<SchoolModel> update(Long id, SchoolModel model);
    Optional<SchoolModel> delete(Long id);
}
