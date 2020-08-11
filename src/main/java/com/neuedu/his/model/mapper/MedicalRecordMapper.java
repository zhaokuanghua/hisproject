package com.neuedu.his.model.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.neuedu.his.model.bean.Medicalrecord;

@Mapper
public interface MedicalRecordMapper {

	public void saveMedicalRecord(Medicalrecord mr);

	public void updateMedicalRecord(Medicalrecord mr);
	
}
