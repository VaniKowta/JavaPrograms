package com.wbl.general;
public class AccessModifierDemo {

	public static void main(String[] args) {
		AccessModifier ob = new AccessModifier();
		//ob.testPrivate() --- not accessible 
		ob.testDefault();
		ob.testProtected();
		ob.testPubic();

	}

}