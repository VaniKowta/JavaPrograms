package com.wbl.FileHandling;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReplaceStringInFile {
public static void main(String[] args) throws IOException {
FileInputStream in = new FileInputStream("C:\\Users\\Home\\Desktop\\File.txt");
BufferedInputStream buffer = new BufferedInputStream(in);

Scanner scan = new Scanner(buffer);
String s1 = scan.nextLine();

 String rep = s1.replaceAll("Vani", "Pavani");
System.out.println("the string before replace: " + s1);
System.out.println("the string after replace: "+ rep);
scan.close();
}
}
