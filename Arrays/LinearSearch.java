/* Write a program to perform a linear search on any given array.
Linear search is the basic search where you look for the element 
to be searched in a sequential way.*/

package wbl.assignment.Arrays;
public class LinearSearch {
	public static int linearsearch(int []arr,int searchelement){
		for(int i =0;i<arr.length;i++){
			if( arr[i]== searchelement){
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int []arr = {4,5,6,7,8,9};
		int search = linearsearch(arr,8);
		System.out.println("the search element index is:"+search);
	}
}