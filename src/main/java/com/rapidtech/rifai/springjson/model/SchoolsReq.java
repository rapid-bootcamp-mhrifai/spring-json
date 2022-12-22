package com.rapidtech.rifai.springjson.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SchoolsReq {
    private String title;
    private String name;
    private String level;
}
