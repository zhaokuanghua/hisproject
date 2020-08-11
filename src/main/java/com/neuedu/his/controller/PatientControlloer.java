package com.neuedu.his.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neuedu.his.model.bean.Patient;
import com.neuedu.his.model.bean.User;
import com.neuedu.his.model.service.PatientService;

@CrossOrigin
@RestController
public class PatientControlloer {

	@Autowired
	private PatientService patientService;
	
	@RequestMapping("/getpatientId")
	public String getpatientId() {
		int pid = patientService.getPatientId();
		return "{\"pid\":\""+pid+"\"}";
	}
	
	@RequestMapping("/selectPatients")
	public List<Patient> selectPatients(){
		return patientService.selectPatients();
	}
	
	@RequestMapping("/savePatient")
	public String savePatient(Patient p) {
		p.setDiagnosed("否");
		p.setPstatus("已挂号");
		p.setStatus(1);
		p.setOperatedate(new java.sql.Date(new Date().getTime()));
		patientService.savePatient(p);
		return "{\"result\":\"success\"}";
	}
	
	@RequestMapping("/getPatientByNo/{patientid}")
	public Patient getPatientByNo(@PathVariable int patientid) {
//		System.out.println("12345");
//		System.out.println(patientid);
		Patient p = patientService.getPatientByNo(patientid);
//		System.out.println(p);
		return patientService.getPatientByNo(patientid);
	}
	@RequestMapping("/updatePstatus/{patientid}/{userid}")
	public String updatePstatus(@PathVariable int patientid,@PathVariable int userid) {
		patientService.updatePstatus(patientid,userid);
		return "{\"result\":\"success\"}";
	}
	@RequestMapping("/getPatientByDoctor/{userid}")
	public List<Patient> getPatientByDoctor(@PathVariable int userid){
		return patientService.getPatientByDoctor(userid);
	}
	@RequestMapping("/getPatientAndPaysByNo/{patientid}")
	public Patient getPatientAndPaysByNo(@PathVariable int patientid) {
		System.out.println("Controller层的patient：" + patientid);
		return patientService.getPatientAndPaysByNo(patientid);
	}
	@RequestMapping("/updatePayStatus/{patientid}/{userid}")
	public String updatePayStatus(@PathVariable int patientid,@PathVariable int userid) {
		patientService.updatePayStatus(patientid, userid);
		return "{\"result\":\"success\"}";
	}
}
