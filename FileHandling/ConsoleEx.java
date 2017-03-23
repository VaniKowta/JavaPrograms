package com.wbl.FileHandling;
import java.io.Console;

	public class ConsoleEx {
		public static void main(String[] args) {
			Console c= System.console();
			System.out.println("Enter first number");
			String f=c.readLine();
			System.out.println("Enter Second number");
			String s=c.readLine();
			System.out.println(Integer.parseInt(f)/Integer.parseInt(s));
		}	  

	}


