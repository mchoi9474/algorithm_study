package Implementation;

import java.util.Arrays;
import java.util.Scanner;

public class 세수 {

	public static void main(String[] args) {
		// 세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오. 
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[3];
		for(int i = 0; i < 3 ;i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(arr);
		System.out.println(arr[1]);
	}

}
