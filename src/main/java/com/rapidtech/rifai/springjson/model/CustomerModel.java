package com.rapidtech.rifai.springjson.model;

import com.rapidtech.rifai.springjson.entity.CustomerEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerModel implements Serializable {
    private Long id;

    private String fullName;

    private List<AddressModel> address;

    private String gender;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateOfBirth;

    private String placeOfBirth;

    private List<SchoolModel> schools;

    public CustomerModel(CustomerEntity entity){
        BeanUtils.copyProperties(entity, this);
    }
}
