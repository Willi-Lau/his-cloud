package com.lwy.his.dao;

import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.concurrent.ConcurrentMap;

@Repository
public interface PatientChangePasswordMapper {
    /**
     * 根据用户名修改密码
     */
    @Update("update patientuser set pupassword = #{password} where puusername = #{username}")
    void changepassword(ConcurrentMap map);
}
