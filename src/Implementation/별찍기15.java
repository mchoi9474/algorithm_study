package Implementation;

import java.util.Scanner;

public class º°Âï±â15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int row = 1; row <= N; row++) {
			for(int nul = 0; nul < (N-row); nul++) {
				System.out.printf(" ");
			}
			System.out.printf("*");
			for(int nul1 = 2; nul1 < (row*2-1); nul1++) {
				System.out.printf(" ");
			}
			if(row > 1) {
				System.out.printf("*");
			}
			System.out.println("");
		}
				
		

	}

}
