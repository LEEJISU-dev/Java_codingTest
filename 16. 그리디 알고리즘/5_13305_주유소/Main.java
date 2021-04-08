import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n; // 도시의 개수
		long result = 0; // 주유의 총 비용
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		long[] dist = new long[n - 1];
		long[] price = new long[n];
		for (int i = 0; i < n - 1; i++) {
			dist[i] = sc.nextLong();
		}
		for (int i = 0; i < n; i++) {
			price[i] = sc.nextLong();
		}

		long minPrice = price[0]; // 이전까지 과정중 주유 최소 비용
		for (int i = 0; i < n - 1; i++) {
			// 현재가 이전보다 쌀 경우, 최소비용 갱신
			if (price[i] < minPrice) {
				minPrice = price[i];
			}
			result += minPrice * dist[i];
		}
		System.out.println(result);
	}

}
