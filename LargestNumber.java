
//Write a program to find the largest number in a given array.
package wbl.assignment.Arrays;
public class LargestNumber {
	public void Larger(){
		int numbers[] = new int[] {32,43,10,15,18,99,67,45,100};
		int largest = numbers[0];
		for(int i=1;i<numbers.length;i++){
			if(numbers[i] > largest)
				largest = numbers[i];	
		}
		System.out.println("Largest number is :" +largest);
	}
	public static void main(String[] args){
		LargestNumber ln = new LargestNumber();
		ln.Larger();

	}
}



