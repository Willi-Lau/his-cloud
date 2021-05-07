package com.lwy.his.service.impl;

import com.lwy.his.entity.doctor.DoctorUser;
import com.lwy.his.service.DoctorLoginService;
import org.springframework.stereotype.Component;

import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;


@Component
public class DoctorLoginHandle implements DoctorLoginService {
    @Override
    public String doctorlogin(String username, String password) {
        return null;
    }

    @Override
    public CopyOnWriteArrayList<String> selectalldepartment() {
        return null;
    }

    @Override
    public String registerdoctor(DoctorUser doctorUser) {
        return null;
    }

    @Override
    public String selectforgetpasswordinf(ConcurrentMap<String, String> map) {
        return "no";
    }

    @Override
    public String changepassword(String username, String password) {
        return null;
    }
}
