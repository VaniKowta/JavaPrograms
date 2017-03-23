package com.wbl.general;

public class AccessModifier {
	   
	 private void testPrivate(){
		 System.out.println("Test method for Private AccessModifier");
	 }
	
	 void testDefault(){
		 System.out.println("Test method for Default AccessModifier");
	 }
	 
	protected void testProtected(){
		 System.out.println("Test method for Protected AccessModifier");
	 }
	 
	public void testPubic(){
		System.out.println("Test method for Public AccessModifier");
	}
	 
	 
	public static void main(String[] args) {
		AccessModifier ob=new AccessModifier();
		ob.testPrivate();
		ob.testDefault();
		ob.testProtected();
		ob.testPubic();
		

	}

}