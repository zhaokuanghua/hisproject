package com.neuedu.his.model.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.neuedu.his.model.bean.Checkitemrecord;

@Mapper
public interface CheckItemRecordMapper {

	public void saveCIRecord(Checkitemrecord cir);

	public void getPatientAndPaysByNo(Map<String, Object> map);

	
}
