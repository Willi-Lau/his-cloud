package com.lwy.his.entity.doctor;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * 药品医生记录表
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DoctorDrugrecord implements Serializable {
    private String ddrid;
    private int ddrmrid;
    private int ddrduid;
    private String ddrdid;
    private Timestamp ddrtime;
}
