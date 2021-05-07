package com.lwy.his.dao;




import com.lwy.his.entity.doctor.DoctorUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.concurrent.ConcurrentMap;


@Repository
public interface DoctorForgetPasswordMapper {
    /**
     * 根据是手机号还是身份证号，验证信息是否正确
     */

    DoctorUser selectforgetpasswordinf(ConcurrentMap map);
}
