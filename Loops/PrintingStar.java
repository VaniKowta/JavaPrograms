package wbl.assignment.Loops;

public class PrintingStar {
		public void PrintStar(int n){
			for (int i=1;i<=n;i++){
				for(int j=1;j<=i;j++){
					System.out.print("*");
				}
				System.out.println();
			}
		}

		public static void main(String[] args) {
			PrintingStar ps=new PrintingStar();
			ps.PrintStar(10);

		}

}
