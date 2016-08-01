package com.ywkj.controller.workflow.entity;

import java.util.Date;



public class CoustomCondition{

	private int id;
	private String sequenceFlowId;
	private String filedName;
	private String sysbols;
	private String filedValue;
	private String varType;
	private Boolean status;
	private Date createTime;
	private Date updateTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getSequenceFlowId() {
		return sequenceFlowId;
	}
	public void setSequenceFlowId(String sequenceFlowId) {
		this.sequenceFlowId = sequenceFlowId;
	}
	public String getFiledName() {
		return filedName;
	}
	public void setFiledName(String filedName) {
		this.filedName = filedName;
	}
	public String getSysbols() {
		return sysbols;
	}
	public void setSysbols(String sysbols) {
		this.sysbols = sysbols;
	}
	public String getFiledValue() {
		return filedValue;
	}
	public void setFiledValue(String filedValue) {
		this.filedValue = filedValue;
	}
	public String getVarType() {
		return varType;
	}
	public void setVarType(String varType) {
		this.varType = varType;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}


}