package com.neuedu.his.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neuedu.his.model.bean.Medicalrecord;
import com.neuedu.his.model.service.MedicalRecordService;

@CrossOrigin
@RestController
public class MedicalRecordController {

	@Autowired
	private MedicalRecordService medicalRecordservice;
	
	@RequestMapping("/saveMedicalRecord/{patientid}")
	public String saveMedicalRecord(@PathVariable int patientid, Medicalrecord mr){
		medicalRecordservice.saveMedicalRecord(patientid,mr);
		return "{\"result\":\"success\"}";
	} 
	
	@RequestMapping("/updateMedicalRecord")
	public String updateMedicalRecord(Medicalrecord mr) {
		System.out.println(mr.toString());
		medicalRecordservice.updateMedicalRecord(mr);
		return "{\"result\":\"success\"}";
	}
		
	
}
