package com.lwy.his.service.impl;


import com.lwy.his.dao.DoctorHomeMapper;
import com.lwy.his.entity.assets.*;
import com.lwy.his.entity.doctor.DocotrInspectionrecord;
import com.lwy.his.entity.doctor.DoctorDrugrecord;
import com.lwy.his.entity.doctor.DoctorNodrugrecord;
import com.lwy.his.entity.doctor.DoctorTestrecode;
import com.lwy.his.feign.DoctorHomeFeignDrug;
import com.lwy.his.feign.DoctorHomeFeignPay;
import com.lwy.his.feign.DoctorHomeFeignTest;
import com.lwy.his.mq.PayProduceMQ;
import com.lwy.his.service.DoctorHomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;



@Service
public class DoctorHomeServiceimpl implements DoctorHomeService {

    @Autowired
    private DoctorHomeFeignTest testfeign;

        @Override
        public CopyOnWriteArrayList<Inspection_items> selectallInspection() {
            return testfeign.selectallInspection();
        }

        @Override
        public CopyOnWriteArrayList<Test_items> selectalltest() {
            return testfeign.selectalltest();
        }

        @Override
        public void insertInspection(Inspection inspection) {
            testfeign.insertInspection(inspection);
        }

        @Override
        public void insertTest(Test test) {
            testfeign.insertTest(test);
        }

        @Override
        public int countInspection() {
            return testfeign.countInspection();
        }

        @Override
        public int countTest() {
            return testfeign.countTest();
        }

        @Override
        public int countDoctorTestrecord() {
            return testfeign.countDoctorTestrecord();
        }

        @Override
        public void insertDoctorTestrecord(DoctorTestrecode doctorTestrecode) {
            testfeign.insertDoctorTestrecord(doctorTestrecode);
        }

        @Override
        public int countDoctorInspectionrecord() {
            return testfeign.countDoctorInspectionrecord();
        }

        @Override
        public void insertDoctorInspectionrecord(DocotrInspectionrecord docotrInspectionrecord) {
            testfeign.insertDoctorInspectionrecord(docotrInspectionrecord);
        }

        @Override
        public void updateTestalive(ConcurrentMap map) {
            testfeign.updateTestalive(map);
        }

        @Override
        public void updateInspectionalive(ConcurrentMap map) {
            testfeign.updateInspectionalive(map);
        }



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
    private PayProduceMQ mq;

        /**
         * 通过activemq 传递信息
         * @param pay
         */
        @Override
        public void insertPay(Pay pay) {
            //activemq queue
            mq.produceMsgPay(pay);
            //payfeign.insertPay(pay);
        }

    @Autowired
    private DoctorHomeFeignPay payfeign;

        /**
         * 废弃  和insertPay 重复
         * @param pay
         */
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
        public int selectpayid(){ return payfeign.selectpayid();}

        @Override
        public void deletepaybyhandle(String hid) {
             payfeign.deletepaybyhandle(hid);
        }





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
        public int selectMRid(int prrid) {
            return mapper.selectMRid(prrid);
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

        @Override
        public void deleteHandle(String hid) {
            mapper.deleteHandle(hid);
        }




}
