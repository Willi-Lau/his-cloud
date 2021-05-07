package com.lwy.his.entity.temporary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 前端检查检验项目放到一起时 临时存储
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Allitems implements Serializable {
    private String id;
    private String medical;
    private BigDecimal money;
    private String name;
    private String pinyin;
    private int prrid;

}
