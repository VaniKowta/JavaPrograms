package com.wbl.general;
public class Print1to10 {
	public void recurse(int n){
		if(n<=10){
			System.out.println(n);
			recurse(n+1);
			}
		}
		public static void main(String[] args) {
	Print1to10 p = new Print1to10();
	p.recurse(1);
	}

}