package com.rapidtech.rifai.springjson.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerRequest {
    private Long id;
    private String fullName;
    private String gender;
    private Date dateOfBirth;
    private String placeOfBirth;

    private List<AddressReq> address = new ArrayList<>();

    private List<SchoolsReq> schools = new ArrayList<>();
}
