package com.lwy.his.entity.assets;

import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Api("检查项目表")
@NoArgsConstructor
@AllArgsConstructor
public class Inspection_items implements Serializable {
    private String iiid;
    private String iiname;
    private String iipinyin;
    private BigDecimal iimoney;
    private int iimedical;
}
