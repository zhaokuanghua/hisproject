package com.neuedu.his.model.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.neuedu.his.model.bean.Patient;

@Mapper
public interface PatientMapper {

	public Patient getPatientId();

	public List<Patient> selectPatients();
	
	public void savePatient(Patient p);
	
	public Patient getPatientByNo(int patientid);

	public void updatePstatus(Patient p);

	public List<Patient> getPatientByDoctor(int userid);

	public void updateInfo(Map<String, Object> map);

	public Patient getPatientAndPaysByNo(int patientid);

	

}
