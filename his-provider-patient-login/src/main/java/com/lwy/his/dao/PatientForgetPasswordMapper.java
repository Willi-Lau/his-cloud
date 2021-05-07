package com.lwy.his.dao;


import com.lwy.his.entity.patient.PatientUser;
import org.springframework.stereotype.Repository;

import java.util.concurrent.ConcurrentMap;

@Repository
public interface PatientForgetPasswordMapper {

    /**
     * 根据是手机号还是身份证号，验证信息是否正确
     */

    PatientUser selectforgetpasswordinf(ConcurrentMap map);
}
