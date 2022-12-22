package com.rapidtech.rifai.springjson.service.impl;

import com.rapidtech.rifai.springjson.model.SchoolModel;
import com.rapidtech.rifai.springjson.repository.SchoolsRepo;
import com.rapidtech.rifai.springjson.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SchoolServiceImpl implements SchoolService {
    private SchoolsRepo repo;

    @Autowired
    public SchoolServiceImpl(SchoolsRepo repo) {
        this.repo = repo;
    }

    @Override
    public List<SchoolModel> getAll() {
        return null;
    }

    @Override
    public Optional<SchoolModel> getById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<SchoolModel> save(SchoolModel model) {
        return Optional.empty();
    }

    @Override
    public Optional<SchoolModel> update(Long id, SchoolModel model) {
        return Optional.empty();
    }

    @Override
    public Optional<SchoolModel> delete(Long id) {
        return Optional.empty();
    }
}
