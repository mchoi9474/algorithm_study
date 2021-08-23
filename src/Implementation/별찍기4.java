package Implementation;

import java.util.Scanner;

public class 별찍기4 {

	public static void main(String[] args) {
//		첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제
//		하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int row = N; row > 0; row --) {
			for(int i = N; i > row; i--) {
				System.out.printf(" ");
			}
			for(int col = row; col > 0; col--) {
				System.out.printf("*");
			}
			System.out.println("");
		}
	}

}
