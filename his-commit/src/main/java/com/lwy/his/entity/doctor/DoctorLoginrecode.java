package com.lwy.his.entity.doctor;

import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;


@Data
@ApiOperation("医生登陆日志")
@NoArgsConstructor
@AllArgsConstructor
public class DoctorLoginrecode implements Serializable {

    private int dlrdid;
    private Timestamp dlrtime;
}
