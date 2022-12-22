package com.rapidtech.rifai.springjson.controller;

import com.rapidtech.rifai.springjson.model.CustomerRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomersController {
    @PostMapping
    public ResponseEntity<Object> save(@RequestBody CustomerRequest customers){
        return ResponseEntity.ok().body(customers);
    }
}
