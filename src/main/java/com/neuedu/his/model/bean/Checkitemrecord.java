package com.neuedu.his.model.bean;

import java.util.Date;

public class Checkitemrecord {
    private int recordid;

    private int patientid;

    private int checkitemid;

    private int count;

    private int price;

    private String paystatus;

    private int status;

    private int operator;

    private Date operatedate;

    //外键checkitemrecord.checkitemid=checkitem.checkitemid
    private Checkitem checkitem;
    
    
    
    
	

	public Checkitem getCheckitem() {
		return checkitem;
	}

	public void setCheckitem(Checkitem checkitem) {
		this.checkitem = checkitem;
	}

	public int getRecordid() {
		return recordid;
	}

	public void setRecordid(int recordid) {
		this.recordid = recordid;
	}

	public int getPatientid() {
		return patientid;
	}

	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}

	public int getCheckitemid() {
		return checkitemid;
	}

	public void setCheckitemid(int checkitemid) {
		this.checkitemid = checkitemid;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPaystatus() {
		return paystatus;
	}

	public void setPaystatus(String paystatus) {
		this.paystatus = paystatus;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getOperator() {
		return operator;
	}

	public void setOperator(int operator) {
		this.operator = operator;
	}

	public Date getOperatedate() {
		return operatedate;
	}

	public void setOperatedate(Date operatedate) {
		this.operatedate = operatedate;
	}



}