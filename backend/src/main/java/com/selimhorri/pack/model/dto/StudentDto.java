package com.selimhorri.pack.model.dto;

import java.io.Serializable;

public class StudentDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer studentId;
	private String firstName;
	private String lastName;
	private String enterDate;
	private String email;
	private String phone;
	private Integer schoolId;
	
	public StudentDto() {
		
	}
	
	public StudentDto(String firstName, String lastName, String enterDate, String email, String phone, Integer schoolId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.enterDate = enterDate;
		this.email = email;
		this.phone = phone;
		this.schoolId = schoolId;
	}

	public StudentDto(Integer studentId, String firstName, String lastName, String enterDate, String email,
			String phone, Integer schoolId) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.enterDate = enterDate;
		this.email = email;
		this.phone = phone;
		this.schoolId = schoolId;
	}
	
	@Override
	public String toString() {
		return "StudentDto [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", enterDate=" + enterDate + ", email=" + email + ", phone=" + phone + ", schoolId=" + schoolId + "]";
	}
	
	public Integer getStudentId() {
		return studentId;
	}
	
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEnterDate() {
		return enterDate;
	}
	
	public void setEnterDate(String enterDate) {
		this.enterDate = enterDate;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public Integer getSchoolId() {
		return schoolId;
	}
	
	public void setSchoolId(Integer schoolId) {
		this.schoolId = schoolId;
	}
	
	
	
}







