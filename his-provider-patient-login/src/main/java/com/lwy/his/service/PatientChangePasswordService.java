package com.lwy.his.service;

import java.util.concurrent.ConcurrentMap;

public interface PatientChangePasswordService {

    /**
     * 根据用户名 修改密码
     */
    void changepassword(ConcurrentMap map);
}
