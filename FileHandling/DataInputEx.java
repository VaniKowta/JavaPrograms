package com.wbl.FileHandling;
import java.io.DataInputStream;
import java.io.IOException;


public class DataInputEx {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		DataInputStream data = new DataInputStream(System.in);
System.out.println("Enter the first number: ");
String s1 = data.readLine();
int num1 = Integer.parseInt(s1);
System.out.println("Enter the second number: ");
String s2 = data.readLine();
int num2 = Integer.parseInt(s2);
int result = num1*num2;
System.out.println("the product of two given numbers is:" + result);

}
}