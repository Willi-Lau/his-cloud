package com.lwy.his.dao;


import com.lwy.his.entity.doctor.DoctorLoginrecode;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.concurrent.ConcurrentMap;

@Repository
public interface DoctorLoginMapper {
    /**
     * 根据用户密码验证登陆返回是医生还是管理员
     */
      @Select("select dutype from doctoruser where duusername =#{username} and dupassword = #{password}")
    String doctorlogin(ConcurrentMap map);
    /**
     * 根据username 查找Id
   */
    @Select("select duid from doctoruser where duusername = #{username}")
    int selectid(String username);
    /**
     * 写入日志记录 记录登陆
     */
    @Insert("insert into doctorloginrecord(dlrdid,dlrtime) values(#{dlrdid},#{dlrtime})")
    void addrecord(DoctorLoginrecode doctor);
}
