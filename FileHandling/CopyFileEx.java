package com.wbl.FileHandling;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyFileEx {
	public static void main(String[] args)   {
File file  = new File("C:\\Users\\Home\\Desktop\\File.txt");
File copyfile = new File("C:\\Users\\Home\\Desktop\\File1.txt");

BufferedReader reader;
PrintWriter writer;

String line;

try{
	
	
	if(copyfile.createNewFile() || !copyfile.createNewFile()){
		reader = new BufferedReader(new FileReader(file));
		writer = new PrintWriter(new FileWriter(copyfile));
		
		while((line = reader.readLine()) != null){
		writer.println(line);
		}		
			reader.close();
			writer.close();	
	}
}catch(IOException ioEx){
	
	System.out.println("I could not copy a file to the destination directory");
	
}
}
}
