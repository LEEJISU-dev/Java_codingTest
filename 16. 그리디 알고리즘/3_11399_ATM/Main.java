import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n = 0; // 사람의 수
		int min_time = 0; // 인출 최소 시간
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		int time[] = new int[n];
		for (int i = 0; i < n; i++) {
			time[i] = sc.nextInt(); // 1명당 인출하는 시간
		}
		// 인출하는 시간을 오름차순으로 정렬
		Arrays.sort(time);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				min_time += time[j];
			}
			min_time += time[i];
		}
		System.out.println(min_time);

	}

}
