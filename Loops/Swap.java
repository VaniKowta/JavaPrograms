package wbl.assignment.Loops;
import java.util.Scanner;

public class Swap {

	public  void Swap_temp(int x,int y)
	{
		int temp;
		/*System.out.println("Enter x and y");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();*/
		System.out.println("Before Swapping x = "+x);
		System.out.println("Before Swapping y = "+y);
		temp = x;
		x = y;
		y = temp;
		System.out.println("After Swapping x = "+x);
		System.out.println("After Swapping y = "+y);
	}
	public void Swap_withoutTemp(int x, int y)
	{
		/*System.out.println("Enter x and y");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();*/
		System.out.println("Before Swapping x = "+x);
		System.out.println("Before Swapping y = "+y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After Swapping x = "+x);
		System.out.println("After Swapping y = "+y);
	}
	public static void main(String args[]){
		Swap t = new Swap();
		t.Swap_temp(2,6);
		t.Swap_withoutTemp(6, 7);

	}
}
