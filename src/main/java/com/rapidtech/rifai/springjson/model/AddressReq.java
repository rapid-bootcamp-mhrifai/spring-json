package com.rapidtech.rifai.springjson.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.security.DenyAll;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressReq implements Serializable {
    private String name;
    private String address;
    private String village;
    private String district;
    private String city;
    private String province;
}
