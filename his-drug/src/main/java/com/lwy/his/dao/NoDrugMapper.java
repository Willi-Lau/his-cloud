package com.lwy.his.dao;


import com.lwy.his.entity.assets.Handle;
import com.lwy.his.entity.assets.NoDrug;
import com.lwy.his.entity.doctor.DoctorNodrugrecord;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.concurrent.CopyOnWriteArrayList;

@Repository
public interface NoDrugMapper {
    /**
     * 查找所有的非药品信息
     */
    @Select("select * from nodrug")
    CopyOnWriteArrayList<NoDrug> selectallNoDrug();

    /**
     * 统计非药品流水表的条数
     */
    @Select("select count(*) from doctornodrugrecord")
    int countDoctorNoDrugRecord();

    /**
     * 提交到非药品医生记录表
     */
    @Insert("insert into doctornodrugrecord(dndrid,dndrmrid,dndrndid) values(#{dndrid},#{dndrmrid},#{dndrndid})")
    void insertDoctorNoDrugRedord(DoctorNodrugrecord doctorNodrugrecord);
    /**
     * 根据mrid返回患者所有非药品相关处理
     */
    @Select("select * from handle where hmrid = #{mrid}")
    CopyOnWriteArrayList<Handle>selectallHandle(int mrid);

    /**
     * 根据id 在非药品清单查找名字
     */
    @Select("select nname from nodrug where nid = #{id}")
    String selectNameByidFromNoDrug(String id);
}
