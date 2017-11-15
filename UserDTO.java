/*
 * @(#)UserDTO.java version 1.0 11-01-2012
 * Copyright (c) 2011 Bytech.
 */
package cl.sodexo.tarjeta.dto;

import java.util.Date;

//import javax.jws.WebParam;
//import javax.xml.ws.Holder;

/**
 * <p>
 * Title: UserDTO.java
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author : Mat�as Silva Vald�s
 * @since : JDK 1.6_26
 * @version : 1.0
 * @date : 11-01-2012
 * @time : 15:12:09
 */
public class UserDTO {
	private String fiscalId;
	private String name;
	private String userEmail;
	private String userPhoneNumber;
	private String companyFiscalId;
	
	
	private String fantasyName;
	
	private Date lastLogin;
	private Long lastVersion;

	public String getFiscalId() {
		return fiscalId;
	}

	public void setFiscalId(String fiscalId) {
		this.fiscalId = fiscalId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPhoneNumber() {
		return userPhoneNumber;
	}

	public void setUserPhoneNumber(String userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}

	public String getCompanyFiscalId() {
		return companyFiscalId;
	}

	public void setCompanyFiscalId(String companyFiscalId) {
		this.companyFiscalId = companyFiscalId;
	}

	/**
	 * @return the fantasyName
	 */
	public String getFantasyName() {
		return fantasyName;
	}

	/**
	 * @param fantasyName the fantasyName to set
	 */
	public void setFantasyName(String fantasyName) {
		this.fantasyName = fantasyName;
	}

	/**
	 * @return the lastLogin
	 */
	public Date getLastLogin() {
		return lastLogin;
	}

	/**
	 * @param lastLogin the lastLogin to set
	 */
	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	public Long getLastVersion() {
		return lastVersion;
	}

	public void setLastVersion(Long lastVersion) {
		this.lastVersion = lastVersion;
	}
	
	
}
