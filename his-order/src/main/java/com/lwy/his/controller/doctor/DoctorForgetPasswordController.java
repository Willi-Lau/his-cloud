package com.lwy.his.controller.doctor;


import com.lwy.his.entity.doctor.DoctorUser;


import com.lwy.his.service.DoctorLoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;


@RestController
@RequestMapping(value = "/DoctorForgetPasswordController",method = RequestMethod.POST)
@Api("医生找回密码界面")
public class DoctorForgetPasswordController {

    @Resource
    private DoctorLoginService service;

     @ApiOperation("验证修改密码时提交的电话号或身份证是否正确")
     @RequestMapping("/selectforgetpasswordinf")
    public String  selectforgetpasswordinf(String username,String key,String value){
         ConcurrentMap<String,String> map = new ConcurrentHashMap();
         map.put("username",username);
         map.put("key",key);
         map.put("value",value);
         System.out.println("1111123");

         String duid = service.selectforgetpasswordinf(map);
         System.out.println(username+key+value);
        //查询到结果
        return duid;
    }


}
