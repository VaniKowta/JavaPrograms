//Write a program to sort an array
package wbl.assignment.Arrays;
public class SortArray {
	public void getSort(int[] a){
		int temp =0;
		for(int i=a.length-1;i>=0;i--){  //bubble sort
			for(int j=1;j<=i;j++){
				if (a[j-1]<a[j]){
					temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
				System.out.println(String.format("i=%1d, j=%2d, a = {%3d,%4d,%5d,%6d,%7d,%8d,%9d, %10d}", i,j,a[0],a[1],a[2],a[3],a[4],a[5],a[6],a[7]));				
			}
		}

		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}

	}
	public static void main(String[] args) {
		int[] arr ={2,6,1,-10,-20,15,12,4};
		SortArray s =new SortArray();
		s.getSort(arr);
	}
}

