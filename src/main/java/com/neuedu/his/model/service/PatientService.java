package com.neuedu.his.model.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neuedu.his.model.bean.Patient;
import com.neuedu.his.model.mapper.CheckItemRecordMapper;
import com.neuedu.his.model.mapper.InspectItemRecordMapper;
import com.neuedu.his.model.mapper.PatientMapper;

@Service
public class PatientService {

	//通过类型进行自动依赖注入
	@Autowired
	private PatientMapper patientMapper;
	
	@Autowired
	private CheckItemRecordMapper cirm;
	
	@Autowired
	private InspectItemRecordMapper iirm;
	
	public int getPatientId() {
		Patient p = patientMapper.getPatientId();
		return p.getPatientid();
	}
	public List<Patient> selectPatients(){
		
		return patientMapper.selectPatients();
	}
	@Transactional
	public void savePatient(Patient p) {
		patientMapper.savePatient(p);
	}
	
	public Patient getPatientByNo(int patientid) {
//		System.out.println(patientid);
		Patient p = patientMapper.getPatientByNo(patientid);
//		System.out.println(p);
		return p;
	}
	@Transactional
	public void updatePstatus(int patientid, int userid) {
		Patient p = new Patient();
		p.setPatientid(patientid);
		p.setOperator(userid);
		p.setPstatus("已退号");
		p.setOperatedate(new java.sql.Date(new Date().getTime()));
		patientMapper.updatePstatus(p);
	}
	public List<Patient> getPatientByDoctor(int userid) {
		return patientMapper.getPatientByDoctor(userid);
	}
	
	
	public Patient getPatientAndPaysByNo(int patientid) {
		System.out.println("Service层的patientid"+patientid);
		System.out.println("Service层的Patient对象"+patientMapper.getPatientAndPaysByNo(patientid));
		return patientMapper.getPatientAndPaysByNo(patientid);
	}
	
	@Transactional
	public void updatePayStatus(int patientid,int userid) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("paystatus", "已缴费");
		map.put("operator", userid);
		map.put("operatedate", new java.sql.Date(new Date().getTime()));
		map.put("patientid", patientid);
		cirm.getPatientAndPaysByNo(map);
		iirm.getPatientAndPaysByNo(map);
	}
}
