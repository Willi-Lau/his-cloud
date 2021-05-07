package com.lwy.his.entity.assets;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 处理表
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Handle implements Serializable {
    private String hid;
    private int hmrid;
    private String hdo;
    private int hnum;
    private Timestamp htime;
    private int halive;
    private int hgivemoney;
    private int hused;
    private String hwater;
}
