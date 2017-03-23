package wbl.assignment.Loops;

public class Factorial {
	public void getFactorial(int input){
		int fact=1;
		for (int i=input;i>=1;i--){
			fact= fact*i;
		}
		
		System.out.println("factorial of  number "+input +" is: "+fact);
	}
	
  public int factrecursion(int n){
		  	if (n==0){
	  		return 1;
	  	}else {
	  		return n*factrecursion(n-1);
	  	}
	  
  }

	public static void main(String[] args) {
		Factorial f=new Factorial();
		f.getFactorial(7);
		System.out.println(f.factrecursion(5));

	}
}
