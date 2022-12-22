package com.rapidtech.rifai.springjson.service.impl;

import com.rapidtech.rifai.springjson.model.AddressModel;
import com.rapidtech.rifai.springjson.repository.AddressRepo;
import com.rapidtech.rifai.springjson.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressServiceImpl implements AddressService {
    private AddressRepo repo;

    @Autowired
    public AddressServiceImpl(AddressRepo repo) {
        this.repo = repo;
    }

    @Override
    public List<AddressModel> getAll() {
        return null;
    }

    @Override
    public Optional<AddressModel> getById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<AddressModel> save(AddressModel model) {
        return Optional.empty();
    }

    @Override
    public Optional<AddressModel> update(Long id, AddressModel model) {
        return Optional.empty();
    }

    @Override
    public Optional<AddressModel> delete(Long id) {
        return Optional.empty();
    }
}
