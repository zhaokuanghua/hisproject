package com.neuedu.his.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neuedu.his.model.bean.Inspectitemrecord;
import com.neuedu.his.model.service.InspectItemRecordService;

@CrossOrigin
@RestController
public class InspectItemRecordController {

	@Autowired
	private InspectItemRecordService iirs;
	
	@RequestMapping("/saveSIRecord")
	public String saveSIRecord(@RequestBody List<Inspectitemrecord> list) {
		iirs.saveSIRecord(list);
		return "{\"result\":\"success\"}";
	}
}
