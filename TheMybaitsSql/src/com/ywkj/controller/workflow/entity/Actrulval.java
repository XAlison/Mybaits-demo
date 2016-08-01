package com.ywkj.controller.workflow.entity;

public class Actrulval {
private String id;
private String filedname;
private String fildValue;
private String procinstanceId;


@Override
public String toString() {
	return "Actrulval [id=" + id + ", filedname=" + filedname + ", fildValue="
			+ fildValue + ", procinstanceId=" + procinstanceId + "]";
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}

public String getFiledname() {
	return filedname;
}
public void setFiledname(String filedname) {
	this.filedname = filedname;
}
public String getFildValue() {
	return fildValue;
}
public void setFildValue(String fildValue) {
	this.fildValue = fildValue;
}
public String getProcinstanceId() {
	return procinstanceId;
}
public void setProcinstanceId(String procinstanceId) {
	this.procinstanceId = procinstanceId;
}

}
