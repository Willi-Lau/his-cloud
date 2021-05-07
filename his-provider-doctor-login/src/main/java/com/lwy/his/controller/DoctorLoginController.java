package com.lwy.his.controller;



import com.lwy.his.entity.doctor.DoctorLoginrecode;
import com.lwy.his.service.DoctorLoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@RestController
@RequestMapping("/DoctorLoginController")
@Api("用户登陆")
public class DoctorLoginController {
    @Autowired
    private DoctorLoginService service;

    @RequestMapping("/doctorlogin")
    @ApiOperation("用户登陆验证返回工作类型")
    public String doctorlogin(@RequestParam("username") String username,@RequestParam("password") String password){

        ConcurrentMap<String,String> map = new ConcurrentHashMap();
        map.put("username",username);
        map.put("password",password);
        String doctorlogin = service.doctorlogin(map);
        if(doctorlogin != null){
                //根据username 查找id
                int id = service.selectid(map.get("username"));
                //记录登陆时间
                DoctorLoginrecode log = new DoctorLoginrecode();
                log.setDlrdid(id);
                log.setDlrtime(new Timestamp(new Date().getTime()));
                service.addrecord(log);
            return doctorlogin;
        }
        else {
            return "no";
        }


    }
}
