package wbl.assignment.Strings;

import java.util.Stack;
import java.util.HashMap;


public class BalancedParenthesis {


	public boolean checkString(String s){


		HashMap<Character,Character> map = new HashMap<Character,Character>();
		map.put('(', ')');
		map.put('{', '}');
		map.put('[', ']');


		Stack<Character> stack = new Stack<Character>();
		char[] charArray = s.toCharArray();
		for(Character c :charArray){
			if(map.keySet().contains(c)){
				stack.push(c);
			}else
				if(map.values().contains(c)){
					if(!stack.isEmpty() && map.get(stack.peek())==c){
						stack.pop();
					}
					else 
						return false;
				}
		}
		
		return stack.isEmpty();
	}
	public static void main(String[] args){
		String s = "[()]{}{[()()]()";

		BalancedParenthesis bp = new BalancedParenthesis();
		boolean flag = bp.checkString(s);
		if(flag==true)
			System.out.println("Valid string");
		else
			System.out.println("Invalid string");


	}


}


