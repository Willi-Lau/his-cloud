package com.lwy.his.service.impl;


import com.lwy.his.dao.DrugMapper;
import com.lwy.his.entity.assets.Drug;
import com.lwy.his.entity.doctor.DoctorDrugrecord;
import com.lwy.his.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

@Service
public class DrugServiceImpl implements DrugService {

    @Autowired
    private DrugMapper mapper;


    @Override
    public CopyOnWriteArrayList<Drug> selectallDrug() {
        return mapper.selectallDrug();
    }

    @Override
    public void updateDrugNum(ConcurrentMap map) {
        mapper.updateDrugNum(map);
    }

    @Override
    public int countDoctorDrugrecord() {
        return mapper.countDoctorDrugrecord();
    }

    @Override
    public void insertDoctorDrugrecord(DoctorDrugrecord doctorDrugrecord) {
        mapper.insertDoctorDrugrecord(doctorDrugrecord);
    }

    @Override
    public String selectNameByidFromDrug(String id) {
        return mapper.selectNameByidFromDrug(id);
    }

}
