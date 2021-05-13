package com.lwy.his.dao;


import com.lwy.his.entity.assets.*;
import com.lwy.his.entity.doctor.DocotrInspectionrecord;
import com.lwy.his.entity.doctor.DoctorDrugrecord;
import com.lwy.his.entity.doctor.DoctorNodrugrecord;
import com.lwy.his.entity.doctor.DoctorTestrecode;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

@Repository
public interface DoctorHomeMapper {

    /**
     * 根据医生姓名 日期 读取就诊还是没就诊
     *  map.put("today",today);   日期
     *         map.put("tomorrow",tomorrow);   下一天
     *         map.put("patientusername",patientusername);   患者名字(账号)
     *       map.put("doctorusername",doctorusername);   医生名字(账号)
     */
    CopyOnWriteArrayList<Patient_Registration_record> selectallPRrecode(ConcurrentMap map);
    /**
     * 根据患者挂号记录的id 查找挂号记录，和病历表
     */
    Patient_Registration_record selectPRRandMRbyid(int id);
    /**
     * 根据挂号id设置已经看诊
     */
    @Update("update patient_registration_record set prralready = 1 where prrid = #{prrid}")
    void updatePrralready(int prrid);
    /**
     * 根据挂号id修改病历里相关信息，主诉等信息
     */
    void updatePRRinf(ConcurrentMap map);
    /**
     * 查找所有疾病信息
     */
    @Select("select * from diagnosis")
     CopyOnWriteArrayList<Diagnosis> selectallDiagnosis();
    /**
     * 根据病历id查找 检查，检验，缴费得信息
     */
    CopyOnWriteArrayList<Medical_record> selectallTestAndInsprction(int mrid);
    /**
     * 获取Handle表得个数
     */
    @Select("select count(*) from handle")
    int countHandle();
    /**
     * 提交到Handle表
     */
    @Insert("insert into Handle(hid,hmrid,hdo,hnum,htime,halive,hgivemoney,hused,hwater)" +
            "values(#{hid},#{hmrid},#{hdo},#{hnum},#{htime},#{halive},#{hgivemoney},#{hused},#{hwater})")
    void insertHandle(Handle handle);

    /**
     * 根据mr 病历表查找医生Id
     */
    @Select("select mrdid from medical_record where mrid = #{mrid}")
    int selectDridByMR(int mrid);

    /**
     * 向 Handle Drug Pay 表插入对应记录
     */
    @Insert("insert into DrugOrHandleWithPayRecord(pid,dhid) values(#{pid},#{dhid})")
    void insertDrugOrHandleWithPayRecord(DrugOrHandleWithPayRecord drugOrHandleWithPayRecord);

    /**
     * 退回药品 设置 handle 表 alive 为 1
     */
    @Update("update handle set halive = 1 where hid = #{hid}")
    void deleteHandle(String hid);

    /**
     * 根据挂号id查找病历id
     */
    @Select("select  mr.mrid  from Patient_Registration_record prr,Medical_record mr " +
            "where prr.prrmrid = mr.mrid and prr.prrid = #{prrid}")
    int selectMRid(int prrid);












}
