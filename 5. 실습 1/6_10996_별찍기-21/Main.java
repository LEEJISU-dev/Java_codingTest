import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n;

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		for (int i = 0; i < n * 2; i++) {
			for (int j = 0; j < n; j++) {
				if (i % 2 == 0) {
					if (j % 2 == 0) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				} else {
					if (j % 2 == 0) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}

			}
			System.out.println();
		}
	}

}
