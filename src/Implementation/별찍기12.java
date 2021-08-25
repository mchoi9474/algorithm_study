package Implementation;

import java.util.Scanner;

public class º°Âï±â12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int row= 1; row <= N; row++) {
			for(int nul = 0; nul < (N-row); nul++) {
				System.out.printf(" ");
			}
			for(int star= 0; star < row; star++) {
				System.out.printf("*");
			}
			System.out.println("");
		}
		for(int row1 = (N-1); row1 > 0; row1 --) {
			for(int nul = 0; nul < (N-row1); nul++) {
				System.out.printf(" ");
			}
			for(int star= 0; star < row1; star++) {
				System.out.printf("*");
			}
			System.out.println("");
		}

	}

}
