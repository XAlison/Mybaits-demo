package com.ywkj.controller.workflow.entity;

import java.util.Date;


public class CoustomProcessnode  {

	// Fields

	private int id;
	private String nodeName;
	private String nodeId;
	private String assignee;
	private String supernode;
	private Boolean states;

	private String nodeType;
	private Date updateTime;
	private Date createTime;
	private String dflwId;
	
	public String getSupernode() {
		return supernode;
	}
	public void setSupernode(String supernode) {
		this.supernode = supernode;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNodeName() {
		return nodeName;
	}
	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}
	public String getNodeId() {
		return nodeId;
	}
	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}
	public String getAssignee() {
		return assignee;
	}
	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}
	public Boolean getStates() {
		return states;
	}
	public void setStates(Boolean states) {
		this.states = states;
	}
	public String getNodeType() {
		return nodeType;
	}
	public void setNodeType(String nodeType) {
		this.nodeType = nodeType;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getDflwId() {
		return dflwId;
	}
	public void setDflwId(String dflwId) {
		this.dflwId = dflwId;
	}
	@Override
	public String toString() {
		return "CoustomProcessnode [id=" + id + ", nodeName=" + nodeName
				+ ", nodeId=" + nodeId + ", assignee=" + assignee
				+ ", supernode=" + supernode + ", states=" + states
				+ ", nodeType=" + nodeType + ", updateTime=" + updateTime
				+ ", createTime=" + createTime + ", dflwId=" + dflwId + "]";
	}


}