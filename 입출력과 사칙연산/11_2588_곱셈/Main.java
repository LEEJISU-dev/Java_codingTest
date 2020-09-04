import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a;	// (1) 세자리수
		int b;	// (2) 세자리수

		int h, t, o;

		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();

		h = b / 100;		// (2)의 백의 자리
		t = (b % 100) / 10;		// (2)의 십의 자리
		o = (b % 100 % 10);	// (2)의 일의 자리

		System.out.println(a * o);	// (3)번의 값
		System.out.println(a * t);	// (4)번의 값
		System.out.println(a * h);	// (5)번의 값
		System.out.println(a * b);	// (6)번의 값

	}

}