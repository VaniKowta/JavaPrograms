package wbl.com.ExceptionHandling;

import java.util.List;

public class NullPointerExc {
	private static String nullDemoValue;
	public static void main(String[] args){
		try{
			System.out.println(nullDemoValue.length());
			List<String> list = null;
			calculateInterest(list);
			
		}catch(NullPointerException e){
			System.out.println(e);
		}	
		finally{
			System.out.println("finally block");
		}
	}
	
	private static void calculateInterest(List<String> list){
		for(String str:list){
			System.out.println(str);		}
	}
}