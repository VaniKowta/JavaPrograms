package com.wbl.general;
public class FlowOfExecutionEx {
	int a = 10;  //    local variable
	static int b = 20;   //static variable

	static void m1(String str){             //static method
		System.out.println("Static method");
	}
	public void m2(int a){                       //instance method
		System.out.println("instance method");
	}
	{
		System.out.println("instance block");    //instance block
	}
	static{
		System.out.println("static block");
		System.out.println(FlowOfExecutionEx.b);  //static block
	}
	public void  FlowofExecutionEx(int a){           //parameterised constructor
		System.out.println("parameterised constructor");
	}
	public static void main(String[] args) {
		FlowOfExecutionEx obj = new FlowOfExecutionEx();
		FlowOfExecutionEx.m1("hello");
		obj.m2(6);
	}

}