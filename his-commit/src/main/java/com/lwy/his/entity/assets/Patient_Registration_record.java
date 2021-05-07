package com.lwy.his.entity.assets;


import com.lwy.his.entity.assets.Medical_record;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * 挂号记录表
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Patient_Registration_record implements Serializable {

    private int prrid;
    private int prrpuid;
    private Timestamp prrtime;
    private BigDecimal prrmoney;
    private int prrmrid;
    private int prrWithdrawal_number;
    private int prrdoid;
    private int prralready;
    //一对一 病例id
    private Medical_record medical_record;


}
