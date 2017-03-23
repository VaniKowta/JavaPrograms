package wbl.assignment.Loops;


/*Prime number is a number that is greater than 1 and divided by 1 or itself. 
In other words, prime numbers can't be divided by other numbers than itself or 1*/

public class PrimeNumber {
	int n=100;
	public void Prime(int x){
		for(x=2; x<=n ;x++){
			if(x%2==0)
			{
				System.out.println("its not prime"+x);
			}
			else{
				System.out.println("its prime"+x);
			}
		}
	}
	public static void main(String args[]){
		PrimeNumber p = new PrimeNumber();
		p.Prime(7);
		
	}	
}


