package com.saumitra.student;

public class StudentInfo {

	private String name;
	private int rollNo;
	private String branch;
	private String skill;
	
	public StudentInfo(String name,int rollNo,String branch, String skill) {
		this.name =  name;
		this.rollNo = rollNo;
		this.branch = branch;
		this.skill = skill;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	
}
