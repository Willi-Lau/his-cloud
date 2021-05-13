package com.lwy.his.service;

import com.lwy.his.entity.assets.Inspection;
import com.lwy.his.entity.assets.Inspection_items;
import com.lwy.his.entity.assets.Test;
import com.lwy.his.entity.assets.Test_items;
import com.lwy.his.entity.doctor.DocotrInspectionrecord;
import com.lwy.his.entity.doctor.DoctorTestrecode;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;


public interface TestService {

    /**
     * 返回所有检查项目
     */
    CopyOnWriteArrayList<Inspection_items> selectallInspection();
    /**
     * 返回所有检验项目
     */
    CopyOnWriteArrayList<Test_items> selectalltest();
    /**
     * 把提交得检验项目提交到检验表中   传入 挂号历史积极  t
     */
     void insertInspection(Inspection inspection);
    /**
     * 把提交得检查项目提交到检验表中
     */
    void insertTest(Test test);
    /**
     * 查找检验表有多少条数据
     */
    int countInspection();

    /**
     * 查找检查表有多少条数据
     */
    int countTest();
    /**
     * 统计检验医生记录表条数 需要自定义
     */
    int countDoctorTestrecord();
    /**
     * 插入数据到检验医生记录表
     */
    void insertDoctorTestrecord(DoctorTestrecode doctorTestrecode);
    /**
     * 统计检查医生记录表得条数
     */
    int countDoctorInspectionrecord();
    /**
     * 插入检查医生记录表中
     */
    void insertDoctorInspectionrecord(DocotrInspectionrecord docotrInspectionrecord);

    /**
     * 将检验表相关信息设置为停用
     */
    void updateTestalive(ConcurrentMap map);
    /**
     * 将检查表相关信息设置为停用
     */
    void updateInspectionalive(ConcurrentMap map);
}
