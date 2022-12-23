package com.rapidtech.rifai.springjson.service;

import com.rapidtech.rifai.springjson.model.AddressModel;
import com.rapidtech.rifai.springjson.model.CustomerModel;
import com.rapidtech.rifai.springjson.model.CustomerRequest;
import com.rapidtech.rifai.springjson.model.CustomerResponse;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<CustomerModel> getAll();
    Optional<CustomerModel> getById(Long id);

    CustomerResponse saveAll(CustomerRequest request);
    Optional<CustomerModel> save(CustomerModel model);

    //Optional<AddressModel> saveAddress(AddressModel addressModel);
    Optional<CustomerModel> update(Long id, CustomerModel model);
    Optional<CustomerModel> delete(Long id);
}
