package com.ywkj.controller.workflow.entity;

/**
 * 
 * @author Alison
 * userTaskName 用户节点名称
 * userTaskId 用户节点id
 * assignee 任务用户
 * candidateUsers任务的候选者
 * candidateGroups组候选者
 */
public class userTask {
 private String userTaskName;
 private String userTaskId;
 private String assignee;
 private String candidateUsers;
 private String candidateGroups;
public String getUserTaskName() {
	return userTaskName;
}
public void setUserTaskName(String userTaskName) {
	this.userTaskName = userTaskName;
}
public String getUserTaskId() {
	return userTaskId;
}
public void setUserTaskId(String userTaskId) {
	this.userTaskId = userTaskId;
}
public String getAssignee() {
	return assignee;
}
public void setAssignee(String assignee) {
	this.assignee = assignee;
}
public String getCandidateUsers() {
	return candidateUsers;
}
public void setCandidateUsers(String candidateUsers) {
	this.candidateUsers = candidateUsers;
}
public String getCandidateGroups() {
	return candidateGroups;
}
public void setCandidateGroups(String candidateGroups) {
	this.candidateGroups = candidateGroups;
}

 
}
