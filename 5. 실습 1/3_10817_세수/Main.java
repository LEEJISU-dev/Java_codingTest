import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a = 0, b = 0, c = 0;

		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if (a >= b) {
			if (a >= c) {
				if (b >= c) {
					System.out.println(b);
				} else if (b < c) {
					System.out.println(c);
				}
			} else if (a < c) {
				System.out.println(a);
			}
		} else if (a < b) {
			if (b >= c) {
				if (a >= c) {
					System.out.println(a);
				} else if (a < c) {
					System.out.println(c);
				}
			} else if (b < c) {
				System.out.println(b);
			}
		}

		System.out.println();

	}

}