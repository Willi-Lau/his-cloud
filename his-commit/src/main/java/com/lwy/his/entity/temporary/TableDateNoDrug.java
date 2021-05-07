package com.lwy.his.entity.temporary;

import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Api("临时存储非药品记录表")
@NoArgsConstructor
@AllArgsConstructor
public class TableDateNoDrug implements Serializable {

    private String nid;
    private String nname;
    private String pinyin;
    private String nformat;
    private BigDecimal nmoney;
    private int nmediacl;
    private int nnum;
    private BigDecimal nallmoney;
    private int prrid;


}
