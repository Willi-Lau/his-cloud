package com.lwy.his.controller;

import com.lwy.his.entity.assets.Drug;
import com.lwy.his.entity.doctor.DoctorDrugrecord;
import com.lwy.his.service.DrugService;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

@RestController
public class DrugController {

    @Autowired
    private DrugService service;

    @ApiOperation("查找所有的药品信息*")
    @PostMapping("/DrugController/selectallDrug")
    public CopyOnWriteArrayList<Drug> selectallDrug() {
        return service.selectallDrug();
    }

    @ApiOperation("根据药品id修改库存")
    @PostMapping("/DrugController/updateDrugNum")
    public void updateDrugNum(@RequestBody ConcurrentMap map) {
        service.updateDrugNum(map);
    }

    @ApiOperation("统计药品医生记录表数量")
    @PostMapping("/DrugController/countDoctorDrugrecord")
    public int countDoctorDrugrecord() {
        return service.countDoctorDrugrecord();
    }

    @ApiOperation("添加到开药流水里 DoctorDrugrecord")
    @PostMapping("/DrugController/insertDoctorDrugrecord")
    public void insertDoctorDrugrecord(@RequestBody DoctorDrugrecord doctorDrugrecord) {
        service.insertDoctorDrugrecord(doctorDrugrecord);
    }

    @ApiOperation("根据id 在药品清单查找名字")
    @PostMapping("/DrugController/selectNameByidFromDrug")
    String selectNameByidFromDrug(@RequestParam("id") String id){
        return service.selectNameByidFromDrug(id);
    }
}
