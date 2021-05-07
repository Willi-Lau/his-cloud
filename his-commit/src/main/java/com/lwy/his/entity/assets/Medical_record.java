package com.lwy.his.entity.assets;


import com.lwy.his.entity.doctor.DoctorUser;
import com.lwy.his.entity.patient.PatientUser;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;


@Data
@Api("病历表")
@NoArgsConstructor
@AllArgsConstructor
public class Medical_record implements Serializable {

    private int mrid;
    private int mrpid;
    private int mrdid;
    private Timestamp mrtime;
    private String mrchiefcomplaint;
    private String mrpresentIllness;
    private String mrpast;
    private String mrpersonal;
    private String mrfinal;
    //一对一医生表
    private DoctorUser doctorUser;
    //一对一患者表
    private PatientUser patientUser;
    //一对多检验表
    private List<Test> testList;
    //一对多检查表
    private List<Inspection> inspectionList;
    //一对多处理表
    private List<Handle> handleList;
    //一对多缴费表
    private List<Pay> payList;

}
