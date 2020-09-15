import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a = 0; // 설탕의 무게
		int cnt = 0; // 배달해야 할 봉지
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();

		while (true) {
			if (a % 5 == 0) {
				System.out.println(a / 5 + cnt);
				break;
			} else if (a <= 0) {
				System.out.println(-1);
				break;
			}
			a = a - 3;
			cnt++;
		}

	}

}
