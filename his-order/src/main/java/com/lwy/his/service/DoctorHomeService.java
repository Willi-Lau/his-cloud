package com.lwy.his.service;


import com.lwy.his.entity.assets.*;
import com.lwy.his.entity.temporary.Allitems;
import com.lwy.his.entity.temporary.TableDateDrug;
import com.lwy.his.entity.temporary.TableDateNoDrug;
import com.lwy.his.service.impl.DoctorLoginHandle;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.ParseException;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

@FeignClient(value = "his-provider-doctorhome")
@Component
public interface DoctorHomeService {

    @PostMapping("DoctorHomeController/selectallPRrecode")
    CopyOnWriteArrayList<Patient_Registration_record> selectallPRrecode(@RequestParam("patientusername") String patientusername,
                                                                        @RequestParam("today") String today,
                                                                        @RequestParam("doctorusername") String doctorusername,
                                                                        @RequestParam("prralready") int prralready,
                                                                        @RequestParam(value = "pageNo",defaultValue = "1") int pageNo,
                                                                        @RequestParam(value = "pageSize",defaultValue = "4") int pageSize)
            throws ParseException;

    @PostMapping("DoctorHomeController/selectallPRrecodecount")
    int selectallPRrecodecount(@RequestParam("patientusername") String patientusername,
                               @RequestParam("today") String today,
                               @RequestParam("doctorusername") String doctorusername,
                               @RequestParam("prralready") int prralready)
            throws ParseException;

    @PostMapping("DoctorHomeController/selectPRRandMRbyid")
    Patient_Registration_record selectPRRandMRbyid(@RequestParam("id") int id);

    @PostMapping("DoctorHomeController/updatePrralready")
    void updatePrralready(@RequestParam("prrid") int prrid);

    @PostMapping("DoctorHomeController/updatePRRinf")
    void updatePRRinf(@RequestParam("prrid") int prrid,
                      @RequestParam("mrchiefcomplaint") String mrchiefcomplaint,
                      @RequestParam("mrpresentIllness") String mrpresentIllness,
                      @RequestParam("mrpast") String mrpast,
                      @RequestParam("mrpersonal") String mrpersonal,
                      @RequestParam("mrfinal") String mrfinal);

    @PostMapping("DoctorHomeController/selectallDiagnosis")
    CopyOnWriteArrayList<Diagnosis> selectallDiagnosis();

    @PostMapping("DoctorHomeController/selectallInspection")
    CopyOnWriteArrayList<Inspection_items> selectallInspection();

    @PostMapping("DoctorHomeController/selectalltest")
     CopyOnWriteArrayList<Test_items> selectalltest();

    @PostMapping("DoctorHomeController/upAllitems")
    void upAllitems(@RequestBody Allitems[] thisAllitems);

    @PostMapping("DoctorHomeController/selectallTestAndInsprction")
    CopyOnWriteArrayList<Medical_record> selectallTestAndInsprction(@RequestParam("prrid") int prrid);

    @PostMapping("DoctorHomeController/updateTestInspectionPay")
    void updateTestInspectionPay(@RequestParam("mrid") int mrid,
                                        @RequestParam("id") String id,
                                        @RequestParam("time") String time) throws ParseException;

    @PostMapping("DoctorHomeController/selectallDrug")
    CopyOnWriteArrayList<Drug> selectallDrug();

    @PostMapping("DoctorHomeController/selectallNoDrug")
     CopyOnWriteArrayList<NoDrug> selectallNoDrug();

    @PostMapping("DoctorHomeController/insertpayfromDrug")
    void insertpayfromDrug(@RequestBody TableDateDrug[] tableDataDrug);

    @PostMapping("DoctorHomeController/uploadallNoDrug")
    void uploadallNoDrug(@RequestBody TableDateNoDrug[] tableDateNoDrugs);


    @PostMapping("DoctorHomeController/selectallHandle")
    CopyOnWriteArrayList<Handle> selectallHandle(@RequestParam("prrid")  Integer prrid);


    @RequestMapping("DoctorHomeController/deleteHandle")
     void deleteHandle(@RequestParam("hid") String hid);


}
