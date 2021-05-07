package com.lwy.his.controller.patient;



import com.lwy.his.entity.patient.PatientUser;
import com.lwy.his.service.PatientLoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@RestController
@RequestMapping("/PatientForgetPasswordController")
@Api("患者忘记密码")
public class PatientForgetPasswordController {
    @Autowired
    private PatientLoginService service;

    @ApiOperation("验证修改密码时提交的电话号或身份证是否正确")
    @RequestMapping("/selectforgetpasswordinf")
    public String  selectforgetpasswordinf(String username,String key,String value){
        return service.selectforgetpasswordinf(username,key,value);
    }
}
