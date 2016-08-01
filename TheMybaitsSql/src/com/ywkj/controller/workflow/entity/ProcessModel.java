package com.ywkj.controller.workflow.entity;

public class ProcessModel {

private String id;
private String assignee;
private String nodeid;
private String nodename;
private String dflwid;
private String flowname ;
private String sequenceflowid; 
private String sequencename;
private String targetnode; 
private String sourenode ;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getAssignee() {
	return assignee;
}
public void setAssignee(String assignee) {
	this.assignee = assignee;
}
public String getNodeid() {
	return nodeid;
}
public void setNodeid(String nodeid) {
	this.nodeid = nodeid;
}
public String getNodename() {
	return nodename;
}
public void setNodename(String nodename) {
	this.nodename = nodename;
}
public String getDflwid() {
	return dflwid;
}
public void setDflwid(String dflwid) {
	this.dflwid = dflwid;
}
public String getFlowname() {
	return flowname;
}
public void setFlowname(String flowname) {
	this.flowname = flowname;
}
public String getSequenceflowid() {
	return sequenceflowid;
}
public void setSequenceflowid(String sequenceflowid) {
	this.sequenceflowid = sequenceflowid;
}
public String getSequencename() {
	return sequencename;
}
public void setSequencename(String sequencename) {
	this.sequencename = sequencename;
}
public String getTargetnode() {
	return targetnode;
}
public void setTargetnode(String targetnode) {
	this.targetnode = targetnode;
}
public String getSourenode() {
	return sourenode;
}
public void setSourenode(String sourenode) {
	this.sourenode = sourenode;
}
@Override
public String toString() {
	return "ProcessModel [id=" + id + ", assignee=" + assignee + ", nodeid="
			+ nodeid + ", nodename=" + nodename + ", dflwid=" + dflwid
			+ ", flowname=" + flowname + ", sequenceflowid=" + sequenceflowid
			+ ", sequencename=" + sequencename + ", targetnode=" + targetnode
			+ ", sourenode=" + sourenode + "]";
}


}
