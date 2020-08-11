package com.neuedu.his.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neuedu.his.model.bean.Checkitemrecord;
import com.neuedu.his.model.service.CheckItemRecordService;

@CrossOrigin
@RestController
public class CheckItemRecordController {

	@Autowired
	private CheckItemRecordService cirs;
	
	@RequestMapping("/saveCIRecord")
	public String saveCIRecord(@RequestBody List<Checkitemrecord> list) {
		cirs.saveCIRecord(list);
		return "{\"result\":\"success\"}";
	}
}
