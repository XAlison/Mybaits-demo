package com.demo.test;

import net.sf.json.JSONObject;

public class testmain {
	public static Object getDTO(String jsonString, Class clazz){ 
		JSONObject jsonObject = null; 
		try{ 
			
		jsonObject = JSONObject.fromObject(jsonString); 
		}catch(Exception e){ 
		e.printStackTrace(); 
		} 
		return JSONObject.toBean(jsonObject, clazz); 
		} 

	public static void main(String[] args) {
		
		// 假设你有一个JSON string
		String s = "{'name':'Zara', 'shelf':'5'}";
		JSONObject obj=JSONObject.fromObject(s);
	   
	        
	     Object m = JSONObject.toBean(obj);
		/* = data.toBean(arg0);*/
		/*person p=new person();
		p.setId("1");
		p.setPassword("v1");
		p.setUsername("v2");*/
		String sql=GenerateSql_Util.SqlInset(m);
		System.err.println(sql);
	}

}
