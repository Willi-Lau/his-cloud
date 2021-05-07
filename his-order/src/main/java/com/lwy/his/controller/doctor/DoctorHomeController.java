package com.lwy.his.controller.doctor;




import com.lwy.his.entity.assets.*;
import com.lwy.his.entity.doctor.DocotrInspectionrecord;
import com.lwy.his.entity.doctor.DoctorDrugrecord;
import com.lwy.his.entity.doctor.DoctorNodrugrecord;
import com.lwy.his.entity.doctor.DoctorTestrecode;
import com.lwy.his.entity.temporary.Allitems;
import com.lwy.his.entity.temporary.TableDateDrug;
import com.lwy.his.entity.temporary.TableDateNoDrug;
import com.lwy.his.service.DoctorHomeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

@RestController
@RequestMapping("/DoctorHomeController")
@Api("医生登陆主界面，操控各种各样的患者")
@Slf4j
public class DoctorHomeController {

    @Autowired
    private DoctorHomeService service;


    @RequestMapping("/selectallPRrecode")
    @ApiOperation("未就诊/就诊 根据患者名字，医生名字，日期查询")
    CopyOnWriteArrayList<Patient_Registration_record> selectallPRrecode(String patientusername,
                                                                        String today,
                                                                        String doctorusername,
                                                                        int prralready,
                                                                        @RequestParam(defaultValue = "1") int pageNo,
                                                                        @RequestParam(defaultValue = "4") int pageSize) throws ParseException {
        return service.selectallPRrecode(patientusername,today,doctorusername,prralready,pageNo,pageSize);
    }

    @RequestMapping("/selectallPRrecodecount")
    @ApiOperation("未就诊/就诊 根据患者名字，医生名字，日期查询  查询总条数")
    int selectallPRrecodecount(String patientusername,String today,String doctorusername,int prralready) throws ParseException {
        return service.selectallPRrecodecount(patientusername,today,doctorusername,prralready);
    }

    @RequestMapping("/selectPRRandMRbyid")
    @ApiOperation("根据挂号id查找挂号信息，病例信息")
    public Patient_Registration_record selectPRRandMRbyid(int id) {
        return service.selectPRRandMRbyid(id);
    }

    @RequestMapping("/updatePrralready")
    @ApiOperation("根据挂号id更改已经就诊")
    public void updatePrralready(int prrid) {
        service.updatePrralready(prrid);
    }

    @RequestMapping("/updatePRRinf")
    @ApiOperation("根据挂号id修改病历里相关信息，主诉等信息")
    public void updatePRRinf(int prrid,String mrchiefcomplaint,String mrpresentIllness,String mrpast,
                             String mrpersonal,String mrfinal) {
        service.updatePRRinf(prrid,mrchiefcomplaint ,mrpresentIllness,mrpast,mrpersonal,mrfinal);
    }

    @RequestMapping("/selectallDiagnosis")
    @ApiOperation("查找所有的疾病信息")
    public CopyOnWriteArrayList<Diagnosis> selectallDiagnosis() {
        return service.selectallDiagnosis();
    }


    @RequestMapping("/selectallInspection")
    @ApiOperation("查找所有的检验信息")
    public CopyOnWriteArrayList<Inspection_items> selectallInspection() {
        return service.selectallInspection();
    }

    @RequestMapping("/selectalltest")
    @ApiOperation("查找所有的检查信息")
    public CopyOnWriteArrayList<Test_items> selectalltest() {
        return service.selectalltest();
    }

    @RequestMapping("/upAllitems")
    @ApiOperation("提交检查检验结果，到检查表，检验表，和消费记录")
    public void upAllitems(@RequestBody Allitems[] thisAllitems){
        service.upAllitems(thisAllitems);
    }

    @RequestMapping("/selectallTestAndInsprction")
    @ApiOperation("根据病历id查找 检查，检验，缴费得信息")
    public CopyOnWriteArrayList<Medical_record> selectallTestAndInsprction(int prrid) {
        return service.selectallTestAndInsprction(prrid);
    }

    @RequestMapping("/updateTestInspectionPay")
    @ApiOperation("根据病历id，所作项目id,和创建时间 把相对应alive设置为1")
    public void updateTestInspectionPay(int mrid,String id,String time) throws ParseException {
        service.updateTestInspectionPay(mrid,id,time);
    }

    @RequestMapping("/selectallDrug")
    @ApiOperation("返回所有药品目录")
    public CopyOnWriteArrayList<Drug> selectallDrug() {
        return service.selectallDrug();
    }

    @RequestMapping("/selectallNoDrug")
    @ApiOperation("返回所有非药品目录")
    public CopyOnWriteArrayList<NoDrug> selectallNoDrug() {
        return service.selectallNoDrug();
    }

    @RequestMapping("/insertpayfromDrug")
    @ApiOperation("添加药品到支付列表")
    public void insertpayfromDrug(@RequestBody TableDateDrug[] tableDataDrug) {
//        (drid=dr18, drname=整肠生, drformat=盒, drconsumption=一日四次, drtype=无,
//        drnum=5555, dryounum=15, drmoney=15.5, drmedical=1, allmoney=232.5, prrid=4)
        service.insertpayfromDrug(tableDataDrug);
    }

    @RequestMapping("/uploadallNoDrug")
    @ApiOperation("提交非药品医疗处理")
    public void uploadallNoDrug(@RequestBody TableDateNoDrug[] tableDateNoDrugs){
//        TableDateNoDrug(nid=ndr10, nname=产后护理, pinyin=null, nformat=次, nnomney=null, nmediacl=0, nnum=12, nallmoney=1200000, prrid=2)
//        TableDateNoDrug(nid=ndr1, nname=静脉注射葡萄糖, pinyin=null, nformat=次, nnomney=null, nmediacl=0, nnum=11, nallmoney=440, prrid=2)
        service.uploadallNoDrug(tableDateNoDrugs);
    }

    @ApiOperation("根据prrid 返回所有药品所作处理的所有信息 nodrug")
    @RequestMapping("/selectallHandle")
    public CopyOnWriteArrayList<Handle> selectallHandle(Integer prrid) {

        return service.selectallHandle(prrid);
    }





}
