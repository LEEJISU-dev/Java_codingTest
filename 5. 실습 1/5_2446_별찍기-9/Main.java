import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a;

		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();

		for (int i = a; i >1; i--) {
			for (int j = a; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = (2 * i) - 1; k > 0; k--) {
				System.out.print("*");
			}

			System.out.println();
		}

		for (int i = 1; i <= a; i++) {
			for (int j = a; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < (2 * i) - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}