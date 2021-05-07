package com.lwy.his.entity.assets;


import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@ApiOperation("病大全")
@NoArgsConstructor
@AllArgsConstructor
public class Diagnosis implements Serializable {
    private int did;
    private String dname;
    private String dpinyin;
}
