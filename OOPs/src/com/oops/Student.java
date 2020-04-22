package com.oops;

public class Student extends Humans{

	private int rollNo;
	private int marks;
	
	
	
	
	// creating a method to only receive positive marks 
	
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	public int getMarks() {
		return marks;
	}

	public void setMarks(int m) {
		if(m >= 0) 
			marks = m;
			else 
				marks = 0;
		
	}
	
	// adding a method to get percent
	public double getPercent() {
		return (marks*1.0/75) * 100;
	}
	
	public void write () {
		System.out.println("I am writing and reading");
	}
	
	public void write(String assign) {
		System.out.println("I am reading now");
	}
}

	