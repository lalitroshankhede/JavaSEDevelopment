package com.AccessModifierEx;

class Stud
{
	private int id=101;
	private String name="Rakesh R";
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

}

public class StudentTest {

	public static void main(String[] args) {

		Stud obj=new Stud();

		 System.out.println(obj.getId()+" "+obj.getName());
	}
}
