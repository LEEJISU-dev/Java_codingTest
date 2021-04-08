import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n = 0; // 회의의 수
		int cnt = 0; // 회의의 최대 개수
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		int[][] arr = new int[n][2];
		for (int i = 0; i < n; i++) {
			arr[i][0] = sc.nextInt(); // 회의 시작시간
			arr[i][1] = sc.nextInt(); // 회의 끝시간
		}
		// 끝나는 시간을 기준으로 오름차순 정렬
		Arrays.sort(arr, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// 종료시간이 같을 경우, 시작시간이 빠른 순으로 정렬
				if (o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}
				return o1[1] - o2[1];
			}
		});
		int pre_end_T = 0;	// 직전 종료 시간
		
		for (int i = 0; i < n; i++) {
			// 직전 종료시간이 다음 회의 시작시간 보다 작거나 같으면 +1
			if(pre_end_T <= arr[i][0]) {
				pre_end_T = arr[i][1];
				cnt++;
			}
		}
		System.out.println(cnt);

	}

}
