package com.neuedu.his.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.his.model.bean.Checkitem;
import com.neuedu.his.model.mapper.CheckitemMapper;
@Service
public class CheckitemService {

	@Autowired
	private CheckitemMapper cm;
	
	public List<Checkitem> selectAllciitems(){
		return cm.selectAllciitems();
	}
}
