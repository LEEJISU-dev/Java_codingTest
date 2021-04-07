import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n = 0, k = 0; // 동전 종류, 동전의 합
		int cnt = 0; // 동전 갯수
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		k = sc.nextInt();

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt(); // 입력받은 동전
		}

		for (int i = n-1; i >= 0; i--) {
			if (arr[i] <= k) {
				cnt += k / arr[i];
				k = k % arr[i];
			}
		}
		System.out.println(cnt);

	}

}
