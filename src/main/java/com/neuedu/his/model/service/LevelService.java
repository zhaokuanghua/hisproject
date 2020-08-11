package com.neuedu.his.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.his.model.bean.Level;
import com.neuedu.his.model.mapper.LevelMapper;

@Service
public class LevelService {

	@Autowired
	private LevelMapper levelMapper;
	
	public List<Level> selectAllLevel(){
		return levelMapper.selectAllLevel();
	}
}
