package MTsir;

import java.util.*;

public class Student {
	private int rollNumber;
	private String name;
	private String course;
	private String dob;
	
	
	public int getRollNumber() {
		return rollNumber;
	}
	public String getName() {
		return name;
	}
	public String getCourse() {
		return course;
	}
	public String getDob() {
		return dob;
	}
	
	
	public void setName() {
		this.name=name;
	}
	public void setCourse() {
		this.course=course;
	}
	public void setRollNumber() {
		this.rollNumber=rollNumber;
	}
	public void setDob() {
		this.dob=dob;
	}
	
	
	Student(int rollNumber, String name, String course, String dob){
		this.rollNumber=rollNumber;
		this.name=name;
		this.course=course;
		this.dob=dob;
	}
	
	
	void StudentDetails() {
		System.out.println("Roll Number: "+this.rollNumber);
		System.out.println("Name: "+this.name);
		System.out.println("Course :"+this.course);
		System.out.println("DOB :"+this.dob);
	}
}
