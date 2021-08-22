package Implementation;

import java.util.Scanner;

public class 별찍기2 {

	public static void main(String[] args) {
		//첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제 
		//하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		for(int row = 1; row <= N; row++) {
			if(row < N) {
				for(int nul = (N-row); nul > 0; nul--) {
					System.out.printf(" ");
				}
			}
			for(int col = 1;  col <= row; col++) {
				
				System.out.printf("*");
			}
			System.out.println("");
		}
	}

}
