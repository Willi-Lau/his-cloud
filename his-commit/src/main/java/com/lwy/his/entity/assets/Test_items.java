package com.lwy.his.entity.assets;

import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Api("检验项目表")
@NoArgsConstructor
@AllArgsConstructor
public class Test_items implements Serializable {
    private String tiid;
    private String tiname;
    private String tipinyin;
    private BigDecimal timoney;
    private int timedical;
}
