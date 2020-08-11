package com.neuedu.his.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neuedu.his.model.bean.Illness;
import com.neuedu.his.model.service.IllnessService;

@CrossOrigin
@RestController
public class IllnessController {

	@Autowired
	private IllnessService is;
	@RequestMapping("/selectAllillness")
	public List<Illness> selectAllillness(){
		return is.selectAllillness();
	} 
}
