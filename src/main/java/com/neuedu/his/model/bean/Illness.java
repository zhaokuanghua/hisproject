package com.neuedu.his.model.bean;

import java.util.List;

public class Illness {
    private int illnessid;

    private String illnessname;

    //一对多
    private List<Medicalrecord> medicalrecord;
    
	public int getIllnessid() {
		return illnessid;
	}

	public void setIllnessid(int illnessid) {
		this.illnessid = illnessid;
	}

	public String getIllnessname() {
		return illnessname;
	}

	public void setIllnessname(String illnessname) {
		this.illnessname = illnessname;
	}

	public List<Medicalrecord> getMedicalrecord() {
		return medicalrecord;
	}

	public void setMedicalrecord(List<Medicalrecord> medicalrecord) {
		this.medicalrecord = medicalrecord;
	}

}