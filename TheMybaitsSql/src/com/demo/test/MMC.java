package com.demo.test;

import java.io.Reader;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.executor.BatchExecutor;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.managed.ManagedTransactionFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ywkj.controller.workflow.entity.Actrulval;
import com.ywkj.controller.workflow.entity.CoustomCondition;
import com.ywkj.controller.workflow.entity.CoustomDeployment;
import com.ywkj.controller.workflow.entity.CoustomProcessnode;
import com.ywkj.controller.workflow.entity.CoustomSequence;
import com.ywkj.controller.workflow.entity.Iflowmapper;

public class MMC {

	static SqlSession session = null;

	public static SqlSession GetSqlSession() {
		String path = "com/demo/map/MyBatisConfig.xml";

		try {
			Reader reader = Resources.getResourceAsReader(path);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
					.build(reader);
			session = sqlSessionFactory.openSession();
			return session;
		} catch (Exception e) {
			e.printStackTrace();
			return session;
		}
	}
	
	
	
	
	
	
	

	public static void main(String[] args) throws SQLException,
			JsonProcessingException {
String temp="sid-ff97fd393cad33ce4f8ad5d15dba8044";
System.err.println(temp.substring(4, temp.length()));
		/*session = GetSqlSession();
		Iflowmapper userDao = session.getMapper(Iflowmapper.class);
		Map<String, Object> mp = new HashMap<String, Object>();
		mp.put("tablename", "custom_form_sidff97fd393cad33ce4f8ad5d15dba8044");
		mp.put("ProcessInstanceId", "675001");
		mp.put("flowkey", "sid-FF97FD39-3CAD-33CE-4F8A-D5D15DBA8044");
		List<Map<String, Object>> obj = userDao.GetConditionalValue(mp);
		//获取到设置条件的字段
		List<String> filed = userDao.GetConditionalValuefiled(mp);
		Map<String, Object> m1= new HashMap<String, Object>();
		//获取当前表记录
		for (Map<String, Object> temp : obj) {
			for (String k : temp.keySet())  
		      {  
				for (String temp1 : filed) {
					//判断设置条件的字段，并获取值
					if(k.equals(temp1))
					{
						m1.put(k ,  temp.get(k));
						System.out.println(k + " : " + temp.get(k));  
					}
				}
		      }  	
		}
	
		
		for (String key : m1.keySet()) {
			   System.out.println("key= "+ key + " and value= " + m1.get(key));
			  }*/
		
		
		
		/*
		 * // 获取表列名 List<String> list = new ArrayList<String>(); List<String>
		 * list1 = new ArrayList<String>();
		 * 
		 * ObjectMapper mapper = new ObjectMapper();
		 * 
		 * mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
		 * String json = mapper.writeValueAsString(list0);
		 * System.err.println(json); List<String> sql1 = new
		 * ArrayList<String>(); for (int i = 4; i < 5; i++) { sql1.add("'" + 1 +
		 * i + "" + "'"); sql1.add("'" + 1 + i + "" + "'"); sql1.add("'" + 1 + i
		 * + "" + "'"); sql1.add("'" + 1 + i + "" + "'"); }
		 * 
		 * String filed = StringUtils.join(list.toArray(), ","); String
		 * filedvalue = StringUtils.join(sql1.toArray(), ",");
		 * 
		 * StringBuffer excuteSql = new StringBuffer();
		 * excuteSql.append("").append(" ").append("test").append(" ( ")
		 * .append(filed).append(" ) ").append(" VALUES").append(" ( ")
		 * .append(filedvalue).append(" ) ");
		 * System.out.println(excuteSql.toString()); System.err.println(filed);
		 * 
		 * List<String> sql2 = new ArrayList<String>();
		 * sql2.add(excuteSql.toString());
		 * 
		 * List<String> mp1 = new ArrayList<String>();
		 * mp1.add(excuteSql.toString()); userDao.batchUpdate(mp1);
		 */

		/*
		 * Configuration c= session.getConfiguration();
		 * ManagedTransactionFactory managedTransactionFactory = new
		 * ManagedTransactionFactory(); BatchExecutor batchExecutor=new
		 * BatchExecutor
		 * (c,managedTransactionFactory.newTransaction(session.getConnection
		 * ())); int i = 0;
		 * 
		 * List<String> sql = new ArrayList<String>();
		 * sql.add(excuteSql.toString()); for (String entity : sql) {
		 * batchExecutor.update(null,entity); }
		 * batchExecutor.doFlushStatements(true);
		 */
	}

}
