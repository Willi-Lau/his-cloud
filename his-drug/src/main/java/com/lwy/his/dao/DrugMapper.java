package com.lwy.his.dao;


import com.lwy.his.entity.assets.Drug;
import com.lwy.his.entity.doctor.DoctorDrugrecord;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

@Repository
public interface DrugMapper {

    /**
     * 查找所有的药品信息*
     */
    @Select("select * from drug")
    CopyOnWriteArrayList<Drug> selectallDrug();
    /**
     * 根据药品id修改库存
     */
    @Update("update drug set drnum = drnum - #{num} where drid = #{drid}")
    void updateDrugNum(ConcurrentMap map);
    /**
     * 统计药品医生记录表数量
     */
    @Select("select count(*) from DoctorDrugrecord")
    int countDoctorDrugrecord();
    /**
     * 添加到开药流水里 DoctorDrugrecord
     */
    @Insert("insert into DoctorDrugrecord(ddrid,ddrmrid,ddrdid) values(#{ddrid},#{ddrmrid},#{ddrdid})")
    void insertDoctorDrugrecord(DoctorDrugrecord doctorDrugrecord);

    /**
     * 根据id 在药品清单查找名字
     */
    @Select("select drname from drug where drid = #{id}")
    String selectNameByidFromDrug(String id);
}
