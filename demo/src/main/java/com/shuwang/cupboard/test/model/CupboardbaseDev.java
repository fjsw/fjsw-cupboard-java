package com.shuwang.cupboard.test.model;

public class CupboardbaseDev {
	private int dId;
	private int opId;
	private int cId;
	private String dModel;
	private int dPhyver;
	private int dSoftver;
	private String dBsnsta;
	private String dDevsta;
	private String dServlist;
	private String dSimoper;
	private String dSimnum;
	private String dSimid;
	private Long userid;
	private String devid;
	private Integer act;//门状态2关门1开门
	private Integer lock;//锁的状态2关门1开门
	private Integer num;
	private String method;
	
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public int getOpId() {
		return opId;
	}
	public void setOpId(int opId) {
		this.opId = opId;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
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
	public String getdServlist() {
		return dServlist;
	}
	public void setdServlist(String dServlist) {
		this.dServlist = dServlist;
	}
	public String getdSimoper() {
		return dSimoper;
	}
	public void setdSimoper(String dSimoper) {
		this.dSimoper = dSimoper;
	}
	public String getdSimnum() {
		return dSimnum;
	}
	public void setdSimnum(String dSimnum) {
		this.dSimnum = dSimnum;
	}
	public String getdSimid() {
		return dSimid;
	}
	public void setdSimid(String dSimid) {
		this.dSimid = dSimid;
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
	public Integer getAct() {
		return act;
	}
	public void setAct(Integer act) {
		this.act = act;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public Integer getLock() {
		return lock;
	}
	public void setLock(Integer lock) {
		this.lock = lock;
	}
	
}
