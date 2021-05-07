package com.lwy.his.service;



import com.lwy.his.entity.patient.PatientUser;

import java.util.concurrent.ConcurrentMap;

public interface PatientForgetPasswordService {
    /**
     * 找回密码，首先判断验证信息是否正确
     */
    PatientUser selectforgetpasswordinf(ConcurrentMap map);
}
