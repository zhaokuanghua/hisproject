package com.neuedu.his.model.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.RequestBody;

import com.neuedu.his.model.bean.Inspectitemrecord;

@Mapper
public interface InspectItemRecordMapper {

	public void saveSIRecord(Inspectitemrecord iir) ;

	public void getPatientAndPaysByNo(Map<String, Object> map);

	
}
