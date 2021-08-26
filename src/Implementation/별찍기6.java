package Implementation;

import java.util.Scanner;

public class º°Âï±â6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int row = 0; row < N; row ++) {
			for(int nul = 0; nul < row; nul++) {
				System.out.printf(" ");
			}
			for(int star = 0; star < ((N-row)*2-1); star++) {
				System.out.printf("*");
			}
			System.out.println("");	
		}
	}

}
