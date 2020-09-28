import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int input = 0; // 입력받은 수의 개수
		int n = 0; // 입력받은 수(소수인지 판별)
		int tmp = 0;	// 나누어 떨어지는 수 카운트
		int count = 0; // 소수 카운트

		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();

		for (int i = 0; i < input; i++) {
			n = sc.nextInt();
			for (int j = 2; j <= n; j++) {
				if (n % j == 0) {
					tmp++;
				}
			}
			if (tmp < 2) {
				count++;
				if (n == 1) {
					count--;
				}
			}
			tmp = 0;
		}
		System.out.println(count);

	}

}
