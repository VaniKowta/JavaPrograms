package com.wbl.FileHandling;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StringCountInFile {

   public static void countOccurenceOfString(String s){
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader("C:\\Users\\Vani\\Desktop\\Hello.txt"));
			int count=0;
			String str=br.readLine();
			while(str!=null){
						if(str.contains(s)){
					count++; 
					}
					str=br.readLine();
				
			}
		   System.out.println(count);
			

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}
	public static void main(String[] args) {
		countOccurenceOfString("hello");
	}
}
	


