import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a;		// 입력받은 정수
		int sum = 1;	// 계산 결과
		int count = 0;	// 0-9까지의 수가 몇번 쓰였는지 카운트
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			a = sc.nextInt();
			sum = sum * a;
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < Integer.toString(sum).length(); j++) {
				if (Integer.toString(sum).charAt(j) == Integer.toString(i).charAt(0)) {
					count++;
				}
			}
			System.out.println(count);
			count = 0;
		}
	}

}