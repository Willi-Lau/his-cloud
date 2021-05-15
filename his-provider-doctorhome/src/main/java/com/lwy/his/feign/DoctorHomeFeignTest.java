package com.lwy.his.feign;

import com.lwy.his.entity.assets.Inspection;
import com.lwy.his.entity.assets.Inspection_items;
import com.lwy.his.entity.assets.Test;
import com.lwy.his.entity.assets.Test_items;
import com.lwy.his.entity.doctor.DocotrInspectionrecord;
import com.lwy.his.entity.doctor.DoctorTestrecode;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

@FeignClient(value = "his-test")
@Component
public interface DoctorHomeFeignTest {

    @PostMapping("TestController/selectallInspection")
    CopyOnWriteArrayList<Inspection_items> selectallInspection();

    @PostMapping("TestController/selectalltest")
    CopyOnWriteArrayList<Test_items> selectalltest();

    @PostMapping("TestController/insertInspection")
    void insertInspection(@RequestBody Inspection inspection);

    @PostMapping("TestController/insertTest")
    void insertTest(@RequestBody Test test);

    @PostMapping("TestController/countInspection")
    int countInspection();

    @PostMapping("TestController/countTest")
     int countTest();

    @PostMapping("TestController/countDoctorTestrecord")
     int countDoctorTestrecord();

    @PostMapping("TestController/insertDoctorTestrecord")
     void insertDoctorTestrecord(@RequestBody DoctorTestrecode doctorTestrecode);

    @PostMapping("TestController/countDoctorInspectionrecord")
     int countDoctorInspectionrecord();

    @PostMapping("TestController/insertDoctorInspectionrecord")
     void insertDoctorInspectionrecord(@RequestBody DocotrInspectionrecord docotrInspectionrecord);

    @PostMapping("TestController/updateTestalive")
     void updateTestalive(@RequestBody ConcurrentMap map) ;

    @PostMapping("TestController/updateInspectionalive")
    void updateInspectionalive(@RequestBody ConcurrentMap map);
}
