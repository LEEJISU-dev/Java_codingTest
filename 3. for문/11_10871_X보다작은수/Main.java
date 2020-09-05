import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n, x;
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		x = sc.nextInt();
		int a;
		for (int i = 0; i < n; i++) {
			a = sc.nextInt();
			if (x > a) {
				System.out.print(a+" ");
			}
		}
	}

}