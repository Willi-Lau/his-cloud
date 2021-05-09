package com.lwy.his.service;

import com.lwy.his.entity.assets.Handle;
import com.lwy.his.entity.assets.NoDrug;
import com.lwy.his.entity.doctor.DoctorNodrugrecord;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.concurrent.CopyOnWriteArrayList;

public interface NoDrugService {
    /**
     * 查找所有的非药品信息
     */
    CopyOnWriteArrayList<NoDrug> selectallNoDrug();
    /**
     * 统计非药品流水表的条数
     */
    int countDoctorNoDrugRecord();

    /**
     * 提交到非药品医生记录表
     */
    void insertDoctorNoDrugRedord(DoctorNodrugrecord doctorNodrugrecord);
    /**
     * 根据mrid返回患者所有非药品相关处理
     */
    CopyOnWriteArrayList<Handle>selectallHandle(int mrid);

    /**
     * 根据id 在非药品清单查找名字
     */
    String selectNameByidFromNoDrug(String id);
}
