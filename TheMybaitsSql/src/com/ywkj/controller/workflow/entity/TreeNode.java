package com.ywkj.controller.workflow.entity;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
	private String id;
	private String name;
	private String parentid;
	private List nodes = new ArrayList();
	 
	public TreeNode() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParentid() {
		return parentid;
	}

	public void setParentid(String parentid) {
		this.parentid = parentid;
	}

	public List getNodes() {
		return nodes;
	}

	public void setNodes(List nodes) {
		this.nodes = nodes;
	}
	 
}
