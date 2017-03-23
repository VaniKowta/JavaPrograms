package com.wbl.general;

public class ExplicitGarbage {
	
	public void finalize(){
		System.out.println("Object is Garbage collected");
	}
	public static void main(String[] args) {
		ExplicitGarbage e1 = new ExplicitGarbage();
		ExplicitGarbage e2 = new ExplicitGarbage();
		e1=null;
		e2=null;
       System.gc();
	}
}