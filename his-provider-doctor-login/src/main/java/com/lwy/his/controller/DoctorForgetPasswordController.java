package com.lwy.his.controller;



import cn.hutool.json.JSON;

import com.lwy.his.entity.doctor.DoctorUser;
import com.lwy.his.service.DoctorForgetPasswordService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;


@RestController
@RequestMapping("/DoctorForgetPasswordController")
@Api("医生找回密码界面")
@Slf4j
public class DoctorForgetPasswordController {

    @Autowired
    private DoctorForgetPasswordService service;

     @ApiOperation("验证修改密码时提交的电话号或身份证是否正确")
     @PostMapping("/selectforgetpasswordinf")
    public String  selectforgetpasswordinf(@RequestBody ConcurrentMap<String,String> map){

         DoctorUser duid = null;
         try {
             duid = service.selectforgetpasswordinf(map);

         } catch (Exception e) {
             e.printStackTrace();
         } finally {
             log.info(duid.toString());
             //查询到结果
             if(duid != null){
                 return "success";
             }
             else {
                 return "no";
             }
         }
    }


}
