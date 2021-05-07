package com.lwy.his.service.impl;


import com.lwy.his.dao.PatientForgetPasswordMapper;
import com.lwy.his.entity.patient.PatientUser;
import com.lwy.his.service.PatientForgetPasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.ConcurrentMap;

@Service
public class PatientForgetPasswordServiceimpl implements PatientForgetPasswordService {

    @Autowired
    private PatientForgetPasswordMapper mapper;


    @Override
    public PatientUser selectforgetpasswordinf(ConcurrentMap map) {
        return mapper.selectforgetpasswordinf(map);
    }
}
