package com.lwy.his.service.impl;


import com.lwy.his.dao.DoctorChangePasswordMapper;
import com.lwy.his.service.DoctorChangePasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.ConcurrentMap;


@Service
public class DoctorChangePasswordServiceimpl implements DoctorChangePasswordService {

    @Autowired
    private DoctorChangePasswordMapper mapper;

    @Override
    public void changepassword(ConcurrentMap map) {
        mapper.changepassword(map);
    }
}
