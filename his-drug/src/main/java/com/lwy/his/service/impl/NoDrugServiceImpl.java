package com.lwy.his.service.impl;

import com.lwy.his.dao.NoDrugMapper;
import com.lwy.his.entity.assets.Handle;
import com.lwy.his.entity.assets.NoDrug;
import com.lwy.his.entity.doctor.DoctorNodrugrecord;
import com.lwy.his.service.NoDrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.CopyOnWriteArrayList;

@Service
public class NoDrugServiceImpl implements NoDrugService {

    @Autowired
    private NoDrugMapper mapper;

    @Override
    public CopyOnWriteArrayList<NoDrug> selectallNoDrug() {
        return mapper.selectallNoDrug();
    }

    @Override
    public int countDoctorNoDrugRecord() {
        return mapper.countDoctorNoDrugRecord();
    }

    @Override
    public void insertDoctorNoDrugRedord(DoctorNodrugrecord doctorNodrugrecord) {
        mapper.insertDoctorNoDrugRedord(doctorNodrugrecord);
    }

    @Override
    public CopyOnWriteArrayList<Handle> selectallHandle(int mrid) {
        return mapper.selectallHandle(mrid);
    }

    @Override
    public String selectNameByidFromNoDrug(String id) {
        return mapper.selectNameByidFromNoDrug(id);
    }
}
