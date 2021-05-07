package com.lwy.his.service;





import com.lwy.his.entity.doctor.DoctorUser;

import java.util.concurrent.ConcurrentMap;

public interface DoctorForgetPasswordService {

    /**
     * 找回密码，首先判断验证信息是否正确
     */
    DoctorUser selectforgetpasswordinf(ConcurrentMap map);
}
