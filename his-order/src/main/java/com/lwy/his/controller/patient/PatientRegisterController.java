package com.lwy.his.controller.patient;



import com.lwy.his.entity.patient.PatientUser;

import com.lwy.his.service.PatientLoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.Date;


@RequestMapping("PatientRegisterController")
@RestController
@Api("患者注册界面")
public class PatientRegisterController {
    @Autowired
    private PatientLoginService service;

    @ApiOperation("注册患者")
    @RequestMapping(value = "/registerpatient",method = RequestMethod.POST)
    public String registerpatient(@RequestBody PatientUser user){
        return service.registerpatient(user);
    }

}
