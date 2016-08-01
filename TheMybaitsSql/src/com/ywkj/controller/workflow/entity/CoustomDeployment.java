package com.ywkj.controller.workflow.entity;

import java.util.Date;




public class CoustomDeployment  {

	// Fields

	private int id;
	private String name;
	private String dflwId;
	private Date createTime;
	private Date updateTime;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDflwId() {
		return dflwId;
	}
	public void setDflwId(String dflwId) {
		this.dflwId = dflwId;
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

	@Override
	public String toString() {
		return "CoustomDeployment [id=" + id + ", name=" + name + ", dflwId="
				+ dflwId + ", createTime=" + createTime + ", updateTime="
				+ updateTime + "]";
	}

	

}