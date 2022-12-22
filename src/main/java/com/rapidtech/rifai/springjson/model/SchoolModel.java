package com.rapidtech.rifai.springjson.model;

import com.rapidtech.rifai.springjson.entity.SchoolEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SchoolModel implements Serializable {
    private Long id;
    private String title;
    private String name;
    private String level;

    public SchoolModel(SchoolEntity entity){
        BeanUtils.copyProperties(entity, this);
    }
}
