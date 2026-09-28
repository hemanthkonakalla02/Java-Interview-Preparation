package com.java.standard.edition.shadowingproblem;

public class Student 
{
	private int id;
	private String name;
	private String schoolName;
	private float marks;
	
	public Student()
	{
		
	}
	
	
	//shadowing problem
//	public Student(int id,String name,String schoolName,float marks)
//	{
//		id=id;
//		name=name;
//		schoolName=schoolName;
//		marks=marks;
//	}
	
	public Student(int id,String name,String schoolName,float marks)
	{
		this.id=id;
		this.name=name;
		this.schoolName=schoolName;
		this.marks=marks;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSchoolName() {
		return schoolName;
	}


	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}


	public float getMarks() {
		return marks;
	}


	public void setMarks(float marks) {
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", schoolName=" + schoolName + ", marks=" + marks + "]";
	}
	
	

}
