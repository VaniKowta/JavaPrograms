
// Write a program to find the common number in any given two arrays.
package wbl.assignment.Arrays;
public class CommonElement {
	public static void main(String[] args) {
		int [] arr1 = {1,2,4,6,7,9,10};
		int [] arr2 = {2,4,7,10,11,5};
		for(int i =0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr1[i]==arr2[j]){
					System.out.println(arr2[j]);
				}
			}
		}
	}
}
