package wbl.assignment.Arrays;
public class ArrayMerger {
	public  void Merge() {
		int a[]={1,2,3,4,5};
		int m=a.length;
		int b[]={6,7,8,9,10};
		int n=b.length;
		int c[]=new int[10];

		for(int i=0;i<m;i++){

			c[i]=a[i];
		}

		for(int j=0;j<n;j++){

			c[m+j]=b[j];

		}
		for(int i=0;i<c.length;i++){

			System.out.println(c[i]);
		}
	}

	public static void main(String[] args){
		ArrayMerger m = new ArrayMerger();
		m.Merge();	
	}
}