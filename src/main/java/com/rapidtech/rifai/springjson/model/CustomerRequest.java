package com.rapidtech.rifai.springjson.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRequest{
    private Long id;
    private String fullName;
    private String gender;
    private Date dateOfBirth;
    private String placeOfBirth;

    public List<AddressReq> address = new ArrayList<>();

    public List<SchoolsReq> schools = new ArrayList<>();
}
