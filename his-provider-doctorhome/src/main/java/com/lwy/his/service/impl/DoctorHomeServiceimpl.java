package com.lwy.his.service.impl;


import com.lwy.his.dao.DoctorHomeMapper;
import com.lwy.his.entity.assets.*;
import com.lwy.his.entity.doctor.DocotrInspectionrecord;
import com.lwy.his.entity.doctor.DoctorDrugrecord;
import com.lwy.his.entity.doctor.DoctorNodrugrecord;
import com.lwy.his.entity.doctor.DoctorTestrecode;
import com.lwy.his.service.DoctorHomeFeignDrug;
import com.lwy.his.service.DoctorHomeFeignPay;
import com.lwy.his.service.DoctorHomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;



@Service
public class DoctorHomeServiceimpl implements DoctorHomeService {

    @Autowired
    private DoctorHomeFeignDrug drugfeign;

        @Override
        public CopyOnWriteArrayList<Drug> selectallDrug() {
            return drugfeign.selectallDrug();
        }

        @Override
        public void updateDrugNum(ConcurrentMap map) {
            drugfeign.updateDrugNum(map);
        }

        @Override
        public int countDoctorDrugrecord() {
            return drugfeign.countDoctorDrugrecord();
        }

        @Override
        public void insertDoctorDrugrecord(DoctorDrugrecord doctorDrugrecord) {
            drugfeign.insertDoctorDrugrecord(doctorDrugrecord);
        }

        @Override
        public CopyOnWriteArrayList<NoDrug> selectallNoDrug() {
            return drugfeign.selectallNoDrug();
        }

        @Override
        public int countDoctorNoDrugRecord() {
            return drugfeign.countDoctorNoDrugRecord();
        }

        @Override
        public void insertDoctorNoDrugRedord(DoctorNodrugrecord doctorNodrugrecord) {
            drugfeign.insertDoctorNoDrugRedord(doctorNodrugrecord);
        }

        @Override
        public CopyOnWriteArrayList<Handle> selectallHandle(int mrid) {
            return drugfeign.selectallHandle(mrid);
        }

        @Override
        public String selectNameByidFromDrug(String id) {
            return drugfeign.selectNameByidFromDrug(id);
        }

        @Override
        public String selectNameByidFromNoDrug(String id) {
            return drugfeign.selectNameByidFromNoDrug(id);
        }



    @Autowired
    private DoctorHomeFeignPay payfeign;

        @Override
        public void insertPay(Pay pay) {
            payfeign.insertPay(pay);
        }

        @Override
        public void insertPayfromdrug(Pay pay) {
            payfeign.insertPayfromdrug(pay);
        }

        @Override
        public int countPay() {
            return payfeign.countPay();
        }

        @Override
        public void updatepayalive(ConcurrentMap map) {
            payfeign.updatepayalive(map);
        }

        @Override
        public int selectpayid(){ return payfeign.selectpayid();};



    @Autowired
    private DoctorHomeMapper mapper;

        @Override
        public CopyOnWriteArrayList<Patient_Registration_record> selectallPRrecode(ConcurrentMap map) {
            return mapper.selectallPRrecode(map);
        }


        @Override
        public Patient_Registration_record selectPRRandMRbyid(int id) {
            return mapper.selectPRRandMRbyid(id);
        }

        @Override
        public void updatePrralready(int prrid) {
            mapper.updatePrralready(prrid);
        }

        @Override
        public void updatePRRinf(ConcurrentMap map) {
            mapper.updatePRRinf(map);
        }

        @Override
        public CopyOnWriteArrayList<Diagnosis> selectallDiagnosis() {
            return mapper.selectallDiagnosis();
        }

        @Override
        public CopyOnWriteArrayList<Inspection_items> selectallInspection() {
            return mapper.selectallInspection();
        }

        @Override
        public CopyOnWriteArrayList<Test_items> selectalltest() {
            return mapper.selectalltest();
        }

        @Override
        public int selectMRid(int prrid) {
            return mapper.selectMRid(prrid);
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
        public void insertInspection(Inspection inspection) {
            mapper.insertInspection(inspection);
        }

        @Override
        public void insertTest(Test test) {
            mapper.insertTest(test);
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
            return mapper.countDoctorInspectionrecord();
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


        @Override
        public int countHandle() {
            return mapper.countHandle();
        }

        @Override
        public void insertHandle(Handle handle) {
            mapper.insertHandle(handle);
        }

        @Override
        public int selectDridByMR(int mrid) {
            return mapper.selectDridByMR(mrid);
        }

        @Override
        public void insertDrugOrHandleWithPayRecord(DrugOrHandleWithPayRecord drugOrHandleWithPayRecord) {
            mapper.insertDrugOrHandleWithPayRecord(drugOrHandleWithPayRecord);
        }

        @Override
        public CopyOnWriteArrayList<Medical_record> selectallTestAndInsprction(int mrid) {
            return mapper.selectallTestAndInsprction(mrid);
        }


}
