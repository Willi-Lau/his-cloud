package com.lwy.his.entity.assets;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * 缴费表
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pay implements Serializable {
    private int pid;
    private int pmrid;
    private String proid;
    private BigDecimal pmoney;
    private int pnum;
    private BigDecimal pallmoney;
    private Timestamp ptime;
    private String ptype;
    private int pgivemoney;
    private int palive;
}
