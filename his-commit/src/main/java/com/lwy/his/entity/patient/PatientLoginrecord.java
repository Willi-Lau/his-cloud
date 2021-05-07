package com.lwy.his.entity.patient;

import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
@ApiOperation("患者登陆日志表")
@NoArgsConstructor
@AllArgsConstructor
public class PatientLoginrecord implements Serializable {
    private int plrpid;
    private Timestamp plrtime;
}
