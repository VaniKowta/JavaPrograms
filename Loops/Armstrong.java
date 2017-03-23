package wbl.assignment.Loops;

public class Armstrong {
	public static void main(String[] args){
		
	int n =100;
	int temp = n;
	int r,sum = 0;
	
	while(n>0){
	r=n%10;
	sum=sum+r*r*r;
	n=n/10;
		
	}
	if(temp==sum){
		System.out.println("Armstrong number");
	}else{
		System.out.println("not an armstrong number");
	}
	}
}
