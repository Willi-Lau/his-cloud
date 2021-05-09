package com.lwy.his.controller;

import com.lwy.his.entity.assets.Handle;
import com.lwy.his.entity.assets.NoDrug;
import com.lwy.his.entity.doctor.DoctorNodrugrecord;
import com.lwy.his.service.NoDrugService;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CopyOnWriteArrayList;

@RestController
public class NoDrugController {
    @Autowired
    private NoDrugService service;

    @ApiOperation("查找所有的非药品信息")
    @PostMapping("/NoDrugController/selectallNoDrug")
    public CopyOnWriteArrayList<NoDrug> selectallNoDrug() {
        return service.selectallNoDrug();
    }

    @ApiOperation("统计非药品流水表的条数")
    @PostMapping("/NoDrugController/countDoctorNoDrugRecord")
    public int countDoctorNoDrugRecord() {
        return service.countDoctorNoDrugRecord();
    }

    @ApiOperation("提交到非药品医生记录表")
    @PostMapping("/NoDrugController/insertDoctorNoDrugRedord")
    public void insertDoctorNoDrugRedord(@RequestBody DoctorNodrugrecord doctorNodrugrecord) {
        service.insertDoctorNoDrugRedord(doctorNodrugrecord);
    }

    @ApiOperation("根据mrid返回患者所有非药品相关处理")
    @PostMapping("/NoDrugController/selectallHandle")
    public CopyOnWriteArrayList<Handle> selectallHandle(@RequestParam("mrid") int mrid) {
        return service.selectallHandle(mrid);
    }

    @ApiOperation("根据id 在非药品清单查找名字")
    @PostMapping("/NoDrugController/selectNameByidFromNoDrug")
    public String selectNameByidFromNoDrug(@RequestParam("id") String id) {
        return service.selectNameByidFromNoDrug(id);
    }
}
