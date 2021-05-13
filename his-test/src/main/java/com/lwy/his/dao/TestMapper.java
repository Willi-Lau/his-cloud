package com.lwy.his.dao;

import com.lwy.his.entity.assets.Inspection;
import com.lwy.his.entity.assets.Inspection_items;
import com.lwy.his.entity.assets.Test;
import com.lwy.his.entity.assets.Test_items;
import com.lwy.his.entity.doctor.DocotrInspectionrecord;
import com.lwy.his.entity.doctor.DoctorTestrecode;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

@Repository
public interface TestMapper {
    /**
     * 返回所有检查项目
     */
    @Select("select * from Inspection_items")
    CopyOnWriteArrayList<Inspection_items> selectallInspection();


    /**
     * 返回所有检验项目
     */
    @Select("select * from Test_items")
    CopyOnWriteArrayList<Test_items> selectalltest();

    /**
     * 把提交得检验项目提交到检验表中   传入 挂号历史积极  t
     */
    @Insert("insert into Inspection(inid,inmrid,indo,inend,innum,intime,inalive,ingivemoney,inused,inwater)" +
            "values(#{inid},#{inmrid},#{indo},#{inend},#{innum},#{intime},#{inalive},#{ingivemoney},#{inused},#{inwater})")
    void insertInspection(Inspection inspection);

    /**
     * 把提交得检查项目提交到检验表中
     */
    @Insert("insert into Test(tid,tmrid,tdo,tend,tnum,ttime,talive,tused,tgivemoney,twater)" +
            "values(#{tid},#{tmrid},#{tdo},#{tend},#{tnum},#{ttime},#{talive},#{tused},#{tgivemoney},#{twater})")
    void insertTest(Test test);

    /**
     * 查找检验表有多少条数据
     */
    @Select("select count(*) from Inspection")
    int countInspection();


    /**
     * 查找检查表有多少条数据
     */
    @Select("select count(*) from Test")
    int countTest();
    /**
     * 统计检验医生记录表条数 需要自定义
     */
    @Select("select count(*) from DoctorTestrecord")
    int countDoctorTestrecord();
    /**
     * 插入数据到检验医生记录表
     */
    @Insert("insert into DoctorTestrecord(dtrid,dtrmrid,dtrtid) values" +
            "(#{dtrid},#{dtrmrid},#{dtrtid})")
    void insertDoctorTestrecord(DoctorTestrecode doctorTestrecode);
    /**
     * 统计检查医生记录表得条数
     */
    @Select("select count(*) from DoctorInspectionrecord")
    int countDoctorInspectionrecord();
    /**
     * 插入检查医生记录表中
     */
    @Insert("insert into DoctorInspectionrecord(dirid,dirmrid,diriid) values(#{dirid},#{dirmrid},#{diriid})")
    void insertDoctorInspectionrecord(DocotrInspectionrecord docotrInspectionrecord);

    /**
     * 将检验表相关信息设置为停用
     */
    @Update("update test set talive = 1 where tmrid = #{mrid} and tid = #{id} limit 1")
    void updateTestalive(ConcurrentMap map);
    /**
     * 将检查表相关信息设置为停用
     */
    @Update("update inspection set inalive = 1 where inmrid = #{mrid} and inid = #{id}  limit 1")
    void updateInspectionalive(ConcurrentMap map);

}
