package com.lwy.his.entity.patient;


import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

@Data
@ApiOperation("患者账户信息")
@NoArgsConstructor
@AllArgsConstructor
public class PatientUser implements Serializable {

    private int puid;
    private String puusername;
    private String pupassword;
    private String puname;
    private int pusex;
    private Date pubirthday;
    private String pucard;
    private String puaddress;
    private String puphone;
    private Timestamp pucreate;
    private String puhistory;
    private int pualive;

}
