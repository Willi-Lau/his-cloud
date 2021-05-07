package com.lwy.his.entity.doctor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * 检验医生记录表
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DoctorTestrecode implements Serializable {

    private String dtrid;
    private int dtrmrid;
    private int dtrduid;
    private String  dtrtid;
    private Timestamp dtrtime;
}
