package com.lwy.his.entity.assets;


import com.lwy.his.entity.doctor.DoctorTestrecode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 检验表
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Test implements Serializable {
    private String tid;
    private int tmrid;
    private String tdo;
    private String tend;
    private int tnum;
    private Timestamp ttime;
    private int talive;
    private int tused;
    private int tgivemoney;
    private String twater;
    //一对一检验医生记录表
    private DoctorTestrecode doctorTestrecode;
    //一对一检验项目表
    private Test_items test_items;
}
