package com.neuedu.his.model.service;


import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neuedu.his.model.bean.Medicalrecord;
import com.neuedu.his.model.mapper.MedicalRecordMapper;
import com.neuedu.his.model.mapper.PatientMapper;

@Service
public class MedicalRecordService {

	@Autowired
	private MedicalRecordMapper mrp;
	
	@Autowired
	private PatientMapper patientMapper;
	@Transactional
	public void saveMedicalRecord(int patientid, Medicalrecord mr) {
		//保存病历信息
		mr.setMrdate(new java.sql.Date(new Date().getTime()));
		mr.setOperatedate(new java.sql.Date(new Date().getTime()));
		System.out.println(mr.toString());
		mr.setStatus(1);
		mrp.saveMedicalRecord(mr);
		//修改患者是否一阵状态和病例ID
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("patientid", patientid);
		map.put("mrid",mr.getMrid() );
		map.put("diagnosed","是");
		map.put("operator",mr.getOperator());
		map.put("operatedate", new java.sql.Date(new Date().getTime()));
		System.out.println(map);
		patientMapper.updateInfo(map);
	}
	@Transactional
	public void updateMedicalRecord(Medicalrecord mr) {
		mr.setOperatedate(new java.sql.Date(new Date().getTime()));
		System.out.println(mr.toString());
		mrp.updateMedicalRecord(mr);
	}
}
