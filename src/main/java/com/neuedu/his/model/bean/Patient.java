package com.neuedu.his.model.bean;

import java.sql.Date;
import java.util.List;

public class Patient {
    private int patientid;

    private String name;

    private String sex;

    private int age;

    private Date birthday;

    private String idcard;

    private String address;

    private String pflag;

    private int patientfee;

    private Date pdate;

    private String diagnosed;

    private String pstatus;

    private int status;

    private Date operatedate;
    
    private int mrid;
    
    private int operator;
    
    //外键patient.docotorid=doctor.doctorid
    private Doctor doctor;
    
    //外键patient.operator=user.userid
    private User user;
    
    private Medicalrecord medicalRecord;
   
    
    
    
    
    @Override
	public String toString() {
		return "Patient [patientid=" + patientid + ", name=" + name + ", sex=" + sex + ", age=" + age + ", birthday="
				+ birthday + ", idcard=" + idcard + ", address=" + address + ", pflag=" + pflag + ", patientfee="
				+ patientfee + ", pdate=" + pdate + ", diagnosed=" + diagnosed + ", pstatus=" + pstatus + ", status="
				+ status + ", operatedate=" + operatedate + ", mrid=" + mrid + ", operator=" + operator + ", doctor="
				+ doctor + ", user=" + user + ", medicalRecord=" + medicalRecord + ", checkitemrecord="
				+ checkitemrecord + ", inspectitemrecord=" + inspectitemrecord + "]";
	}
	public int getOperator() {
		return operator;
	}
	public void setOperator(int operator) {
		this.operator = operator;
	}
	public int getMrid() {
		return mrid;
	}
	public void setMrid(int mrid) {
		this.mrid = mrid;
	}
	public Medicalrecord getMedicalRecord() {
		return medicalRecord;
	}
	public void setMedicalRecord(Medicalrecord medicalRecord) {
		this.medicalRecord = medicalRecord;
	}
	
	//一对多
    private List<Checkitemrecord> checkitemrecord;
    private List<Inspectitemrecord> inspectitemrecord;
    
	public int getPatientid() {
		return patientid;
	}
	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPflag() {
		return pflag;
	}
	public void setPflag(String pflag) {
		this.pflag = pflag;
	}
	public int getPatientfee() {
		return patientfee;
	}
	public void setPatientfee(int patientfee) {
		this.patientfee = patientfee;
	}
	public Date getPdate() {
		return pdate;
	}
	public void setPdate(Date pdate) {
		this.pdate = pdate;
	}
	public String getDiagnosed() {
		return diagnosed;
	}
	public void setDiagnosed(String diagnosed) {
		this.diagnosed = diagnosed;
	}
	public String getPstatus() {
		return pstatus;
	}
	public void setPstatus(String pstatus) {
		this.pstatus = pstatus;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Date getOperatedate() {
		return operatedate;
	}
	public void setOperatedate(Date operatedate) {
		this.operatedate = operatedate;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Checkitemrecord> getCheckitemrecord() {
		return checkitemrecord;
	}
	public void setCheckitemrecord(List<Checkitemrecord> checkitemrecord) {
		this.checkitemrecord = checkitemrecord;
	}
	public List<Inspectitemrecord> getInspectitemrecord() {
		return inspectitemrecord;
	}
	public void setInspectitemrecord(List<Inspectitemrecord> inspectitemrecord) {
		this.inspectitemrecord = inspectitemrecord;
	}
	
	
}