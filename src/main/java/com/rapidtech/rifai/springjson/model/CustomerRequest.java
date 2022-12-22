package com.rapidtech.rifai.springjson.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRequest {
    private Long id;
    private String fullName;

    private List<AddressReq> address;

    private String gender;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateOfBirth;
    private String placeOfBirth;

    private List<SchoolsReq> schools;
}
