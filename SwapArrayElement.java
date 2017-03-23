
/* Write a program to locate and swap only 2 elements which are not 
sorted in a given sorted array. For example given an array {1,2,5,6,4} locate 5 and 4 and 
then swap them as they are not as per sorted order.*/

package wbl.assignment.Arrays;

public class SwapArrayElement {
	public void SwapElement(){

		int[] arr = {1,2,5,6,4};
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		int a=2;
		int b=4;
		int  temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;

		for(int i=0;i<arr.length;i++){

			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		SwapArrayElement swe = new SwapArrayElement();
		swe.SwapElement();


	}

}
