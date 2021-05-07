package com.lwy.his.controller;



import com.lwy.his.service.DoctorChangePasswordService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;


@RestController
@RequestMapping("/DoctorChangePasswordController")
@Api("医生修改密码界面")
public class DoctorChangePasswordController {

    public static final String a = "123";
    @Autowired
    private DoctorChangePasswordService service;

    @RequestMapping("/changepassword")
    @ApiOperation("根据username 修改密码")
    public String changepassword(@RequestParam("username") String username, @RequestParam("password") String password) {
        ConcurrentMap map = new ConcurrentHashMap();
        map.put("username",username);
        map.put("password",password);

        service.changepassword(map);

        return password;

        
    }
}
