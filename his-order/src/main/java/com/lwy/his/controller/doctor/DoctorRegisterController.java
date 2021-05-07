package com.lwy.his.controller.doctor;


import com.lwy.his.entity.doctor.DoctorUser;
import com.lwy.his.service.DoctorLoginService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.CopyOnWriteArrayList;


@RestController
@RequestMapping("/DoctorRegisterController")
@Api("医生注册界面")
public class DoctorRegisterController {

    @Autowired
    private DoctorLoginService service;

   @ApiOperation("查找返回所有的科室名字")
   @RequestMapping("/selectalldepartment")
   public CopyOnWriteArrayList<String> selectalldepartment(){
       return service.selectalldepartment();
   }


    @ApiOperation("注册医生")
    @RequestMapping(value = "/registerdoctor",method = RequestMethod.POST)
   public String registerdoctor(@RequestBody DoctorUser doctorUser){
        return service.registerdoctor(doctorUser);
   }


//    @ApiOperation("注册医生")
//    @RequestMapping(value = "/tst1",method = RequestMethod.POST)
//    public DoctorUser tst1(String username,String password){
//        return service.tst1(username,password);
//    }


}
