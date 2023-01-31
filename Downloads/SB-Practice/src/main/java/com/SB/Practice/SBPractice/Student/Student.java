package com.SB.Practice.SBPractice.Student;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
    @Column(name ="studentname")
	private String studentname;
    @Column(name="studentemail")
	private String studentemail;
    @Column(name="address")
	private String address;
	
	public Student() {
		super();
	}
	public Student(long id, String studentname, String studentemail, String address) {
		super();
		this.id = id;
		this.studentname = studentname;
		this.studentemail = studentemail;
		this.address = address;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentemail() {
		return studentemail;
	}
	public void setStudentemail(String studentemail) {
		this.studentemail = studentemail;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", studentname=" + studentname + ", studentemail=" + studentemail + ", address="
				+ address + "]";
	}
	
	
	
}
