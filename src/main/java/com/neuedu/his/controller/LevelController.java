package com.neuedu.his.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neuedu.his.model.bean.Level;
import com.neuedu.his.model.service.LevelService;

@CrossOrigin
@RestController
public class LevelController {

	@Autowired
	private LevelService levelService;
	@RequestMapping("/selectAllLevel")
	public List<Level> selectAllLevel(){
		return levelService.selectAllLevel();
	};
	
}
