package com.wbl.FileHandling;

import java.io.File;

public class FileListsEx {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\Home\\Desktop\\File.txt");
		File[] files = file.listFiles();//returns array
		//to display list of file names
		System.out.println("The list of files in the folder is: ");

		for(File f:files){
		System.out.println( f.getName());
}
}
}