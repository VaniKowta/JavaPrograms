package wbl.assignment.Strings;


public class Substring {
	public static void getSubString(String s,String s1,String s2){
		String xyz = null;
		if (s.contains(s1)){
			xyz = s.replace(s1, s2);
					
		System.out.println(xyz);
		
	} else {System.out.println("no substring found");
		
	}
}

	public static void main(String[] args) {
		String s="my name is VaniPrakki";
		String s1="name";
		String s2="Fullname";
		
		getSubString(s,s1,s2);
	}

}
