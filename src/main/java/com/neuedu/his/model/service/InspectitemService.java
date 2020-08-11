package com.neuedu.his.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.his.model.bean.Inspectitem;
import com.neuedu.his.model.mapper.InspectitemMapper;

@Service
public class InspectitemService {

	@Autowired
	private InspectitemMapper inspectitemMapper;
	
	public List<Inspectitem> selectAllitems() {
		return inspectitemMapper.selectAllitems();
	}

}
