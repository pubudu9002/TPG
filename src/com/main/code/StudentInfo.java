package com.main.code;

public class StudentInfo {

	private int id;
	private String fname;
	private double gpa;
	
	public StudentInfo(int id, String fname, double gpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.gpa = gpa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public String toString()
    {
        return id + " : " + fname;
    }
}
