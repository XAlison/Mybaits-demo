package com.demo.test;

import java.lang.reflect.Field;

public class GenerateSql_Util {
	/****
	 * 
	 * INSERT INTO table(field1,field2) VALUES('value1','value2');
	 * 
	 * @param obj
	 *            传入要生成的实体，需与数据库表的字段一致
	 * 
	 * @return 拼成的insert 语句
	 */

	public static String SqlInset(Object obj) {

		try {

			Class<? extends Object> c = obj.getClass();
			// 获取所有的字段
			Field[] fields = c.getDeclaredFields();
			// 获取实体的类名，需与表名一致
			String tableName = c.getSimpleName();
			// 生成INSERT INTO table(field1,field2) 部分
			StringBuffer sbField = new StringBuffer();
			// 生成VALUES('value1','value2') 部分
			StringBuffer sbValue = new StringBuffer();
			sbField.append("INSERT INTO " + tableName.toLowerCase() + "(");
			int fieldLength = fields.length;
			for (int i = 0; i < fieldLength; i++) {
				fields[i].setAccessible(true);
				sbField.append(fields[i].getName().toLowerCase() + ',');
				sbValue.append("'" + fields[i].get(obj).toString() + "',");
			}
			return sbField
					.replace(sbField.length() - 1, sbField.length(),
							") VALUES(")
					.append(sbValue.replace(sbValue.length() - 1,
							sbValue.length(), ");")).toString();
		} catch (IllegalAccessException e1) {

			e1.printStackTrace();

		}

		return null;

	}

}
