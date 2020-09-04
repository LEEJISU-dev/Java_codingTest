import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a;	// 시
		int b;	// 분

		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();

		int m = b - 45;	// -45분
		if (m >= 0) {
			System.out.println(a + " " + m);
		} else if (m < 0) {
			int h = a - 1;
			m = m + 60;
			if (h < 0) {
				h = 23;
				System.out.println(h + " " + m);
			} else {
				System.out.println(h + " " + m);
			}

		}

	}

}