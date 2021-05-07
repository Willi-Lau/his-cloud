package com.lwy.his.entity.assets;

import com.lwy.his.entity.doctor.DocotrInspectionrecord;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 检查表
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Inspection implements Serializable {
    private String inid;
    private int inmrid;
    private String indo;
    private String inend;
    private int innum;
    private Timestamp intime;
    private int inalive;
    private int inused;
    private int ingivemoney;
    private String inwater;
    //一对一检查医生记录表
    private DocotrInspectionrecord docotrInspectionrecord;
    //一对一检查项目列表
    private Inspection_items inspection_items;


}
