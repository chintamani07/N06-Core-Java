package org.tnsif.multilevelinheritance;
//child class(B)
public class TeamMember extends TeamLead {
//	private data members
	private int size, duration;
//	parameterized constructor
	public TeamMember(String deptName, String name, int empID, String leadName, String projectName, int size, int duration)
	{
		super(deptName, name, empID, leadName, projectName);
		this.size=size;
		this.duration=duration;
	}
//	toString() method
	@Override
	public String toString() {
		return "MultiLevelInheritenceExecutor [size=" + size + ", duration=" + duration + ", toString()="
				+ super.toString() + "]";
	}
}