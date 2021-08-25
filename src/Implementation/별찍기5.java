package Implementation;

import java.util.Scanner;

public class 별찍기5 {

	public static void main(String[] args) {
		// 첫째 줄에는 별 1개, 둘째 줄에는 별 3개, ..., N번째 줄에는 별 2×N-1개를 찍는 문제
		//별은 가운데를 기준으로 대칭이어야 한다.
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int row = 1; row <= N; row ++) {
			for(int nul = 0; nul <(N- row); nul++) {
				System.out.printf(" ");
			}
		for(int star = 0; star < (row*2-1); star++) {
			System.out.printf("*");
			
			}
		System.out.println(" ");
		}
	}

}
