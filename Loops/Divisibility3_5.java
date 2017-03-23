package wbl.assignment.Loops;
public class Divisibility3_5 {
	
	public void divisible(int n){
	
		if(n % 3 == 0)

		{
		System.out.println(n + "Ping");
		}

		if(n%5==0)

		{
			System.out.println(n + "Pong");
		}

		if(n%3==0&&n%5==0){
			System.out.println("PingPong");
		}
		
		else {
		System.out.println(n);
	}

	}

public static void main(String args[]){
	
	Divisibility3_5 n = new Divisibility3_5();
	n.divisible(25);
}
}

	
	

