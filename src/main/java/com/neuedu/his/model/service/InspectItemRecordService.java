package com.neuedu.his.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.neuedu.his.model.bean.Inspectitemrecord;
import com.neuedu.his.model.mapper.InspectItemRecordMapper;

@Service
public class InspectItemRecordService {

	@Autowired
	private InspectItemRecordMapper iirm;
	
	public void saveSIRecord(List<Inspectitemrecord> list) {
		for(Inspectitemrecord iir:list) {
			iirm.saveSIRecord(iir);
			System.out.println(iir.toString());
		}
		
	}
}
