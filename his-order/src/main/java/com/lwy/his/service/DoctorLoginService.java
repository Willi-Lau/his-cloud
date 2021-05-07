package com.lwy.his.service;



import com.lwy.his.entity.doctor.DoctorLoginrecode;
import com.lwy.his.entity.doctor.DoctorUser;
import com.lwy.his.service.impl.DoctorLoginHandle;
import feign.Headers;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

@FeignClient(value = "his-provider-doctor-login",fallback = DoctorLoginHandle.class)
@Component
public interface DoctorLoginService {
    /**
     * 根据用户密码验证登陆返回是医生还是管理员
     */
    @PostMapping("/DoctorLoginController/doctorlogin")
    String doctorlogin(@RequestParam("username") String username,@RequestParam("password") String password);
    /**
     * 查找所有科室
     */
    @PostMapping("/DoctorRegisterController/selectalldepartment")
    CopyOnWriteArrayList<String> selectalldepartment();
    /**
     * 存入医生用户信息
     */
    @PostMapping("/DoctorRegisterController/registerdoctor")
    String registerdoctor(@RequestBody DoctorUser doctorUser);
    /**
     * 找回密码，首先判断验证信息是否正确
     */
    //@Headers({"Content-Type: application/json","Accept: application/json"})
    @PostMapping(value = "/DoctorForgetPasswordController/selectforgetpasswordinf")
    String  selectforgetpasswordinf(@RequestBody ConcurrentMap<String,String> map);

    /**
     * 改密码
     * @param username
     * @param password
     */
    @PostMapping("/DoctorChangePasswordController/changepassword")
    String changepassword(@RequestParam("username") String username,@RequestParam("password") String password);

//    @RequestMapping(value = "/DoctorRegisterController/tst1",method = RequestMethod.POST)
//    DoctorUser tst1(@RequestParam("username")String username,@RequestParam("password")String password);
}
