package com.ywkj.controller.workflow.entity;

import java.util.List;
import java.util.Map;

import com.demo.test.TableInformation;

public interface Iflowmapper {
	/**
	 * 获取自动以流程信息
	 * 
	 * @param dflwId
	 *            流程唯一标识id
	 * @return
	 */
	public CoustomDeployment GetCoustomDeploymentList(String dflwId);

	/**
	 * 添加流程信息
	 * 
	 * @param dflwId
	 *            流程唯一标识id
	 * @return
	 */
	public int AddCoustomDeployment(CoustomDeployment c1);

	/**
	 * 更新修改流程名称
	 * 
	 * @param dflwId
	 *            流程唯一标识id
	 * @return
	 */
	public int UpdateCoustomDeployment(CoustomDeployment c1);

	/**
	 * 添加节点信息
	 * 
	 * @param c1
	 *            节点对象
	 * @return
	 */
	public int AddCoustomProcessnode(CoustomProcessnode c1);

	/**
	 * 添加连接线信息
	 * 
	 * @param c1
	 *            连接线对象
	 * @return
	 */
	public int AddCoustomSequence(CoustomSequence c1);

	/**
	 * 节点条件信息添加
	 * 
	 * @param c1
	 *            条件对象
	 * @return
	 */
	public int AddCondition(CoustomCondition c1);

	/**
	 * 获取连接线条件设定值
	 * 
	 * @param sequenceFlowId
	 *            连接线唯一ID
	 * @return
	 */
	public List<CoustomCondition> GetCoustomCondition(String sequenceFlowId);

	/**
	 * 删除条件信息
	 * 
	 * @param c1
	 * @return
	 */
	public int UpdateCoustomCondition(CoustomCondition c1);
	
	
	public int updateSequenceflowAndNodeA(CoustomSequence c1);
	
	public int updateSequenceflowAndNodeB(CoustomSequence c1);
	
	
	public CoustomSequence GetSequenceflowid(CoustomSequence c1);
	
	public List<CoustomProcessnode> GetCoustomprocessNodeByconditions(CoustomProcessnode c1);

	
	public List<CoustomProcessnode> GetCoustomprocessNodeChildNode(CoustomProcessnode c1);

	public List<CoustomProcessnode> GetCoustomprocessNodeParentchidNode(CoustomProcessnode c1);

	public List<CoustomSequence> GetFlowDataByParentID( Map<String,Object> mp);

	public List<ProcessModel> GetFlowProcessModel( Map<String,Object> mp);

	public int DupdatesequenceNodeaction(CoustomSequence c1);
	
	public int DupdateprocessnodeNodeaction(CoustomSequence c1);
	
	public List<CoustomSequence> GetflowsoureNode(CoustomSequence c1);
	public List<CoustomSequence> GetflowTargetNode(CoustomSequence c1);
	
	public User selectUserByID(int id);

	public List<User> selectUsersByName(String userName);

	public void addUser(User user);

	public void updateUser(User user);

	public void deleteUser(int id);
	
	
	//获取流程的第一个节点信息
	public CoustomProcessnode GetFirstProcessNode(String dflwId);
	//获取下一级节点信息  soureNode dflwId
	public List<CoustomSequence> GetAllsequenceflow(Map<String,Object> mp);
	//获取指定节点的信息 nodeId dflwId
	public CoustomProcessnode GetnowNode(Map<String,Object> mp);
	public List<CoustomProcessnode> GetAllCoustomprocessNode(String Flow_ID);
	public List<Actrulval> GetAllNodeActrulval(String procinstanceId);

	
	public List<Map<String,Object>> GettargetData(Map<String,Object> mp);  
	public List<TableInformation> GetTableInformation(Map<String, Object> mp );
	public List<Map<String,Object>>  GetConditionalValue(Map<String,Object> mp); 

	
	public List<String>	GetConditionalValuefiled(Map<String,Object> mp);
	
	
	
	
	
	
	
	
	
	
	
	public void  batchUpdate(List<String> list);
}
