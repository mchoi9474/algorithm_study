package Implementation;

import java.util.Scanner;

public class º°Âï±â9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int row = N; row > 0; row --) {
			for(int star = 0; star < N-row; star++) {
				System.out.printf(" ");
			}
			for(int star = 0; star < row * 2 - 1; star++) {
				System.out.printf("*");
			}
			System.out.println(" ");
			
		}
		for(int row = 2; row <= N; row ++) {
			for(int star = 0; star < N-row; star++) {
				System.out.printf(" ");
			}
			for(int star = 0; star < row * 2 - 1; star++) {
				System.out.printf("*");
			}
			 System.out.println(" ");
			
		}

	}
}
