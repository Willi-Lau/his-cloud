package com.lwy.his.service;


import com.lwy.his.entity.patient.PatientUser;
import com.lwy.his.service.impl.PatientLoginHandle;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(value = "his-provider-patient-login",fallback = PatientLoginHandle.class)
public interface PatientLoginService {

    @PostMapping("/PatientChangePasswordController/changepassword")
    void changepassword(@RequestParam("username") String username,@RequestParam("password") String password);

    @PostMapping("PatientForgetPasswordController/selectforgetpasswordinf")
    String  selectforgetpasswordinf(@RequestParam("username") String username,
                                    @RequestParam("key") String key,
                                    @RequestParam("value") String value);
    @PostMapping("PatientRegisterController/registerpatient")
    String registerpatient(@RequestBody PatientUser user);
}
