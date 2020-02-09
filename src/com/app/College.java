package com.mzr.corejava1;

class Student {
	private static String institute;
	private int roll;
	private String name;
	
	public static String getInstitute() {
		return institute;
	}
	public static void setInstitute(String institute) {
		Student.institute = institute;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void display() {
		System.out.println("Institute\t:\t"+getInstitute());
		System.out.println("Roll\t\t:\t"+getRoll());
		System.out.println("Name\t\t:\t"+getName());
	}
}
public class College {

	public static void main(String[] args) {
		Student st = new Student();
		Student.setInstitute("Naresh IT");
		st.setRoll(1604);
		st.setName("Atiya Batool");
		st.display();
		

	}

}
