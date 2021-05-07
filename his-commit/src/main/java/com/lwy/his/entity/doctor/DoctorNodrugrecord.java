package com.lwy.his.entity.doctor;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 非药品医生记录表
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DoctorNodrugrecord implements Serializable {
    private String dndrid;
    private int dndrmrid;
    private int dndrduid;
    private String dndrndid;
    private Timestamp dndrtime;
}
