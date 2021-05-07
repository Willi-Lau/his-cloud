package com.lwy.his.entity.assets;


import com.lwy.his.entity.doctor.DoctorNodrugrecord;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 非药品
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NoDrug implements Serializable {
    private String nid;
    private String nname;
    private String npinyin;
    private String nformat;
    private BigDecimal nmoney;
    private int nalive;
    private int nmedical;
    //一对一非药品医生记录表
    private DoctorNodrugrecord doctorNodrugrecord;

}
