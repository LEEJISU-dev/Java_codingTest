import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n = 0;

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		System.out.println(arithmetic(n));

	}

	public static int arithmetic(int num) {
		int cnt = 0; // 한수 카운팅

		// 100이하일 경우 (1~99까지는 등차수열)
		if (num < 100) {
			return num;
		} else {
			cnt = 99; // 1~99까지는 등차수열임으로
			if (num == 1000) {
				num = 999;
			}

			for (int i = 100; i <= num; i++) {
				int hun = i / 100; // 백의 자리수
				int ten = (i / 10) % 10; // 십의 자리수
				int one = i % 10; // 일의 자리수

				// 각 자리수가 수열을 이루면 카운트업
				if ((hun - ten) == (ten - one)) {
					cnt++;
				}
			}
		}
		return cnt;
	}

}
