package com.neuedu.his.model.bean;

import java.util.Date;

public class Inspectitemrecord {

	private int recordid;
	private int patientid;
	private int inspectitemid;
	private int count;
	private int price;
	private String paystatus;
	private int status;
	private int operator;
	private Date operatedate;
	
	
	
	//外键inspectitemrecord.inspetiemid=inspectitem.inspectitemid
	private Inspectitem inspectitem;
	
	

	
	
	@Override
	public String toString() {
		return "Inspectitemrecord [recordid=" + recordid + ", patientid=" + patientid + ", inspectitemid="
				+ inspectitemid + "]";
	}

	public int getPatientid() {
		return patientid;
	}

	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}

	public int getInspectitemid() {
		return inspectitemid;
	}

	public void setInspectitemid(int inspectitemid) {
		this.inspectitemid = inspectitemid;
	}

	public int getOperator() {
		return operator;
	}

	public void setOperator(int operator) {
		this.operator = operator;
	}

	public int getRecordid() {
		return recordid;
	}

	public void setRecordid(int recordid) {
		this.recordid = recordid;
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

	public Date getOperatedate() {
		return operatedate;
	}

	public void setOperatedate(Date operatedate) {
		this.operatedate = operatedate;
	}

	

	public Inspectitem getInspectitem() {
		return inspectitem;
	}

	public void setInspectitem(Inspectitem inspectitem) {
		this.inspectitem = inspectitem;
	}

	
	
	
}
