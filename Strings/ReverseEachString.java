package wbl.assignment.Strings;

import java.util.Scanner;

public class ReverseEachString {
	 public static void main(String[] args) {
	        
		    String original,reverse = "";
		    Scanner st = new Scanner(System.in);
		    
		    System.out.print("Enter a String to reverse  : ");
		    original = st.nextLine();
		    String[]  words = original.split(" ");
		    st.close();
		    for(int i = 0;i<words.length ; i++){
		       
		        for(int j=words[i].length()-1 ; j>=0;j--){
		            reverse = reverse + words[i].charAt(j);
		        }
		        reverse = reverse + " ";
		    }System.out.print(" The reversed word in each String : " + reverse  );

		    } 
		    
		}

