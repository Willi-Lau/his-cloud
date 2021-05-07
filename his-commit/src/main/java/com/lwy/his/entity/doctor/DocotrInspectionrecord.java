package com.lwy.his.entity.doctor;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 检查医生记录表
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DocotrInspectionrecord implements Serializable {
    private String dirid;
    private int dirmrid;
    private int dirduid;
    private String diriid;
    private Timestamp dirtime;
}
