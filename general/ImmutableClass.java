package com.wbl.general;


import java.util.Date;

//1.declare class as final,so that no class can extend this class and change the values

//2.make all instance variables are as private and final. so that no one can change the value of variables
public final class ImmutableClass {
	
private final Integer immutableField1;
private final String immutableField2;
private final Date mutableField1;
//to initialize the values,create constructor,so that the state cannot change
public ImmutableClass(Integer immutableField1,String immutableField2,Date date){
	this.immutableField1 = immutableField1;
	this.immutableField2 = immutableField2;
	this.mutableField1 = new Date(date.getTime());//always create new instance for mutable objects
}
//Integer class is Immutable by default...therefore no setters method,only getters method
public Integer getimmutableField1(){
	return immutableField1;
}
//similarly String class by default  Immutable class...therefore we provide only getters method
public String getimmutableField2(){
	return immutableField2;
}
//but instance variable is from mutable class,we have to take special care
//these class have their own setters methods to change the state of the object
//Date is a mutable class
public  Date getmutableField1(){
	//return mutableField1; dont do this,as it can return Date to caller method,where client can change its state
	return new Date(mutableField1.getTime());
}


}