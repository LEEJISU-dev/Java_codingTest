import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String str = ""; // 입력받은 문자열
		int a = 0;		// 첫번째 상수
		int b = 0;		// 두번째 상수
		int cnt = 100;
		Scanner sc = new Scanner(System.in);
		str = sc.next();

		for (int i = 2; i >= 0; i--) {
			a += ((int) str.charAt(i) - 48) * cnt;
			cnt = cnt / 10;

		}
		str = sc.next();
		cnt = 100;
		for (int i = 2; i >= 0; i--) {
			b += ((int) str.charAt(i) - 48) * cnt;
			cnt = cnt / 10;
		}
		if (a >= b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}

	}

}
