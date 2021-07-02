package com.java.Inheritance;

public class WatchShowRoom
{
	String Wbrand;
	String Wtype;
	String Wcolor;
	String Wcost;
	public WatchShowRoom(String wbrand,String wtype, String wcolor, String wcost)
	{
		this.Wbrand=wbrand;
		this.Wtype = wtype;
		this.Wcolor = wcolor;
		this.Wcost = wcost;
	}
	@Override
	public String toString() 
	{
		return "WatchShowRoom [Wbrand=" + Wbrand + ", Wtype=" + Wtype + ", Wcolor=" + Wcolor + ", Wcost=" + Wcost + "]";
	}
	
}
