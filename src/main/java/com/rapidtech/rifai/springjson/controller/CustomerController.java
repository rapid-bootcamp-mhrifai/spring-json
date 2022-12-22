package com.rapidtech.rifai.springjson.controller;

import com.rapidtech.rifai.springjson.model.CustomerModel;
import com.rapidtech.rifai.springjson.model.CustomerRequest;
import com.rapidtech.rifai.springjson.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    private CustomerService service;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.service = customerService;
    }
//hhh
    @PostMapping(value = "/save", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> save(@RequestBody CustomerModel request){
        return ResponseEntity.ok().body(
                new CustomerRequest(service.save(request))
        );
    }
}
