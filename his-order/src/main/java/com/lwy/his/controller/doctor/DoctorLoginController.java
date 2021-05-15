package com.lwy.his.controller.doctor;



import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.lwy.his.entity.doctor.DoctorLoginrecode;
import com.lwy.his.sentinelHandle.SentinelHandle;
import com.lwy.his.service.DoctorLoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @SentinelResource(value = "customerBlockHandler",
            blockHandlerClass = SentinelHandle.class,        //流控异常处理类
            blockHandler = "handlerExceptionLogin")
    public String doctorlogin(String username,String password){

        String doctorlogin = service.doctorlogin(username, password);
       return doctorlogin;


    }
}
