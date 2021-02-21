package com.selimhorri.pack.models.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "schools")
public final class School implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "school_id")
	private Integer schoolId;
	
	@Column(name = "school_name")
	private String schoolName;
	
	@Column(name = "school_adr")
	private String schoolAdr;
	
	@OneToMany(mappedBy = "school", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Student> students;
	
	public School() {
		
	}
	
	public School(final String schoolName, final String schoolAdr) {
		this.schoolName = schoolName;
		this.schoolAdr = schoolAdr;
	}
	
	public School(final Integer schoolId, final String schoolName, final String schoolAdr) {
		this.schoolId = schoolId;
		this.schoolName = schoolName;
		this.schoolAdr = schoolAdr;
	}
	
	@Override
	public String toString() {
		return "School [schoolId=" + schoolId + ", schoolName=" + schoolName + ", schoolAdr=" + schoolAdr + "]";
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








