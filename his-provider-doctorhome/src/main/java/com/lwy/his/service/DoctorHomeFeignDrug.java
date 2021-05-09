package com.lwy.his.service;

import com.lwy.his.entity.assets.Drug;
import com.lwy.his.entity.assets.Handle;
import com.lwy.his.entity.assets.NoDrug;
import com.lwy.his.entity.doctor.DoctorDrugrecord;
import com.lwy.his.entity.doctor.DoctorNodrugrecord;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
@FeignClient(value = "his-drug")
public interface DoctorHomeFeignDrug {

    /**
     * drug
     * @return
     */

    @PostMapping("/DrugController/selectallDrug")
    CopyOnWriteArrayList<Drug> selectallDrug();

    @PostMapping("/DrugController/updateDrugNum")
    void updateDrugNum(@RequestBody ConcurrentMap map);

    @PostMapping("/DrugController/countDoctorDrugrecord")
    int countDoctorDrugrecord();

    @PostMapping("/DrugController/countDoctorDrugrecord")
    void insertDoctorDrugrecord(@RequestBody DoctorDrugrecord doctorDrugrecord);

    @PostMapping("/DrugController/selectNameByidFromDrug")
    String selectNameByidFromDrug(@RequestParam("id") String id);


    /**
     * nodrug
     */

    @PostMapping("/NoDrugController/selectallNoDrug")
    CopyOnWriteArrayList<NoDrug> selectallNoDrug();

    @PostMapping("/NoDrugController/countDoctorNoDrugRecord")
    int countDoctorNoDrugRecord();

    @PostMapping("/NoDrugController/insertDoctorNoDrugRedord")
    void insertDoctorNoDrugRedord(@RequestBody DoctorNodrugrecord doctorNodrugrecord);

    @PostMapping("/NoDrugController/selectallHandle")
    CopyOnWriteArrayList<Handle> selectallHandle(@RequestParam("mrid") int mrid);

    @PostMapping("/NoDrugController/selectNameByidFromNoDrug")
    String selectNameByidFromNoDrug(@RequestParam("id") String id);





}
