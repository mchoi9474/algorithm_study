package Implementation;

import java.util.ArrayList;
import java.util.Scanner;

public class 그대로출력하기 {

	public static void main(String[] args) {
		//입력 받은 대로 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		ArrayList<String> inputs = new ArrayList<>();
		
		while(sc.hasNextLine()) {
			String input = sc.nextLine();
			if(input == null || input.isEmpty()) {
				break;
			}
			inputs.add(input);
		}
		sc.close();
		
		for(int i = 0; i < inputs.size(); ++i) {
			System.out.println(inputs.get(i));
		}
	}

}
