import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a;	// 입력받을 수
		int min;	// 최소값
		int max;	// 최대값

		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		int n[] = new int[a];

		for (int i = 0; i < a; i++) {
			n[i] = sc.nextInt();

		}
		max = n[0];
		min = n[0];
		for (int i = 1; i < a; i++) {
			if (max <= n[i]) {
				max = n[i];
			}
			if (min >= n[i]) {
				min = n[i];
			}
		}
		System.out.println(min+ " " +max );
	}

}