
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n;// 입력받을 정수의 수
		
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		
		// 입력값의 범위 : -4000 ~ 4000
		int arr[] = new int[8001];
		int sum = 0; // 총 합계
		int max = Integer.MIN_VALUE; // 최댓값
		int min = Integer.MAX_VALUE; // 최솟값
		int median = 10000; // 중앙값
		int mode = 10000; // 최빈값
		
		for (int i = 0; i < n; i++) {
			int value = sc.nextInt();
			sum += value;
			arr[value + 4000]++;

			if (max < value) {
				max = value;
			}
			if (min > value) {
				min = value;
			}
		}

		// 순회
		int cnt = 0;// 중앙값 빈도 누적 수
		int modeMax = 0;// 최빈값의 최댓값

		// 이전의 동일한 최빈값이 한번만 등장했을 경우 true
		boolean flag = false;

		for (int i = min + 4000; i <= max + 4000; i++) {
			if (arr[i] > 0) {
				/*
				 * 중앙값 찾기 - 누적횟수가 전체 길이의 절반에 못 미친다면
				 */
				if (cnt < (n + 1) / 2) {
					cnt += arr[i]; // i값의 빈도수를 cnt 에 누적
					median = i - 4000;
				}

				/*
				 * 최빈값 찾기 - 이전 최빈값보다 현재 값의 빈도수가 더 높을 경우
				 */
				if (modeMax < arr[i]) {
					modeMax = arr[i];
					mode = i - 4000;
					flag = true; // 첫 등장이므로 true로 변경
				} 
				// 이전 최빈값 최대값과 동일한 경우면서 한번만 중복되는 경우
				else if (modeMax == arr[i] && flag == true) {
					mode = i - 4000;
					flag = false;
				}
			}
		}

		System.out.println((int) Math.round((double) sum / n)); // 산술평균
		System.out.println(median); // 중앙값
		System.out.println(mode); // 최빈값
		System.out.println(max - min); // 범위

	}

}
