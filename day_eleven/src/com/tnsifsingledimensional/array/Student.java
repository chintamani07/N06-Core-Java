//program to demonstrate on array of objects
package com.tnsifsingledimensional.array;
//class declaration
public class Student {
//	private data members
	private int id;
	private String name;
	private float percentage;
//	getters and setters
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
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
//	parameterized constructor
	public Student(int i, String string, float f) {
	}
}