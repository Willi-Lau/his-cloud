package com.lwy.his.service.impl;


import com.lwy.his.dao.DoctorRegisterMapper;
import com.lwy.his.entity.doctor.DoctorUser;
import com.lwy.his.service.DoctorRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

@Service
public class DoctorRegisterServiceimpl implements DoctorRegisterService {

    @Autowired
    private DoctorRegisterMapper mapper;

    @Override
    public CopyOnWriteArrayList<String> selectalldepartment() {
        return mapper.selectalldepartmentname();

    }

    @Override
    public void registerdoctor(DoctorUser doctorUser) {
        mapper.registerdoctor(doctorUser);
    }

    @Override
    public String selectusername(String duusername) {
        return mapper.selectusername(duusername);
    }

    @Override
    public String selectcard(String ducard) {
        return mapper.selectcard(ducard);
    }

    @Override
    public String selectphone(String duphone) {
        return mapper.selectphone(duphone);
    }

//    @Override
//    public DoctorUser tst1(ConcurrentMap map) {
//        return mapper.tst1(map);
//    }


}
