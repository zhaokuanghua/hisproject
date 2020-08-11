package com.neuedu.his.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neuedu.his.model.bean.Checkitem;
import com.neuedu.his.model.service.CheckitemService;

@CrossOrigin
@RestController
public class CheckitemController {
	@Autowired
	private CheckitemService cs;
	
	@RequestMapping("/selectAllciitems")
	public List<Checkitem> selectAllciitems(){
		return cs.selectAllciitems();
	}
}
