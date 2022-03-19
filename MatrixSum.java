import java.util.Scanner;
public class MatrixSum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [][] A = new int [2][3];
		int [][] B = new int [2][3];
		System.out.println("Enter Elements of A mattrix:");
		//Getting input A matrix
		for(int row=0;row<2;row++) {
			for(int col=0;col<3;col++) {
				System.out.printf("A[%d][%d] = ",row,col);
				A[row][col] = input.nextInt();
			}
		}
		System.out.println("Enter Elements of B mattrix:");
		//getting input for B matrix
		for(int row=0;row<2;row++) {
			for(int col=0;col<3;col++) {
				System.out.printf("B[%d][%d] = ",row,col);
				B[row][col] = input.nextInt();
			}
		}
		//printing A matrix
		System.out.println("A = ");
		for(int row=0;row<2;row++) {
			for(int col=0;col<3;col++) {
				System.out.print("\t "+A[row][col]);
			}
			System.out.println();
		}
		//printing B matrix
		System.out.println("B = ");
		for(int row=0;row<2;row++) {
			for(int col=0;col<3;col++) {
				System.out.print("\t "+B[row][col]);
			}
			System.out.println();
		}
      // Summation of A+B
		System.out.println("A + B =");
		for(int row=0;row<2;row++) {
			for(int col=0;col<3;col++) {
				System.out.print("\t "+(A[row][col]+B[row][col]));
			}
			System.out.println();
		}

	}

}
