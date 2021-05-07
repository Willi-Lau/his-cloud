package com.lwy.his.service.impl;


import com.lwy.his.dao.DoctorForgetPasswordMapper;

import com.lwy.his.entity.doctor.DoctorUser;
import com.lwy.his.service.DoctorForgetPasswordService;
import org.fusesource.hawtbuf.BufferInputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.util.concurrent.ConcurrentMap;


@Service
public class DoctorForgetPasswordServiceimpl implements DoctorForgetPasswordService {

    @Autowired
    private DoctorForgetPasswordMapper mapper;

    @Override
    public DoctorUser selectforgetpasswordinf(ConcurrentMap map) {

        PipedInputStream a = null;
        //System.out.println(list.toString());
        return mapper.selectforgetpasswordinf(map);

    }
}
