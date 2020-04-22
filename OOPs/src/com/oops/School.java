package com.oops;

public class School {

	public static void main(String[] args) 
	{
		Student obj = new Student();
		obj.setRollNo(10);
		obj.setName("Jayant");
		obj.setMarks(40);
		obj.setAge(20);
		obj.write("as");
		
		double percent = obj.getPercent();
		System.out.println(percent);
		
		System.out.println(obj.getName());
		
		Teacher obj1 = new Teacher();
		obj1.seteId(1);
		obj1.setName("Kalpana");
		obj1.setAge(50);
		obj1.setSalary(200000);
		obj1.write();
		
		int asal = obj1.annualSalary();
		System.out.println(asal);
		
	}

}
