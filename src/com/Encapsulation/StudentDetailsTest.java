package com.Encapsulation;

class StudDetails
{
	private int studRoll=101;
	private String studName;
	private String city;
	
	
	public int getStudRoll() {
		return studRoll;
	}
	 
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}

public class StudentDetailsTest {

	public static void main(String[] args) {
		
		StudDetails obj=new StudDetails();
		obj.setStudName("Kishan Jaiswal");
		obj.setCity("Bihar, Uttar Paradesh");
		
		System.out.println("Roll no : "+obj.getStudRoll()+" "+"Name : "+obj.getStudName()+" "+"City : "+obj.getCity());
		
	}
	
}
