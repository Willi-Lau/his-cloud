package com.lwy.his.service.impl;


import com.lwy.his.dao.PatientRegisterMapper;
import com.lwy.his.entity.patient.PatientUser;
import com.lwy.his.service.PatientRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
public class PatientRegisterServiceimpl implements PatientRegisterService {
    @Autowired
    private PatientRegisterMapper mapper;

    @Override
    public String selectpuusername(String puusername) {
        return mapper.selectpuusername(puusername);
    }

    @Override
    public String selectpucard(String pucard) {
        return mapper.selectpucard(pucard);
    }

    @Override
    public String selectpuphone(String puphone) {
        return mapper.selectpuphone(puphone);
    }

    @Override
    public void addpatientuser(PatientUser user) {
            mapper.addpatientuser(user);
    }
}
