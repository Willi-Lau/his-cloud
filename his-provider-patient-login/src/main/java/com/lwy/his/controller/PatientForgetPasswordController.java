package com.lwy.his.controller;



import com.lwy.his.entity.patient.PatientUser;
import com.lwy.his.service.PatientForgetPasswordService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@RestController
@RequestMapping("/PatientForgetPasswordController")
@Api("患者忘记密码")
public class PatientForgetPasswordController {
    @Autowired
    private PatientForgetPasswordService service;

    @ApiOperation("验证修改密码时提交的电话号或身份证是否正确")
    @RequestMapping("/selectforgetpasswordinf")
    public String  selectforgetpasswordinf(@RequestParam("username") String username,
                                           @RequestParam("key") String key,
                                           @RequestParam("value") String value){

        ConcurrentMap<String, String> map = new ConcurrentHashMap<>();
        map.put("username",username);
        map.put("key",key);
        map.put("value",value);

        PatientUser duid = service.selectforgetpasswordinf(map);
        //NullPointException
        //System.out.println(duid.toString());
        //查询到结果
        if(duid.getPuusername() != null){
            return "success";
        }
        else {
            return "no";
        }
    };
}
