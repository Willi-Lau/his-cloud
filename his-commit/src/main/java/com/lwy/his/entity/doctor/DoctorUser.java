package com.lwy.his.entity.doctor;


import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@ApiOperation("医生账户信息")
@NoArgsConstructor
@AllArgsConstructor
public class DoctorUser implements Serializable {
    private int duid;
    private String duusername;
    private String dupassword;
    private String duname;
    private int dusex;
    private String ducard;
    private String duphone;
    private String duaddress;
    private String dudepartmentname;
    private String dutype;
    private String dutitle;
    private int dualive;
}
