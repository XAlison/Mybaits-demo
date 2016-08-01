package com.ywkj.controller.workflow.entity;


public class CoustomSequence{

	// Fields

	private int id;
	private String sequenceFlowId;
	private String dflwId;
	private String sequenceName;
	private String targetNode;
	private String soureNode;
	private String description;
	private Boolean status;
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
	public String getDflwId() {
		return dflwId;
	}
	public void setDflwId(String dflwId) {
		this.dflwId = dflwId;
	}

	public String getSequenceName() {
		return sequenceName;
	}
	public void setSequenceName(String sequenceName) {
		this.sequenceName = sequenceName;
	}
	public String getTargetNode() {
		return targetNode;
	}
	public void setTargetNode(String targetNode) {
		this.targetNode = targetNode;
	}
	public String getSoureNode() {
		return soureNode;
	}
	public void setSoureNode(String soureNode) {
		this.soureNode = soureNode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "CoustomSequence [id=" + id + ", sequenceFlowId="
				+ sequenceFlowId + ", dflwId=" + dflwId + ", sequenceName="
				+ sequenceName + ", targetNode=" + targetNode + ", soureNode="
				+ soureNode + ", description=" + description + ", status="
				+ status + "]";
	}

	

}