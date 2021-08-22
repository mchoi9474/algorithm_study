package Implementation;
import java.util.Scanner;

public class 별찍기1 {
	public static void main(String[] args) {
		//첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		sc.close();
		for(int row = 1; row <= A; row++) {
			for(int col = 1; col <= row; col++){
				System.out.printf("*");
			}
			System.out.println();
		}
	}

}
