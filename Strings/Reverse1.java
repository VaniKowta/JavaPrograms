package wbl.assignment.Strings;

public class Reverse1{

	public void rev(){
		String result = "";
		String str ="vani";
		for(int i=str.length()-1;i>=0;i--)	{
			result = result + str.charAt(i);	
		}
		System.out.println(result);	

	}
	public static void main(String[] args){

		Reverse1 r = new Reverse1();
		r.rev();
	}
}


