package com.spring.learn.user;

public class Corporate {
	
	protected int corporateId;
	protected String userName;
	protected int oldICSNumber;
	protected String corporateType;
	protected String schemaName;
	protected String schemaNameType;
	protected String locationType;
	
	
	
	
	
	
	
	public Corporate(int i, String userName, int j, String corporateType, String schemaName,
			String schemaNameType, String locationType) {
		super();
		this.corporateId = i;
		this.userName = userName;
		this.oldICSNumber = j;
		this.corporateType = corporateType;
		this.schemaName = schemaName;
		this.schemaNameType = schemaNameType;
		this.locationType = locationType;
	}
	
	public int getCorporateId() {
		return corporateId;
	}
	public void setCorporateId(int corporateIId) {
		this.corporateId = corporateIId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getOldICSNumber() {
		return oldICSNumber;
	}
	public void setOldICSNumber(int oldICSNumber) {
		this.oldICSNumber = oldICSNumber;
	}
	public String getCorporateType() {
		return corporateType;
	}
	public void setCorporateType(String corporateType) {
		this.corporateType = corporateType;
	}
	public String getSchemaName() {
		return schemaName;
	}
	public void setSchemaName(String schemaName) {
		this.schemaName = schemaName;
	}
	public String getSchemaNameType() {
		return schemaNameType;
	}
	public void setSchemaNameType(String schemaNameType) {
		this.schemaNameType = schemaNameType;
	}
	public String getLocationType() {
		return locationType;
	}
	public void setLocationType(String locationType) {
		this.locationType = locationType;
	}

	

}
