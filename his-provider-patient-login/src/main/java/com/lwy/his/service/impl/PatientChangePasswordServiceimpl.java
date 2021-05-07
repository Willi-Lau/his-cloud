package com.lwy.his.service.impl;


import com.lwy.his.dao.PatientChangePasswordMapper;
import com.lwy.his.service.PatientChangePasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.ConcurrentMap;

@Service
public class PatientChangePasswordServiceimpl implements PatientChangePasswordService {
    @Autowired
    private PatientChangePasswordMapper mapper;
    @Override
    public void changepassword(ConcurrentMap map) {
        mapper.changepassword(map);
    }
}
