package com.lwy.his.controller.doctor;


import com.lwy.his.service.DoctorLoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@RestController
@RequestMapping(value = "/DoctorChangePasswordController",method = RequestMethod.POST)
@Api("医生修改密码界面")
public class DoctorChangePasswordController {

    @Autowired
    private DoctorLoginService service;

    @PostMapping("/changepassword")
    @ApiOperation("根据username 修改密码")
    public void changepassword(String username,String password) {
        service.changepassword(username,password);
    }
}
