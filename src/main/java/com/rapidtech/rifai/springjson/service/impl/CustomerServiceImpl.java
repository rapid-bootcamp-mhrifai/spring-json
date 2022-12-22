package com.rapidtech.rifai.springjson.service.impl;

import com.rapidtech.rifai.springjson.entity.CustomerEntity;
import com.rapidtech.rifai.springjson.model.CustomerModel;
import com.rapidtech.rifai.springjson.repository.AddressRepo;
import com.rapidtech.rifai.springjson.repository.CustomerRepo;
import com.rapidtech.rifai.springjson.repository.SchoolsRepo;
import com.rapidtech.rifai.springjson.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {
    private CustomerRepo customerRepo;
    private AddressRepo addressRepo;
    private SchoolsRepo schoolRepo;

    @Autowired
    public CustomerServiceImpl(CustomerRepo customerRepo, AddressRepo addressRepo, SchoolsRepo schoolRepo) {
        this.customerRepo = customerRepo;
        this.addressRepo = addressRepo;
        this.schoolRepo = schoolRepo;
    }

    @Override
    public List<CustomerModel> getAll() {
        return null;
    }

    @Override
    public Optional<CustomerModel> getById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<CustomerModel> save(CustomerModel model) {
        if (model == null || model.getAddress().isEmpty()) {
            return Optional.empty();
        }

        CustomerEntity entity = new CustomerEntity(model);
        entity.addAddressList(model.getAddress());
        entity.addSchoolList(model.getSchools());

        try {
            this.customerRepo.save(entity);
            return Optional.of(model);
        } catch (Exception e) {
            log.error("Purchase Order save is failed, error: {}", e.getMessage());
            return Optional.empty();
        }
    }

    @Override
    public Optional<CustomerModel> update(Long id, CustomerModel model) {
        return Optional.empty();
    }

    @Override
    public Optional<CustomerModel> delete(Long id) {
        return Optional.empty();
    }
}