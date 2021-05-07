package com.lwy.his.controller.patient;




import com.lwy.his.service.PatientLoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;


@Api("患者更改密码")
@RestController
@RequestMapping("/PatientChangePasswordController")
public class PatientChangePasswordController {

     @Autowired
     private PatientLoginService service;

    @RequestMapping("/changepassword")
    @ApiOperation("根据username 修改密码")
    public void changepassword(String username,String password) {
        service.changepassword(username,password);
    }
}
