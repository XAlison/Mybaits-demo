package com.demo.test;

public class TableInformation {
	private String TABLE_NAME;
	private String COLUMN_NAME;
	private String ORDINAL_POSITION;
	private String IS_NULLABLE;
	private String DATA_TYPE;
	private String CHARACTER_MAXIMUM_LENGTH;
	private String COLUMN_COMMENT;
	private String COLUMN_KEY ;

	@Override
	public String toString() {
		return "TableInformation [TABLE_NAME=" + TABLE_NAME + ", COLUMN_NAME="
				+ COLUMN_NAME + ", ORDINAL_POSITION=" + ORDINAL_POSITION
				+ ", IS_NULLABLE=" + IS_NULLABLE + ", DATA_TYPE=" + DATA_TYPE
				+ ", CHARACTER_MAXIMUM_LENGTH=" + CHARACTER_MAXIMUM_LENGTH
				+ ", COLUMN_COMMENT=" + COLUMN_COMMENT + ", COLUMN_KEY="
				+ COLUMN_KEY + "]";
	}
	public String getCOLUMN_KEY() {
		return COLUMN_KEY;
	}
	public void setCOLUMN_KEY(String cOLUMN_KEY) {
		COLUMN_KEY = cOLUMN_KEY;
	}
	public String getTABLE_NAME() {
		return TABLE_NAME;
	}
	public void setTABLE_NAME(String tABLE_NAME) {
		TABLE_NAME = tABLE_NAME;
	}
	public String getCOLUMN_NAME() {
		return COLUMN_NAME;
	}
	public void setCOLUMN_NAME(String cOLUMN_NAME) {
		COLUMN_NAME = cOLUMN_NAME;
	}
	public String getORDINAL_POSITION() {
		return ORDINAL_POSITION;
	}
	public void setORDINAL_POSITION(String oRDINAL_POSITION) {
		ORDINAL_POSITION = oRDINAL_POSITION;
	}
	public String getIS_NULLABLE() {
		return IS_NULLABLE;
	}
	public void setIS_NULLABLE(String iS_NULLABLE) {
		IS_NULLABLE = iS_NULLABLE;
	}
	public String getDATA_TYPE() {
		return DATA_TYPE;
	}
	public void setDATA_TYPE(String dATA_TYPE) {
		DATA_TYPE = dATA_TYPE;
	}
	public String getCHARACTER_MAXIMUM_LENGTH() {
		return CHARACTER_MAXIMUM_LENGTH;
	}
	public void setCHARACTER_MAXIMUM_LENGTH(String cHARACTER_MAXIMUM_LENGTH) {
		CHARACTER_MAXIMUM_LENGTH = cHARACTER_MAXIMUM_LENGTH;
	}
	public String getCOLUMN_COMMENT() {
		return COLUMN_COMMENT;
	}
	public void setCOLUMN_COMMENT(String cOLUMN_COMMENT) {
		COLUMN_COMMENT = cOLUMN_COMMENT;
	}
	
}
