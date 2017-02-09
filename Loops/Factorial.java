package wbl.assignment.Loops;

public class Factorial {
	public void getFactorial(int num){
		int fact=1;
		for (int i=num;i>=1;i--){
			fact= fact*i;
		}
		
		System.out.println("factorial of  number "+num +" is: "+fact);
	}
	
  public int factrecursion(int num){
		  	if (num==1){
	  		return 1;
	  	}else {
	  		return num*factrecursion(num-1);
	  	}
	  
  }

	public static void main(String[] args) {
		Factorial f=new Factorial();
		f.getFactorial(2);
		System.out.println(f.factrecursion(5));

	}
}
