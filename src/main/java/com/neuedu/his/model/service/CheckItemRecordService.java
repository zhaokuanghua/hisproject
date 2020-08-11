package com.neuedu.his.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import com.neuedu.his.model.bean.Checkitemrecord;
import com.neuedu.his.model.mapper.CheckItemRecordMapper;

@Service
public class CheckItemRecordService {

	@Autowired
	private CheckItemRecordMapper cirm;
	
	@Transactional
	public void saveCIRecord(List<Checkitemrecord> list) {
		for(Checkitemrecord cir:list) {
			cirm.saveCIRecord(cir);
		}
	}
}
