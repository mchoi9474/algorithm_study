package Implementation;

import java.util.Scanner;

public class A더하기B4 {

	public static void main(String[] args) {
		//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println(A+B);
		}
		
	}

}
