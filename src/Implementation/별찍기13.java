package Implementation;

import java.util.Scanner;

public class º°Âï±â13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int row = 1; row < N; row ++) {
			for(int star = 0; star < row; star++) {
				System.out.printf("*");
			}
			System.out.println("");
		}
		for(int row = N; row > 0; row --) {
			for(int star = 0; star < row; star++) {
				System.out.printf("*");
			}
			System.out.println("");
		}

	}

}
