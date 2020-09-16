import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int x = 0; // 입력된 정수
		int line = 0; // 대각선 줄
		int a = 1; // 분자
		int b = 1; // 분모
		int cnt = 0; // 몇번째인지
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();

		while (cnt < x) {
			line++;
			cnt = line * (line + 1) / 2;	// 등차수열의 법칙
		}

		if (line % 2 == 0) {
			a = line - (cnt - x);
			b = 1 + (cnt - x);
			System.out.println(a + "/" + b);
		} else {
			a = 1 + (cnt - x);
			b = line - (cnt - x);
			System.out.println(a + "/" + b);
		}

	}

}
