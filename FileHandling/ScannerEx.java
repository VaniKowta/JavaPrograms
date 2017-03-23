package com.wbl.FileHandling;
import java.util.Scanner;

public class ScannerEx {
			public static void Scan(){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the first number");
			int num1 = sc.nextInt();
			System.out.println("Enter the second number");
			int num2 = sc.nextInt();
			int sum = num1+num2;
			System.out.println("the sum of the two numbers is:"+sum);
				
			sc.close();
		}
		public static void main(String[] args) {
			ScannerEx.Scan();
		}
		
	}

