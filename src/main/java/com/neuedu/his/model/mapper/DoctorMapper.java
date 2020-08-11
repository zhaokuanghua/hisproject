package com.neuedu.his.model.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.neuedu.his.model.bean.Doctor;

@Mapper
public interface DoctorMapper {

	public List<Doctor> selectDoctor(Map<String, Integer> map);
}
