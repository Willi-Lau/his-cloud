package com.lwy.his.service.impl;


import com.lwy.his.dao.DoctorLoginMapper;
import com.lwy.his.entity.doctor.DoctorLoginrecode;
import com.lwy.his.service.DoctorLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.ConcurrentMap;



@Service
public class DoctorLoginServiceimpl implements DoctorLoginService {
    @Autowired
    private DoctorLoginMapper mapper;

    @Override
    @Cacheable(cacheNames = {"doctorlogin"},key = "#map")
    public String doctorlogin(ConcurrentMap map) {
        return mapper.doctorlogin(map);
    }

    @Override
    @Cacheable(cacheNames = {"doctorloginselectid"},key = "#username")
    public int selectid(String username) {
        return mapper.selectid(username);
    }

    @Override
    public void addrecord(DoctorLoginrecode doctor) {
        mapper.addrecord(doctor);
    }
}
