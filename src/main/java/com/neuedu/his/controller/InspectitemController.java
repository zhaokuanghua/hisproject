package com.neuedu.his.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neuedu.his.model.bean.Inspectitem;
import com.neuedu.his.model.service.InspectitemService;

@CrossOrigin
@RestController
public class InspectitemController {

	@Autowired
	private InspectitemService inspectitemService;
	
	@RequestMapping("/selectAllsiitems")
	public List<Inspectitem> selectAllitems(){
		return inspectitemService.selectAllitems();
	}
}
