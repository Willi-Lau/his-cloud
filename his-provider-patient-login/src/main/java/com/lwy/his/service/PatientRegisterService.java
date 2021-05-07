package com.lwy.his.service;


import com.lwy.his.entity.patient.PatientUser;

public interface PatientRegisterService {

    String selectpuusername(String puusername);
    /**
     * 查找身份证是否被是注册
     */
    String selectpucard(String pucard);
    /**
     * 查找手机是否被注册
     */
    String selectpuphone(String puphone);
    /**
     * 添加用户
     */
    void addpatientuser(PatientUser user);
}
