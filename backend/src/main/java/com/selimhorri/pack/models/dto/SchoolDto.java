package com.selimhorri.pack.models.dto;

import java.io.Serializable;

public class SchoolDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer schoolId;
	private String schoolName;
	private String schoolAdr;
	
	public SchoolDto() {
		
	}
	
	public SchoolDto(final String schoolName, final String schoolAdr) {
		this.schoolName = schoolName;
		this.schoolAdr = schoolAdr;
	}
	
	public SchoolDto(final Integer schoolId, final String schoolName, final String schoolAdr) {
		this.schoolId = schoolId;
		this.schoolName = schoolName;
		this.schoolAdr = schoolAdr;
	}
	
	@Override
	public String toString() {
		return "SchoolDto [schoolId=" + schoolId + ", schoolName=" + schoolName + ", schoolAdr=" + schoolAdr + "]";
	}
	
	public Integer getSchoolId() {
		return schoolId;
	}
	
	public void setSchoolId(Integer schoolId) {
		this.schoolId = schoolId;
	}
	
	public String getSchoolName() {
		return schoolName;
	}
	
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	public String getSchoolAdr() {
		return schoolAdr;
	}
	
	public void setSchoolAdr(String schoolAdr) {
		this.schoolAdr = schoolAdr;
	}
	
	
	
}
