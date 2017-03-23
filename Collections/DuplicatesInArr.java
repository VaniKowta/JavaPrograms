package wbl.com.Collections;

import java.util.HashSet;

public class DuplicatesInArr {

	public static void main(String[] args) {
		String[] str = {"Vani","Pavani","Sudha","Aparna","Vani","Madhu","Pavani"};
		HashSet<String> hs = new HashSet<String>();
	for(String s:str){
		 if(hs.add(s)==false){
		System.out.println("the duplicate elements in the Stringarray are:  "+ s);
}
}		
}
}