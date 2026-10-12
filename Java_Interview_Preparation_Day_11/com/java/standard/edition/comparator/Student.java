package com.java.standard.edition.comparator;

public class Student 
{
	private int sid;
	private String name;
	private float marks;
	private String collegeName;
	
	public Student(int sid, String name, float marks, String collegeName) {
		super();
		this.sid = sid;
		this.name = name;
		this.marks = marks;
		this.collegeName = collegeName;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", marks=" + marks + ", collegeName=" + collegeName + "]";
	}

}
