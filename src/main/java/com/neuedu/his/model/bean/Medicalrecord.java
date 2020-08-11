package com.neuedu.his.model.bean;

import java.sql.Date;

public class Medicalrecord {
    private int mrid;

    private String mainsuit;

    private String presenthistory;

    private String pasthistory;

    private String personalhistory;

    private Date mrdate;
    
    private int illnessid;

    private String result;
    
    private int status;

    private int operator;
    
    private Date operatedate;
    
    
    
    
    public int getIllnessid() {
		return illnessid;
	}

	public void setIllnessid(int illnessid) {
		this.illnessid = illnessid;
	}



	//外键medicalrecord.illnessid=illness.illnessid
    private Illness illness;
    
    

	public int getMrid() {
		return mrid;
	}

	public void setMrid(int mrid) {
		this.mrid = mrid;
	}

	public String getMainsuit() {
		return mainsuit;
	}

	public void setMainsuit(String mainsuit) {
		this.mainsuit = mainsuit;
	}

	public String getPresenthistory() {
		return presenthistory;
	}

	public void setPresenthistory(String presenthistory) {
		this.presenthistory = presenthistory;
	}

	public String getPasthistory() {
		return pasthistory;
	}

	public void setPasthistory(String pasthistory) {
		this.pasthistory = pasthistory;
	}

	public String getPersonalhistory() {
		return personalhistory;
	}

	public void setPersonalhistory(String personalhistory) {
		this.personalhistory = personalhistory;
	}

	public Date getMrdate() {
		return mrdate;
	}

	public void setMrdate(Date mrdate) {
		this.mrdate = mrdate;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}


	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
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

	public Illness getIllness() {
		return illness;
	}

	public void setIllness(Illness illness) {
		this.illness = illness;
	}

	@Override
	public String toString() {
		return "Medicalrecord [mrid=" + mrid + ", mainsuit=" + mainsuit + ", presenthistory=" + presenthistory
				+ ", pasthistory=" + pasthistory + ", personalhistory=" + personalhistory + ", mrdate=" + mrdate
				+ ", illnessid=" + illnessid + ", result=" + result + ", status=" + status + ", operator=" + operator
				+ ", operatedate=" + operatedate + ", illness=" + illness + ", getIllnessid()=" + getIllnessid()
				+ ", getMrid()=" + getMrid() + ", getMainsuit()=" + getMainsuit() + ", getPresenthistory()="
				+ getPresenthistory() + ", getPasthistory()=" + getPasthistory() + ", getPersonalhistory()="
				+ getPersonalhistory() + ", getMrdate()=" + getMrdate() + ", getStatus()=" + getStatus()
				+ ", getResult()=" + getResult() + ", getOperator()=" + getOperator() + ", getOperatedate()="
				+ getOperatedate() + ", getIllness()=" + getIllness() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}



	

	
}