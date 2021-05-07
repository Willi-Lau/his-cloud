package com.lwy.his.entity.assets;


import com.lwy.his.entity.doctor.DoctorDrugrecord;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Api("药品收费项目表")
@NoArgsConstructor
@AllArgsConstructor
public class Drug implements Serializable {
   private String drid;
   private String drname;
   private String drpinyin;
   private String drformat;
   private String drconsumption;
   private String drtype;
   private int drnum;
   private BigDecimal drmoney;
   private int dralive;
   private int drmedical;
   //一对一药品医生记录表
   private DoctorDrugrecord doctorDrugrecord;

}
