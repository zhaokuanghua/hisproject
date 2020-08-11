package com.neuedu.his.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.his.model.bean.Illness;
import com.neuedu.his.model.mapper.IllnessMapper;

@Service
public class IllnessService {

	@Autowired
	private IllnessMapper im;
	public List<Illness> selectAllillness(){
		return im.selectAllillness();
	} 
}
