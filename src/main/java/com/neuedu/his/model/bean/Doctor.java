package com.neuedu.his.model.bean;

import java.util.List;

public class Doctor {
    private int doctorid;

    private String dname;

    //外键doctor.deptid=dept.deptid
    private Dept dept;
    
    //外键doctor.levelid=level.levelid
    private Level level;

	public int getDoctorid() {
		return doctorid;
	}

	public void setDoctorid(int doctorid) {
		this.doctorid = doctorid;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}
    

}