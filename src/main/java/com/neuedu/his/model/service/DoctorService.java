package com.neuedu.his.model.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.his.model.bean.Doctor;
import com.neuedu.his.model.mapper.DoctorMapper;

@Service
public class DoctorService {

	@Autowired
	private DoctorMapper doctorMapper;
	
	public List<Doctor> selectDocotor(int deptid,int levelid){
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("deptid",deptid);
		map.put("levelid", levelid);
		return doctorMapper.selectDoctor(map);
		
	}
}
