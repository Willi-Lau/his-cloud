package com.lwy.his.controller;

import com.lwy.his.entity.assets.Inspection;
import com.lwy.his.entity.assets.Inspection_items;
import com.lwy.his.entity.assets.Test;
import com.lwy.his.entity.assets.Test_items;
import com.lwy.his.entity.doctor.DocotrInspectionrecord;
import com.lwy.his.entity.doctor.DoctorTestrecode;
import com.lwy.his.service.TestService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

@RestController
@Slf4j
public class TestController {

    @Autowired
    private TestService service;

    @ApiOperation("返回所有检查项目")
    @PostMapping("TestController/selectallInspection")
    public CopyOnWriteArrayList<Inspection_items> selectallInspection() {
        return service.selectallInspection();
    }

    @ApiOperation("返回所有检验项目")
    @PostMapping("TestController/selectalltest")
    public CopyOnWriteArrayList<Test_items> selectalltest() {
        return service.selectalltest();
    }

    @ApiOperation("把提交得检验项目提交到检验表中   传入 挂号历史积极  t")
    @PostMapping("TestController/insertInspection")
    public void insertInspection(@RequestBody Inspection inspection) {
        service.insertInspection(inspection);
    }

    @ApiOperation("把提交得检查项目提交到检验表中")
    @PostMapping("TestController/insertTest")
    public void insertTest(@RequestBody Test test) {
        service.insertTest(test);
    }

    @ApiOperation("查找检验表有多少条数据")
    @PostMapping("TestController/countInspection")
    public int countInspection() {
        return service.countInspection();
    }





    @ApiOperation("查找检查表有多少条数据")
    @PostMapping("TestController/countTest")
    public int countTest() {
        return service.countTest();
    }

    @ApiOperation("统计检验医生记录表条数 需要自定义")
    @PostMapping("TestController/countDoctorTestrecord")
    public int countDoctorTestrecord() {
        return service.countDoctorTestrecord();
    }

    @ApiOperation("插入数据到检验医生记录表")
    @PostMapping("TestController/insertDoctorTestrecord")
    public void insertDoctorTestrecord(@RequestBody DoctorTestrecode doctorTestrecode) {
        service.insertDoctorTestrecord(doctorTestrecode);
    }

    @ApiOperation("统计检查医生记录表得条数")
    @PostMapping("TestController/countDoctorInspectionrecord")
    public int countDoctorInspectionrecord() {
        return  service.countDoctorInspectionrecord();
    }

    @ApiOperation("插入检查医生记录表中")
    @PostMapping("TestController/insertDoctorInspectionrecord")
    public void insertDoctorInspectionrecord(@RequestBody DocotrInspectionrecord docotrInspectionrecord) {
        service.insertDoctorInspectionrecord(docotrInspectionrecord);
    }

    @ApiOperation("将检验表相关信息设置为停用")
    @PostMapping("TestController/updateTestalive")
    public void updateTestalive(@RequestBody ConcurrentMap map) {
        service.updateTestalive(map);
    }

    @ApiOperation("将检查表相关信息设置为停用")
    @PostMapping("TestController/updateInspectionalive")
    public void updateInspectionalive(@RequestBody ConcurrentMap map) {
        service.updateInspectionalive(map);
    }
}
