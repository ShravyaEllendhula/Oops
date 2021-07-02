package com.java.Constructor;

public class SuperClass_chaining
{
	int EId;
	String Ename;
	public SuperClass_chaining(int Eid, String Ename)
	{
		 this.EId=Eid;
		 this.Ename=Ename;
	}
	@Override
	public String toString() {
		return "SuperClass_details:  [EId=" + EId + ", Ename=" + Ename + "]";
	}
	
}
