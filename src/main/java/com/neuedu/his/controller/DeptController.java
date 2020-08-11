package com.neuedu.his.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neuedu.his.model.bean.Dept;
import com.neuedu.his.model.service.DeptService;

@CrossOrigin
@RestController
public class DeptController {

	@Autowired
	private DeptService deptService;
	
	@RequestMapping("/selectAllDept")
	public List<Dept> selectAllDept(){
		return deptService.selectAllDept();
	}
}
