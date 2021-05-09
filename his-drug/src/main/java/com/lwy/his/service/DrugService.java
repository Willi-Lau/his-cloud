package com.lwy.his.service;

import com.lwy.his.entity.assets.Drug;
import com.lwy.his.entity.doctor.DoctorDrugrecord;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

public interface DrugService {
    /**
     * 查找所有的药品信息*
     */
    CopyOnWriteArrayList<Drug> selectallDrug();
    /**
     * 根据药品id修改库存
     */
    void updateDrugNum(ConcurrentMap map);
    /**
     * 统计药品医生记录表数量
     */
    int countDoctorDrugrecord();
    /**
     * 添加到开药流水里 DoctorDrugrecord
     */
    void insertDoctorDrugrecord(DoctorDrugrecord doctorDrugrecord);
    /**
     * 根据id 在药品清单查找名字
     */
    String selectNameByidFromDrug(String id);
}
