// Write a program to find the missing number in a series of sorted numbers stored in an array.
package wbl.assignment.Arrays;

public class MissingNumber {
	
	public  static int sumOfNum(int n) {
		int sum=(n*(n+1))/2;
		return sum;
	}

	public static int sumOfArr(int[]arr){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum = sum+arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int n=7;
		int[]a={1,2,3,4,6,7};
		int sumOfNum= sumOfNum(n);
		int sumOfArr=sumOfArr(a);
		int missingno=sumOfNum-sumOfArr;
		System.out.println("the missing number of array is  "+missingno);
	}
}
