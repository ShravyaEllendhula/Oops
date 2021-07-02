package com.java.Inheritance;

public class WatchClass extends WatchShowRoom
{
	String watchFor;
	public WatchClass(String wbrand, String wtype, String wcolor, String wcost,String watchFor) 
	{
		super(wbrand, wtype, wcolor, wcost);
		this.watchFor=watchFor;
	}
	
	@Override
	public String toString()
	{
		return "WatchClass [watchFor=" + watchFor + ", Wbrand=" + Wbrand + ", Wtype=" + Wtype + ", Wcolor=" + Wcolor
				+ ", Wcost=" + Wcost + "]";
	}

	public static void main(String[] args) 
	{
		WatchClass watchClass1=new WatchClass("Titan", "Wrist-watch", "silver", "12000","women");
		WatchClass watchClass2=new WatchClass("rolex", "Wrist-watch", "ash", "1.2L","men");
		WatchClass watchClass3=new WatchClass("Fastrack", "Wrist-digital-watch", "block", "4000","men");
		WatchClass watchClass4=new WatchClass("normal-brand", "wall-clock", "blue", "1200","home");
		System.out.println(watchClass1);
		System.out.println(watchClass2);
		System.out.println(watchClass3);
		System.out.println(watchClass4);
		
	}
}
