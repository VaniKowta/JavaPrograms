package wbl.assignment.Strings;
import java.util.Scanner;
public class PalindromeString {
	public static void main(String[] args) {
		String s;
		String rev = "";
		System.out.println("Enter the string: ");
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		for(int i =s.length()-1;i>=0;i--){
			rev = rev+s.charAt(i);
		}
		sc.close();
		if(s.equals(rev)){
			System.out.println("the string is Palindrome");
		}else{
			System.out.println("the string is not a Palindrome");
		}
}
}
