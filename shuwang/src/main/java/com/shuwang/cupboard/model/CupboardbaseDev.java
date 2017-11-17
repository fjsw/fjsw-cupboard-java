package com.shuwang.cupboard.model;

public class CupboardbaseDev {
	private int opId;
	private String dModel;
	private int dPhyver;
	private int dSoftver;
	private String dBsnsta;
	private String dDevsta;
	private Long userid;
	private String devid;
	private Integer lock;//锁的状态2关门1开门
	private Integer num;

	public int getOpId() {
		return opId;
	}
	public void setOpId(int opId) {
		this.opId = opId;
	}
	public String getdModel() {
		return dModel;
	}
	public void setdModel(String dModel) {
		this.dModel = dModel;
	}
	public int getdPhyver() {
		return dPhyver;
	}
	public void setdPhyver(int dPhyver) {
		this.dPhyver = dPhyver;
	}
	public int getdSoftver() {
		return dSoftver;
	}
	public void setdSoftver(int dSoftver) {
		this.dSoftver = dSoftver;
	}
	public String getdBsnsta() {
		return dBsnsta;
	}
	public void setdBsnsta(String dBsnsta) {
		this.dBsnsta = dBsnsta;
	}
	public String getdDevsta() {
		return dDevsta;
	}
	public void setdDevsta(String dDevsta) {
		this.dDevsta = dDevsta;
	}
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	public String getDevid() {
		return devid;
	}
	public void setDevid(String devid) {
		this.devid = devid;
	}
	public Integer getLock() {
		return lock;
	}
	public void setLock(Integer lock) {
		this.lock = lock;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	
	
	
}
