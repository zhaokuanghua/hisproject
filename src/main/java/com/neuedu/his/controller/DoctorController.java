package com.neuedu.his.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neuedu.his.model.bean.Doctor;
import com.neuedu.his.model.service.DoctorService;

@CrossOrigin
//@Controller + @ResponseBody
@RestController
public class DoctorController {

	@Autowired
	private DoctorService doctorService;
	
	@RequestMapping("/selectDoctor/{deptid}/{levelid}")
	public List<Doctor> selectDoctor(@PathVariable int deptid,@PathVariable int levelid){
		return doctorService.selectDocotor(deptid, levelid);
	}
	
}
