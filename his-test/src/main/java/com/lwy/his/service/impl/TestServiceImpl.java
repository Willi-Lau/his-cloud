package com.lwy.his.service.impl;

import com.lwy.his.dao.TestMapper;
import com.lwy.his.entity.assets.Inspection;
import com.lwy.his.entity.assets.Inspection_items;
import com.lwy.his.entity.assets.Test;
import com.lwy.his.entity.assets.Test_items;
import com.lwy.his.entity.doctor.DocotrInspectionrecord;
import com.lwy.his.entity.doctor.DoctorTestrecode;
import com.lwy.his.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestMapper mapper;

    @Override
    public CopyOnWriteArrayList<Inspection_items> selectallInspection() {
        return mapper.selectallInspection();
    }

    @Override
    public CopyOnWriteArrayList<Test_items> selectalltest() {
        return mapper.selectalltest();
    }

    @Override
    public void insertInspection(Inspection inspection) {
        mapper.insertInspection(inspection);
    }

    @Override
    public void insertTest(Test test) {
        mapper.insertTest(test);
    }

    @Override
    public int countInspection() {
        return mapper.countInspection();
    }


    @Override
    public int countTest() {
        return mapper.countTest();
    }

    @Override
    public int countDoctorTestrecord() {
        return mapper.countDoctorTestrecord();
    }

    @Override
    public void insertDoctorTestrecord(DoctorTestrecode doctorTestrecode) {
        mapper.insertDoctorTestrecord(doctorTestrecode);
    }

    @Override
    public int countDoctorInspectionrecord() {
        return  mapper.countDoctorInspectionrecord();
    }

    @Override
    public void insertDoctorInspectionrecord(DocotrInspectionrecord docotrInspectionrecord) {
          mapper.insertDoctorInspectionrecord(docotrInspectionrecord);
    }

    @Override
    public void updateTestalive(ConcurrentMap map) {
        mapper.updateTestalive(map);
    }

    @Override
    public void updateInspectionalive(ConcurrentMap map) {
        mapper.updateInspectionalive(map);
    }
}
