package com.neuedu.his.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.his.model.bean.Dept;
import com.neuedu.his.model.mapper.DeptMapper;

@Service
public class DeptService {

	@Autowired
	private DeptMapper deptMapper;
	
	public List<Dept> selectAllDept(){
		return deptMapper.selectAllDept();
	}
}
