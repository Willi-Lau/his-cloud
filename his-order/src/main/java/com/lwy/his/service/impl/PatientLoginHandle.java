package com.lwy.his.service.impl;

import com.lwy.his.entity.patient.PatientUser;
import com.lwy.his.service.PatientLoginService;
import org.springframework.stereotype.Component;

@Component
public class PatientLoginHandle implements PatientLoginService {
    @Override
    public void changepassword(String username, String password) {

    }

    @Override
    public String selectforgetpasswordinf(String username, String key, String value) {
        return "no";
    }

    @Override
    public String registerpatient(PatientUser user) {
        return null;
    }
}
